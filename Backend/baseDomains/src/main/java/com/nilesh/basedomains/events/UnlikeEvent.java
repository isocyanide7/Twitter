package com.nilesh.basedomains.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnlikeEvent {

    private String likeId;
    private String tweetId;
    private String liker;
    private String tweeter;
}
