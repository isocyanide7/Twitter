package com.nilesh.basedomains.utility;

import com.nilesh.basedomains.dto.LikeDTO;
import com.nilesh.basedomains.entity.Like;
import com.nilesh.basedomains.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converters {

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public Like toLikeEntity(LikeDTO likeDTO){

        Like like = new Like();
        like.setLikeId(sequenceGeneratorService.getSequenceNumber(Like.likeSequence));
        like.setLiker(likeDTO.getLiker());
        like.setTweetId(likeDTO.getTweetId());
        like.setTweeter(likeDTO.getTweeter());

        return like;
    }

    public LikeDTO toLikeDTO(Like like){

        LikeDTO likeDTO = new LikeDTO();
        likeDTO.setLikeId(like.getLikeId());
        likeDTO.setLiker(likeDTO.getLiker());
        likeDTO.setTweetId(likeDTO.getTweetId());
        likeDTO.setTweeter(likeDTO.getTweeter());

        return likeDTO;
    }
}
