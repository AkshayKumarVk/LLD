package org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator;

import org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.FacebookApi;
import org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.FacebookPost;
import org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.TwitterApi;
import org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.TwitterTweet;

import java.util.List;

public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            List<TwitterTweet> tweets = twitterApi.getTweets(userId);
        }

        // Convert the posts/tweets to a common format
    }
}