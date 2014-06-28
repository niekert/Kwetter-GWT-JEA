/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.client.vc;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import nl.fontys.fhict.jea.gwt.jee7.client.Main;
import nl.fontys.fhict.jea.gwt.jee7.client.Messages;
import nl.fontys.fhict.jea.gwt.jee7.client.user.UserServiceAsync;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;
import nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetServiceAsync;
import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.Point;
import org.moxieapps.gwt.highcharts.client.Series;
import org.moxieapps.gwt.highcharts.client.Series.Type;
import org.moxieapps.gwt.highcharts.client.StockChart;

/**
 * @author jgeenen
 */
public class KwetterDashboardController {

    private final Messages messages = GWT.create(Messages.class);

    private static final Logger LOG = Logger.getLogger(KwetterDashboardController.class.getName());

    private KwetterDashboardView kwetterView;

    /**
     * Handles sending of new tweets to the server
     */
    private final ClickHandler sendTweetHandler = new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            kwetterView.getSendTweetButton().setEnabled(false);
            sendTweet();

        }
    };

    private final ClickHandler monthFilterHandler = new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            StockChart chart = kwetterView.getStockChart();
            Series series = chart.getSeries()[0];
            chart.removeAllSeries();
            series.setOption("dataGrouping/units", getMonthGrouping());

            chart.addSeries(series);
        }
    };

    private final ClickHandler dayFilterHandler = new ClickHandler() {

        @Override
        public void onClick(ClickEvent event) {
            StockChart chart = kwetterView.getStockChart();
            Series series = chart.getSeries()[0];
            chart.removeAllSeries();
            series.setOption("dataGrouping/units", getDayGrouping());

            chart.addSeries(series);
        }
    };

    private final ClickHandler leaderlistboxHandler = new ClickHandler() {

        @Override
        public void onClick(ClickEvent event) {
            int selected = kwetterView.getLeadersListBox().getSelectedIndex();
            User selectedUser = Main.INSTANCE().getUser().getLeaders().get(selected);
            kwetterView.showTweets("Tweets of LEADER " + selectedUser.getUserName(), selectedUser.getTweets());
        }
    };

    private final ClickHandler followerlistboxHandler = new ClickHandler() {

        @Override
        public void onClick(ClickEvent event) {
            int selected = kwetterView.getFollowersListBox().getSelectedIndex();
            User selectedUser = Main.INSTANCE().getUser().getFollowers().get(selected);
            kwetterView.showTweets(messages.tweesOfUserField() + " " + selectedUser.getUserName(), selectedUser.getTweets());
        }
    };

    private final DoubleClickHandler makeLeaderClickHandler = new DoubleClickHandler() {
        @Override
        public void onDoubleClick(DoubleClickEvent doubleClickEvent) {

            int selected = kwetterView.getMakeLeaderListbox().getSelectedIndex();
            String userName = kwetterView.getMakeLeaderListbox().getValue(selected);

            String myUserName = Main.INSTANCE().getUser().getUserName();
            UserServiceAsync.Util.getInstance().makeLeader(myUserName, userName, new AsyncCallback<User>() {
                @Override
                public void onFailure(Throwable throwable) {
                    Window.alert(throwable.getMessage());
                }

                @Override
                public void onSuccess(User user) {
                    if (user != null) {
                        Main.INSTANCE().getUser().getLeaders().add(user);
                        fillLeaderLists();
                    }
                }
            });
        }
    };

    private void sendTweet() {
        Tweet tweet = new Tweet();
        tweet.setAuthor(Main.INSTANCE().getUser());
        tweet.setCreationTimeMillis(new Date().getTime());
        tweet.setText(kwetterView.getTweetInputTextBox().getText());
        TweetServiceAsync.Util.getInstance().tweet(
                tweet,
                new AsyncCallback<Tweet>() {
                    @Override
                    public void onFailure(Throwable caught) {
                        kwetterView.getSendTweetButton().setEnabled(true);
                        Window.alert(caught.getMessage());
                    }

                    @Override
                    public void onSuccess(Tweet result) {
                        kwetterView.getTweetInputTextBox().setText("");
                        kwetterView.getSendTweetButton().setEnabled(true);
                        Main.INSTANCE().getUser().addTweet(result);
                        kwetterView.showTweets("My tweets", Main.INSTANCE().getUser().getTweets());
                    }
                }
        );
    }

    private final KeyDownHandler keyDownHandler = new KeyDownHandler() {
        @Override
        public void onKeyDown(KeyDownEvent event) {
            if (event.getNativeEvent().getKeyCode() == 13) {
                sendTweet();
            }
        }
    };

    public void setKwetterView(final KwetterDashboardView kwetterView) {
        this.kwetterView = kwetterView;
        kwetterView.getSendTweetButton().addClickHandler(sendTweetHandler);
        kwetterView.getTweetInputTextBox().addKeyDownHandler(keyDownHandler);

        /* leaderlistbox setup */
        kwetterView.getLeadersListBox().addClickHandler(leaderlistboxHandler);

        /* followerlistbox setup */
        kwetterView.getFollowersListBox().addClickHandler(followerlistboxHandler);
        for (User follower : Main.INSTANCE().getUser().getFollowers()) {
            kwetterView.addFollower(follower);
        }

        final Image image = new Image();
        RootPanel.get().add(image);
        image.setVisible(false);
        image.addLoadHandler(new LoadHandler() {
            @Override
            public void onLoad(LoadEvent event) {
                RootPanel.get().remove(image);
                image.setVisible(true);
                new CanvasAnimation(image, kwetterView.getCanvas()).start();
            }
        });
        image.setUrl(Main.INSTANCE().getUser().getPicture());
        kwetterView.setImage(image);
        kwetterView.showTweets("My tweets", Main.INSTANCE().getUser().getTweets());

        StockChart chart = kwetterView.getStockChart();
        Series series = chart.createSeries();
        series.setOption("dataGrouping/approximation", "sum");
        series.setOption("dataGrouping/forced", true);

        Object[] grouping = this.getMonthGrouping();
        series.setOption("dataGrouping/units", grouping);
        series.setName("Number of kwets");
        //        series.setOption("dataGrouping/units", grouping);

        int i = 0;
        for (Tweet tweet : Main.INSTANCE().getUser().getTweets()) {
            i++;
            System.out.println("adding point");
            series.addPoint(tweet.getCreationTimeMillis(), 1);
        }
        chart.addSeries(series);

        Window.alert(Integer.toString(i) + " points added");

        kwetterView.getUploadForm().addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler()
        {
            @Override
            public void onSubmitComplete(FormPanel.SubmitCompleteEvent event)
            {
                UserServiceAsync.Util.getInstance().getImage(Main.INSTANCE().getUser().getUserName(), new AsyncCallback<String>()
                {
                    @Override
                    public void onFailure(Throwable throwable)
                    {
                        Window.alert(throwable.getMessage());
                    }

                    @Override
                    public void onSuccess(String s)
                    {
                        kwetterView.getImage().setUrl("");
                        kwetterView.getImage().setUrl(s);

                    }
                });
            }
        });

        /**
         * Leaderchanges
         */
        kwetterView.getMakeLeaderListbox().addDoubleClickHandler(makeLeaderClickHandler);
        kwetterView.getUnLeaderListbox().addDoubleClickHandler(makeUnleaderClickHandler);
        kwetterView.getMonthFilterButton().addClickHandler(monthFilterHandler);
        kwetterView.getDayFilterButton().addClickHandler(dayFilterHandler);
        this.fillLeaderLists();
    }

    public Object[] getMonthGrouping() {
        return new Object[]{
            new Object[]{new JSONString("month"), new JSONNumber[]{new JSONNumber(1)}}
        };
    }

    public Object[] getDayGrouping() {
        return new Object[]{
            new Object[]{new JSONString("day"), new JSONNumber[]{new JSONNumber(1)}}
        };
    }

    public DoubleClickHandler makeUnleaderClickHandler = new DoubleClickHandler() {
        @Override
        public void onDoubleClick(DoubleClickEvent doubleClickEvent) {
            int index = kwetterView.getUnLeaderListbox().getSelectedIndex();
            String selectedUser = kwetterView.getUnLeaderListbox().getValue(index);

            String myUser = Main.INSTANCE().getUser().getUserName();

            UserServiceAsync.Util.getInstance().unLeader(myUser, selectedUser, new AsyncCallback<User>() {
                @Override
                public void onFailure(Throwable throwable) {
                    Window.alert(throwable.getMessage());
                }

                @Override
                public void onSuccess(User user) {
                    if (user != null) {
                        Main.INSTANCE().getUser().getLeaders().remove(user);
                        fillLeaderLists();
                    }
                }
            });
        }
    };

    public void fillLeaderLists() {
        kwetterView.getMakeLeaderListbox().clear();
        kwetterView.getUnLeaderListbox().clear();
        kwetterView.getLeadersListBox().clear();

        UserServiceAsync.Util.getInstance().getAllUsers(new AsyncCallback<List<User>>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert(throwable.getMessage());
            }

            @Override
            public void onSuccess(List<User> users) {
                for (User user : users) {
                    kwetterView.addNotLeader(user);
                }
            }
        });

        for (User user : Main.INSTANCE().getUser().getLeaders()) {
            kwetterView.addRemoveLeader(user);
        }

        for (User leader : Main.INSTANCE().getUser().getLeaders()) {
            kwetterView.addLeader(leader);
        }
    }

}
