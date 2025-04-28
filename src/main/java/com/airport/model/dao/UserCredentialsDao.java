package com.airport.model.dao;

import com.airport.model.entity.UserCredentials;

import java.util.List;

public interface UserCredentialsDao extends DefaultDao<UserCredentials> {
    List<UserCredentials> findByLogin(String login);

}
