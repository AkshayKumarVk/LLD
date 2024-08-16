package org.example.low_level_design.lld2.adapter.assignment.socia_media_aggregator.externals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;
}