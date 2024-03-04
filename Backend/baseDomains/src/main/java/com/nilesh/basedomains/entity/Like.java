package com.nilesh.basedomains.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "likes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Like {

    @Transient
    public static final String likeSequence="likes_sequence";

    @Id
    private String likeId;
    private String tweetId;
    private String liker;
    private String tweeter;
}
