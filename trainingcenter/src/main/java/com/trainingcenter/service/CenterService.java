package com.trainingcenter.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trainingcenter.dao.CenterRepositry;
import com.trainingcenter.entities.TrainingCenter;

@Component
public class CenterService {
	
	@Autowired
	private CenterRepositry centerRepositry;
	
	// Add center details
	public TrainingCenter addCenter(TrainingCenter tc)
	{
		Date date=new Date();
		if(tc != null) {
			tc.setCreatedOn(date);
		}
		TrainingCenter result = centerRepositry.save(tc);
		
		return result;
	}
	
	// Get all centers
	public List<TrainingCenter> getAllCenters()
	{
		List<TrainingCenter> list = (List<TrainingCenter>) this.centerRepositry.findAll();
		return list;
	}

}
