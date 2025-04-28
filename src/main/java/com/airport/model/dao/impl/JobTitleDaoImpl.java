package com.airport.model.dao.impl;

import com.airport.model.dao.JobTitleDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.JobTitle;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class JobTitleDaoImpl extends DefaultDaoImpl<JobTitle> implements JobTitleDao {

    public JobTitleDaoImpl() {
        super(JobTitle.class);
    }

    @Override
    public List<JobTitle> findByTitle(String title) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from JobTitle where title = :title");
        query.setParameter("title", title);

        return query.getResultList();
    }

}
