package org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals;
import java.util.List;

import static org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.ApiUtils.logTwitterGetPosts;
import static org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.ApiUtils.logTwitterPostStatus;


public class TwitterApi {

    public List<TwitterTweet> getTweets(Long userId) {
        // Implementation to fetch Twitter tweets
        logTwitterGetPosts();
        return List.of(new TwitterTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {
        // Implementation to send a tweet on Twitter
        logTwitterPostStatus();
    }
}
