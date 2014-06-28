package nl.fontys.fhict.jea.gwt.jee7.client;

import com.google.gwt.junit.client.GWTTestCase;
import junit.framework.Assert;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

/**
 * GWT JUnit <b>integration</b> tests must extend GWTTestCase.
 * Using <code>"GwtTest*"</code> naming pattern exclude them from running with
 * surefire during the test phase.
 * 
 * If you run the tests using the Maven command line, you will have to 
 * navigate with your browser to a specific url given by Maven. 
 * See http://mojo.codehaus.org/gwt-maven-plugin/user-guide/testing.html 
 * for details.
 */
public class GwtTestMain extends GWTTestCase {

  /**
   * Must refer to a valid module that sources this class.
   */
  public String getModuleName() {
    return "nl.fontys.fhict.jea.gwt.jee7.MainJUnit";
  }

  /**
   * Dummy test
   */
  public void testUserCreation() {
      User u = new User();
      Assert.assertNotNull(u);
  }


}
