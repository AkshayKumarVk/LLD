package org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals;

import java.util.List;

import static org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.ApiUtils.logFacebookGetPosts;
import static org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals.ApiUtils.logFacebookPostStatus;


public class FacebookApi {

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        logFacebookPostStatus();
    }
}