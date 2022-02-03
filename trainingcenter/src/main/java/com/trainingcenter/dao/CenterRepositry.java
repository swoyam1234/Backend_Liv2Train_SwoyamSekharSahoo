package com.trainingcenter.dao;

import org.springframework.data.repository.CrudRepository;

import com.trainingcenter.entities.TrainingCenter;

public interface CenterRepositry extends CrudRepository<TrainingCenter, String>{
	
	

}
