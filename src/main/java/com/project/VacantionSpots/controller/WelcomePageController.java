package com.project.VacantionSpots.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.VacantionSpots.model.Spot;
import com.project.VacantionSpots.service.CountryService;
import com.project.VacantionSpots.service.CountyService;
import com.project.VacantionSpots.service.LocationService;
import com.project.VacantionSpots.service.SpotService;

@Controller
public class WelcomePageController {
	@Autowired
	@Qualifier(value = "countryServiceImpl")
	CountryService countryService;
	
	@Autowired
	@Qualifier(value = "countyServiceImpl")
	CountyService countyService;
	
	@Autowired
	@Qualifier(value = "locationServiceImpl")
	LocationService locationService;
	
	@Autowired
	@Qualifier(value = "spotServiceImpl")
	SpotService spotService;
	
	@RequestMapping(value = "/" )
	public String welcome() {
		return "welcome";
	}
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView FindAllSpots() {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("countries", countryService.getAllCountries());
        mav.addObject("counties",countyService.getAllCounties());
        mav.addObject("locations", locationService.getAllLocations());
        mav.addObject("spots", spotService.getAllSpots());
        return mav;
    }
    
    @RequestMapping(value = "/postMethod", method = RequestMethod.POST)
	@ResponseBody
	public void postData(ModelAndView mav){
		System.out.println(mav);
	}
    
	@RequestMapping(value = "/spots", method = RequestMethod.GET)
	@ResponseBody
	public List<Spot> getAllSpots(){
		return spotService.getAllSpots();
	}
	
	@RequestMapping(value = "/spots/{id}", method = RequestMethod.GET) 
	public Spot getSpotById(@PathVariable long id){
		return spotService.getSpotById(new Long(id));
	}
	
	@RequestMapping(value ="/createCountry", method = RequestMethod.POST)
	public String createCountry(
			@RequestParam(value="id", required=false) String id,
			@RequestParam(value="value", required=false) String value,
			@RequestParam(value="abbreviation", required=false) String abbreviation) {
			System.out.println("id="+id);
			System.out.println("value="+value);
			System.out.println("abbreviation="+abbreviation);
		return "welcome";
	}
}
