/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jgeenen
 */
public class Encryption {
    
    private static final String SHA256_DIGEST_ALGORITHM_NAME="SHA-256";

    /**
     * Creates a SHA-256 BASE64 digest of a clear-text input.
     * @param input
     * @return the digested clear-text input
     */
    public static String SHA256_BASE64(String input){

        try {
            MessageDigest digest = MessageDigest.getInstance(SHA256_DIGEST_ALGORITHM_NAME);
            byte[] b_dp = digest.digest(input.getBytes());
            return Base64.encode(b_dp);
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException(SHA256_DIGEST_ALGORITHM_NAME + " is unavailable on your JDK", ex);
        }

    }
}
