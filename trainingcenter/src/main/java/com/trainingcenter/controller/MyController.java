package com.trainingcenter.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trainingcenter.entities.TrainingCenter;
import com.trainingcenter.service.CenterService;

@Controller
public class MyController {
	
	@Autowired
	private CenterService centerService;
	
	@PostMapping(value="/center", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TrainingCenter> addCenter(@Valid @RequestBody TrainingCenter trainingCenter)
	{
		TrainingCenter tc=null;
		
		try {
			
			tc=this.centerService.addCenter(trainingCenter);
			return ResponseEntity.of(Optional.of(trainingCenter));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/center")
	public ResponseEntity<List<TrainingCenter>> getCenters()
	{
		List<TrainingCenter> list = this.centerService.getAllCenters();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

	
	
	
	
}
