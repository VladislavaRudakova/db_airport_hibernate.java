package com.airport.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "user_credentials")
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;
}
