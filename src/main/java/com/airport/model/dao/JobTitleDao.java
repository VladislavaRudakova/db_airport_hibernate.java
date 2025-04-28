package com.airport.model.dao;

import com.airport.model.entity.JobTitle;

import java.util.List;

public interface JobTitleDao extends DefaultDao<JobTitle> {

    List<JobTitle> findByTitle(String name);

}
