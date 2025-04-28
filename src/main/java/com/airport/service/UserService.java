package com.airport.service;

import com.airport.model.dao.UserDao;
import com.airport.model.dao.impl.UserDaoImpl;
import com.airport.model.entity.User;
import com.airport.model.entity.UserCredentials;

public class UserService {

    public String userToString(User user) {
        return user.getId() + " " + user.getName() + " " + user.getEMail() + " login: " + user.getUserCredentials().getLogin() + " password: " + user.getUserCredentials().getPassword();
    }

    public void createUser(String name, String eMail, String login, String password) {

        UserDao userDao = new UserDaoImpl();
        UserCredentials userCredentials = new UserCredentials();
        userCredentials.setLogin(login);
        userCredentials.setPassword(password);

        User user = User.builder()
                .name(name)
                .eMail(eMail)
                .userCredentials(userCredentials).build();

        userDao.save(user);

    }

}
