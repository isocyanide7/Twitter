package com.nilesh.userms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "users")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    private String username;
    private String password;
    private String email;
    private Date dateOfBirth;
}
