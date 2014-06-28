package nl.fontys.fhict.jea.gwt.jee7.client.vc;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;    
import com.google.gwt.user.client.ui.PushButton;    
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwtupload.client.MultiUploader;
import java.util.Date;
import java.util.List;
import nl.fontys.fhict.jea.gwt.jee7.client.Messages;
import nl.fontys.fhict.jea.gwt.jee7.client.koch.KochController;
import nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView;
import nl.fontys.fhict.jea.gwt.jee7.client.leader.LeaderController;
import nl.fontys.fhict.jea.gwt.jee7.client.leader.LeaderView;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;
import org.moxieapps.gwt.highcharts.client.Series;
import org.moxieapps.gwt.highcharts.client.Series.Type;
import org.moxieapps.gwt.highcharts.client.StockChart;

public class KwetterDashboardView extends Composite {

    
    private final TextBox tweetInputTextBox;
    private final PushButton sendTweetButton;
    private final HTML tweetsOverviewHTML;
    private final ListBox followersListBox;
    private final ListBox leadersListBox;
    private final ListBox unLeaderListbox;
    private final ListBox makeLeaderListbox;
    private final HorizontalPanel horizontalPanel;
    private final VerticalPanel leftVerticalPanel;
    private final VerticalPanel rightVerticalPanel;
    private final Label leadersLabel;
    private final Label followersLabel;
    private final Label tweetsLabel;
    private final TabPanel tabPanel;
    private final Canvas activityCanvas;
    private final HorizontalPanel leaderPanel;
    private final StockChart stockChart;
    private final FormPanel uploadForm;
    private Image image;
    
    private final PushButton monthFilterButton;
    private final PushButton dayFilterButton;

    public Canvas getCanvas() {
        return activityCanvas;
    }

    public TextBox getTweetInputTextBox() {
        return tweetInputTextBox;
    }
    
    public PushButton getMonthFilterButton(){
        return this.monthFilterButton;
    }
    
    public PushButton getDayFilterButton(){
        return this.dayFilterButton;
    }
   
    public PushButton getSendTweetButton() {
        return sendTweetButton;
    }

    public HTML getTweetsOverviewHTML() {
        return tweetsOverviewHTML;
    }

    public ListBox getFollowersListBox() {
        return followersListBox;
    }

    public ListBox getLeadersListBox() {
        return leadersListBox;
    }

    public Label getLeadersLabel() {
        return leadersLabel;
    }

    public Label getFollowersLabel() {
        return followersLabel;
    }

    public Label getTweetsLabel() {
        return tweetsLabel;
    }

    public TabPanel getTabPanel() {
        return tabPanel;
    }

    public ListBox getMakeLeaderListbox()
    {
        return makeLeaderListbox;
    }

    public ListBox getUnLeaderListbox()
    {
        return unLeaderListbox;
    }
    
    public StockChart getStockChart(){
        return this.stockChart;
    }
    
    public FormPanel getUploadForm(){
        return this.uploadForm;
    }
    
    public Image getImage(){
        return this.image;
    }

