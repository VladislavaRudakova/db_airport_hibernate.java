package com.airport.model.dao;

import com.airport.model.entity.Department;

import java.util.List;

public interface DepartmentDao extends DefaultDao<Department>{
    List<Department> findByName(String name);
}
