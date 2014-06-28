/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.client.vc;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import java.util.Arrays;
import java.util.List;
import nl.fontys.fhict.jea.gwt.jee7.client.Main;
import nl.fontys.fhict.jea.gwt.jee7.client.Messages;
import nl.fontys.fhict.jea.gwt.jee7.client.user.LoginListener;
import nl.fontys.fhict.jea.gwt.jee7.client.user.UserServiceAsync;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

/**
 *
 * @author jgeenen
 */
public class LoginWidget extends DialogBox {
    
    private final LoginListener[] loginListeners;
    private User _user;
    
  /**
   * @param user
   * @param currentLevel
   * @param maxLevel
   * @return a tree-representation of the supplied user, with leaders/followers nested upto maxLevel
   */
  private static TreeItem createTree(final User user, final int currentLevel, final int maxLevel){
    //create the root for user, with singular properties
    TreeItem root = new TreeItem();
    root.setText(user.getUserName());
    root.addTextItem("password: " + user.getPassword());
    
    //add roles;
    TreeItem roles = new TreeItem();
    roles.setText("roles");
    for(Role role : user.getRoles()){
        roles.addTextItem(role.getRoleName());
    }
    root.addItem(roles);
    
    //add leaders and followers if nesting is not too deep
    if(currentLevel<maxLevel){
        List<String> userGroupNames = Arrays.asList("leaders","followers");
        List<List<User>> userGroups = Arrays.asList(user.getLeaders(),user.getFollowers());
        for(int i=0;i<2;i++){
            TreeItem userGroupTree = new TreeItem();
            userGroupTree.setText(userGroupNames.get(i));
            for(User leader : userGroups.get(i)){
                userGroupTree.addItem(createTree(leader, currentLevel+1,maxLevel));
            }
            root.addItem(userGroupTree);
        }
    }
    //add tweets
    TreeItem tweets = new TreeItem();
    tweets.setText("tweets");
    for(Tweet t : user.getTweets()){
        TreeItem tweet = new TreeItem();
        tweet.setText(t.getText());
        tweets.addItem(tweet);
    }
    root.addItem(tweets);
    
    return root;
    
  }

    
    
    private final Messages messages; 
    
    /*
     * widgets for login form
     */
    private final Grid startGrid = new Grid(2, 3);
    private final TextBox userNameField = new TextBox();
    private final TextBox passwordField = new PasswordTextBox();
    private final Button send;
    
    /*
     * widgets for error form
     */
    private final Button tryAgain = new Button("OK");
    private final HTML errorResponseLabel;
    
    
    /*
     * widgets for succeed form
     * 
     */
    private final Grid okGrid = new Grid(2, 1);
    private final Button okButton = new Button("OK");
    
    public void start(){
        this.clear();
        this.setHTML("<b>" + messages.inputCredentialsField() + "</b></br>");
        this.add(startGrid);
        userNameField.setFocus(true);
        this.center();
    }
    
    
    private void succeed(User user){
        Main.LOGOUT_BUTTON.setEnabled(true);
        //notify listeners
        for(LoginListener l : loginListeners){
            l.onLogin(user);
        }
        //show dialog to user
        this.clear();
        this.setHTML("<b>" + messages.loginSucceeded() + "</b></br>");
        okGrid.clear();
        TreeItem userTreeItem = createTree(user,0,2);
        Tree tree = new Tree();
        tree.addItem(userTreeItem);
        okGrid.setWidget(0, 0, tree);
        okGrid.setWidget(1, 0, okButton);
        this.add(okGrid);
        okButton.setFocus(true);
        this.center();
    }
    
    private void fail(Throwable caught){
        this.clear();
        this.setHTML("<b>" + messages.loginFailed() + "</b></br>");
        this.add(tryAgain);
        tryAgain.setFocus(true);
        this.center();
    }
    
    public LoginWidget(Messages messages, LoginListener... loginListeners){
        super();
        send = new Button(messages.sendButton());
        this.messages = messages;
        this.loginListeners=loginListeners;
        
        errorResponseLabel= new HTML(messages.errorField());
        errorResponseLabel.setStyleName(".serverResponseLabelError");
        
        startGrid.setHTML(0, 0, messages.userNameField());
        startGrid.setHTML(0, 1, messages.passwordField());
        startGrid.setWidget(1, 0, userNameField);
        startGrid.setWidget(1, 1, passwordField);
        startGrid.setWidget(1, 2, send);
        
        //add send listener
        send.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                LoginWidget.this.hide();
                UserServiceAsync.Util.getInstance().login(
                        userNameField.getText(), 
                        passwordField.getText(), 
                        //the handler for the AJAX response
                        new AsyncCallback<User>(){
                    @Override
                    public void onFailure(Throwable caught) {
                       LoginWidget.this.fail(caught);
                    }
                    @Override
                    public void onSuccess(User user) {
                        _user = user;
                        LoginWidget.this.succeed(user);
                    }
                });
            }
        });
        
        //add tryAgain listener
        tryAgain.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                LoginWidget.this.hide();
                start();
            }
        });
        
        okButton.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                LoginWidget.this.hide();
                KwetterDashboardView dashboard = new KwetterDashboardView();
                new KwetterDashboardController().setKwetterView(dashboard);
                RootPanel.get("dashboard").add(dashboard);
            }
        });
        
        //add a little eye candy
        this.setGlassEnabled(true);
        this.setAnimationEnabled(true);
    }
    
    
}
