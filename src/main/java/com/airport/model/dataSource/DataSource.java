package com.airport.model.dataSource;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class DataSource {

    private static DataSource instance;
    private final EntityManagerFactory entityManagerFactory;


    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

    private DataSource() {
        entityManagerFactory = Persistence.createEntityManagerFactory("airport");
    }


    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}
