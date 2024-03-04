package com.nilesh.basedomains.entity;

import com.nilesh.basedomains.dto.ReplyDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tweets")
public class Tweet {

    @Transient
    public static final String sequence="tweet_sequence";

    @Id
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
