package com.airport.service;

import com.airport.model.dao.DepartmentDao;
import com.airport.model.dao.impl.DepartmentDaoImpl;
import com.airport.model.entity.Department;

import java.util.List;

public class DepartmentService {

    public String departmentToString(Department department) {
        return department.getId() + " " + department.getName();
    }

    public void createDepartment(String name) {
        Department department = new Department();
        DepartmentDao departmentDao = new DepartmentDaoImpl();
        department.setName(name);
        departmentDao.save(department);

    }


}
