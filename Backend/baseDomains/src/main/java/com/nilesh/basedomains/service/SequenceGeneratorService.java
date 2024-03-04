package com.nilesh.basedomains.service;

import com.nilesh.basedomains.entity.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SequenceGeneratorService {

    @Autowired
    private MongoOperations mongoOperations;

    public String getSequenceNumber(String sequenceName){
        //Get the sequence number
        Query query = new Query(Criteria.where("id").is(sequenceName));
        //Update the sequence number
        Update update = new Update().inc("seq",1);
        //Modify in document
        Sequence counter = mongoOperations.findAndModify(
                query,
                update,
                FindAndModifyOptions.
                        options().
                        returnNew(true).
                        upsert(true),
                Sequence.class);

        Integer value=!Objects.isNull(counter)?counter.getSeq():1;

        return value.toString();
    }
}
