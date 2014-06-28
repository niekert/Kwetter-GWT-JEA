/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.bus;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import nl.fontys.fhict.jea.gwt.jee7.server.user.UserServiceBean;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Niek
 */
@ManagedBean
public class FileUploadServlet extends HttpServlet {
        
    @Inject
    UserServiceBean serviceBean;

    private static final String UPLOAD_DIRECTORY = "/Users/Niek/Desktop/glassfish";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("working?");
        // process only multipart requests
        if (ServletFileUpload.isMultipartContent(req)) {

            // Create a factory for disk-based file items
            FileItemFactory factory = new DiskFileItemFactory();

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            // Parse the request
            try {
                List<FileItem> items = upload.parseRequest(req);
                for (FileItem item : items) {
                    // process only file upload - discard other form item types
                    if (item.isFormField()) {
                        continue;
                    }

                    String fileName = item.getName();
                    // get only the file name not whole path
                    if (fileName != null) {
                        fileName = FilenameUtils.getName(fileName);
                    }
                    
                    File uploadedFile = new File(UPLOAD_DIRECTORY, fileName);
                    uploadedFile.delete();
                    if (uploadedFile.createNewFile()) {
                        item.write(uploadedFile);
                    } else {
                        throw new IOException("The file already exists in repository.");
                    }

                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    BufferedImage in = ImageIO.read(uploadedFile);
                    try {
                        ImageIO.write(in, "png", baos);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String imageString = "data:image/png;base64,"+ DatatypeConverter.printBase64Binary(baos.toByteArray());
                    serviceBean.setPicture(req.getRemoteUser(), imageString);
                    
                    
                    resp.setStatus(HttpServletResponse.SC_CREATED);
                    resp.setContentType("image/png");
                    resp.getWriter().print(imageString);
                    resp.flushBuffer();
                    
                }
            } catch (Exception e) {
                resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                        "An error occurred while creating the file : " + e.getMessage());
            }

        } else {
            resp.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE,
                    "Request contents type is not supported by the servlet.");
        }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
