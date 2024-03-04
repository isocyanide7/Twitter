package com.nilesh.basedomains.dto;

import lombok.Data;

@Data
public class LikeDTO {

    private String likeId;
    private String tweetId;
    private String liker;
    private String tweeter;
}
