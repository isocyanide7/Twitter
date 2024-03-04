package com.nilesh.basedomains.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTweetEvent {

    private String tweetId;
    private String tweeter;
    private List<String> hashtags;
}
