package com.airport.model.dao.impl;

import com.airport.model.dao.UserDao;
import com.airport.model.entity.User;

public class UserDaoImpl extends DefaultDaoImpl<User> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

}
