package com.nilesh.basedomains.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FollowEvent {

    private String followId;
    private String follower;
}
