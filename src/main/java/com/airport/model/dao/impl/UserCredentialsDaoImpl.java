package com.airport.model.dao.impl;

import com.airport.model.dao.UserCredentialsDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.UserCredentials;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class UserCredentialsDaoImpl extends DefaultDaoImpl<UserCredentials> implements UserCredentialsDao {

    public UserCredentialsDaoImpl() {
        super(UserCredentials.class);
    }

    @Override
    public List<UserCredentials> findByLogin(String login) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from UserCredentials where login = :login");
        query.setParameter("login", login);

        return query.getResultList();
    }
}
