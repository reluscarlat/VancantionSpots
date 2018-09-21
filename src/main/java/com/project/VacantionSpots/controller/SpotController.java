package com.project.VacantionSpots.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.VacantionSpots.model.Spot;
import com.project.VacantionSpots.service.SpotService;

@Controller
public class SpotController {
	@Autowired
	@Qualifier(value = "spotServiceImpl")
	SpotService spotService;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value = "/spots", method = RequestMethod.GET)
	@ResponseBody
	public List<Spot> getAllSpots(){
		return spotService.getAllSpots();
	}
	
	@RequestMapping(value = "/spots/{id}", method = RequestMethod.GET) //????? Functioneaza si ptr id-uri gresite
	public Spot getSpotById(@PathVariable long id){
		return spotService.getSpotById(new Long(id));
	}
}