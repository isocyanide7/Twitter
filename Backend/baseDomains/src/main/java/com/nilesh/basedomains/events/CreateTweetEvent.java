package com.nilesh.basedomains.events;

import com.nilesh.basedomains.dto.ReplyDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTweetEvent {

    private String tweetId;
    private String text;
    private String tweeter;
    private String originalTweeter;
    private boolean isEdited;
    private boolean isRetweeted;
    private List<ReplyDTO> replies;
    private List<String> likes;
    private List<String> hashtags;
    private LocalDateTime time;
}
