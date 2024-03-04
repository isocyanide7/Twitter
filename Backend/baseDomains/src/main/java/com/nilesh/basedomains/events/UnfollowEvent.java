package com.nilesh.basedomains.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnfollowEvent {

    private String followId;
    private String unfollower;
}
