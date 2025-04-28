package com.airport.service;

import com.airport.model.dao.JobTitleDao;
import com.airport.model.dao.impl.JobTitleDaoImpl;
import com.airport.model.entity.Department;
import com.airport.model.entity.JobTitle;

public class JobTitleService {


    public String jobTitleToString (JobTitle jobTitle) {
        return jobTitle.getId()+" "+jobTitle.getTitle()+" department: "+jobTitle.getDepartment().getName();
    }

    public void createJobTitle(String title, Integer departmentId) {

        JobTitleDao jobTitleDao = new JobTitleDaoImpl();
        Department department = new Department();
        department.setId(departmentId);

        JobTitle jobTitle = new JobTitle();
        jobTitle.setTitle(title);
        jobTitle.setDepartment(department);

        jobTitleDao.save(jobTitle);


    }


}
