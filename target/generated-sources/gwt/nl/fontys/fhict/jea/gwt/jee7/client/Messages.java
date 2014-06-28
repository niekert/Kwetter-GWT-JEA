package nl.fontys.fhict.jea.gwt.jee7.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/Niek/Documents/IntellijProjects/KwettaaahGWT/src/main/resources/nl/fontys/fhict/jea/gwt/jee7/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "oops... something went wrong".
   * 
   * @return translated "oops... something went wrong"
   */
  @DefaultMessage("oops... something went wrong")
  @Key("errorField")
  String errorField();

  /**
   * Translated "enter your credentials to login".
   * 
   * @return translated "enter your credentials to login"
   */
  @DefaultMessage("enter your credentials to login")
  @Key("inputCredentialsField")
  String inputCredentialsField();

  /**
   * Translated "login failed".
   * 
   * @return translated "login failed"
   */
  @DefaultMessage("login failed")
  @Key("loginFailed")
  String loginFailed();

  /**
   * Translated "login succeeded!".
   * 
   * @return translated "login succeeded!"
   */
  @DefaultMessage("login succeeded!")
  @Key("loginSucceeded")
  String loginSucceeded();

  /**
   * Translated "password".
   * 
   * @return translated "password"
   */
  @DefaultMessage("password")
  @Key("passwordField")
  String passwordField();

  /**
   * Translated "send".
   * 
   * @return translated "send"
   */
  @DefaultMessage("send")
  @Key("sendButton")
  String sendButton();

  /**
   * Translated "Tweets of Follower".
   * 
   * @return translated "Tweets of Follower"
   */
  @DefaultMessage("Tweets of Follower")
  @Key("tweesOfUserField")
  String tweesOfUserField();

  /**
   * Translated "username".
   * 
   * @return translated "username"
   */
  @DefaultMessage("username")
  @Key("userNameField")
  String userNameField();
}