    public KwetterDashboardView() {

        tabPanel = new TabPanel();
        initWidget(tabPanel);
        tabPanel.setSize("800px", "600px");
        horizontalPanel = new HorizontalPanel();
        tabPanel.add(horizontalPanel, "Tweets", false);
        horizontalPanel.setSize("800px", "600px");

        leftVerticalPanel = new VerticalPanel();
        rightVerticalPanel = new VerticalPanel();
        horizontalPanel.add(leftVerticalPanel);
        leftVerticalPanel.setSize("100px", "600px");

        uploadForm = new FormPanel();
        uploadForm.setAction("http://localhost:8080/KwettaaahGWT/upload");
        uploadForm.setEncoding(FormPanel.ENCODING_MULTIPART);
        uploadForm.setMethod(FormPanel.METHOD_POST);

        VerticalPanel panel = new VerticalPanel();
        uploadForm.setWidget(panel);
        // Create a TextBox, giving it a name so that it will be submitted.

         // Create a ListBox, giving it a name and some values to be associated
        // with its options.

        // Create a FileUpload widget.
        FileUpload upload = new FileUpload();
        upload.setName("uploadFormElement");
        panel.add(upload);

        // Add a 'submit' button.
        panel.add(new Button("Submit", new ClickHandler() {
            public void onClick(ClickEvent event) {
                uploadForm.submit();
                
            }
        }));

        // Add an event handler to the form.
        uploadForm.addSubmitHandler(new FormPanel.SubmitHandler() {

            @Override
            public void onSubmit(FormPanel.SubmitEvent event) {
                
              
            }
        });

        leftVerticalPanel.add(uploadForm);

        leadersLabel = new Label("Leaders");
        leadersLabel.setStyleName(".captionText");
        leftVerticalPanel.add(leadersLabel);

        leadersListBox = new ListBox();
        leftVerticalPanel.add(leadersListBox);
        leadersListBox.setSize("80px", "220px");

        leadersListBox.setVisibleItemCount(10);

        followersLabel = new Label("Followers");
        followersLabel.addStyleName(".captionText");
        leftVerticalPanel.add(followersLabel);
        followersListBox = new ListBox();

        followersListBox.setVisibleItemCount(10);
        leftVerticalPanel.add(followersListBox);
        followersListBox.setSize("80px", "220px");
        horizontalPanel.add(rightVerticalPanel);
        rightVerticalPanel.setSize("400px", "600px");

        tweetsLabel = new Label("Tweets");
        tweetsLabel.setStyleName(".captionText");
        rightVerticalPanel.add(tweetsLabel);

        ScrollPanel scrollPanel = new ScrollPanel();
        rightVerticalPanel.add(scrollPanel);
        scrollPanel.setHeight("453px");

        tweetsOverviewHTML = new HTML("", true);
        scrollPanel.setWidget(tweetsOverviewHTML);
        tweetsOverviewHTML.setSize("687px", "450px");
        
        
        HorizontalPanel activityPanel = new HorizontalPanel();
                
        panel.setSize("800px", "900px");
        
        stockChart = new StockChart()
                .setChartTitleText("Kwettah Activity Monitor")
                .setType(Type.LINE);
                
        
        stockChart.setHeight("600px");
        stockChart.setWidth("800px");
        
        activityPanel.add(stockChart);
        monthFilterButton = new PushButton("Month");
        monthFilterButton.setSize("200px", "100px");
        activityPanel.add(monthFilterButton);
        
        dayFilterButton = new PushButton("Day");
        dayFilterButton.setSize("200px", "100px");
        activityPanel.add(dayFilterButton);
               
        
       tabPanel.add(activityPanel, "Kwettah chart", false);
        //tabPanel.add(stockChart, "Kwettah chart", false);
              
        activityCanvas = Canvas.createIfSupported();
        if (activityCanvas != null) {
            activityCanvas.setWidth("800px");
            activityCanvas.setHeight("600px");
            tabPanel.add(activityCanvas, "Activity monitor", false);
        }     
        
         /**
         * Leader view
         */
        leaderPanel = new HorizontalPanel();
        tabPanel.add(leaderPanel, "Leaders", false);
        leaderPanel.setSize("687px", "450px");

        unLeaderListbox = new ListBox();
        leaderPanel.add(unLeaderListbox);
        unLeaderListbox.setSize("80px", "220px");
        unLeaderListbox.setVisibleItemCount(10);

        makeLeaderListbox = new ListBox();
        leaderPanel.add(makeLeaderListbox);
        makeLeaderListbox.setSize("80px", "220px");
        makeLeaderListbox.setVisibleItemCount(10);

        
        final KochView kochView = new KochView();
        new KochController(kochView);
        
        tabPanel.add(kochView, "Koch Fractal", false);

        HorizontalPanel tweetHP = new HorizontalPanel();
        rightVerticalPanel.add(tweetHP);

        tweetInputTextBox = new TextBox();
        tweetInputTextBox.setText("type new tweet here");
        tweetHP.add(tweetInputTextBox);
        tweetInputTextBox.setSize("650px", "22px");

        sendTweetButton = new PushButton("send");
        tweetHP.add(sendTweetButton);
        sendTweetButton.setSize("30px", "20px");

        tabPanel.setAnimationEnabled(true);
        tabPanel.selectTab(0, true);

    }

    public void showTweets(String title, List<Tweet> tweets) {
        String html = "<h4>" + title + "</h4></br>";

        for (Tweet t : tweets) {
            html += "</i>" + new Date(t.getCreationTimeMillis()).toString() + " <b> " + t.getAuthor().getUserName() + "</b></i>: " + t.getText() + "</br>";
        }

        getTweetsOverviewHTML().setHTML(html);
    }

    public void addLeader(User user) {
        leadersListBox.addItem(user.getUserName());
    }

    public void addFollower(User user) {
        followersListBox.addItem(user.getUserName());
    }

    public void addNotLeader(User user) { makeLeaderListbox.addItem(user.getUserName());}

    public void addRemoveLeader(User user) { unLeaderListbox.addItem(user.getUserName());}
    
    public void setImage(Image image){
        this.image = image;
    }

}
