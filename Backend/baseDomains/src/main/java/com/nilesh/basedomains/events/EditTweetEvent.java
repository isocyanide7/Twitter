package com.nilesh.basedomains.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditTweetEvent {

    private String tweetId;
    private String tweeter;
    private String text;
    private List<String> hashtags;

}
