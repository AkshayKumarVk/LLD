package org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TwitterTweet {
    private String id;
    private String tweet;
    private Long userId;
}