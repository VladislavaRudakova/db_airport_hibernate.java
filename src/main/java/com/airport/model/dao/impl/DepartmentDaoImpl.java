package com.airport.model.dao.impl;

import com.airport.model.dao.DepartmentDao;
import com.airport.model.dataSource.DataSource;
import com.airport.model.entity.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class DepartmentDaoImpl extends DefaultDaoImpl<Department> implements DepartmentDao {

    public DepartmentDaoImpl() {
        super(Department.class);
    }

    @Override
    public List<Department> findByName(String name) {

        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        Query query = entityManager.createQuery("from Department where name = :name");
        query.setParameter("name", name);

        return query.getResultList();
    }
}
