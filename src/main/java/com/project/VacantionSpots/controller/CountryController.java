package com.project.VacantionSpots.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.VacantionSpots.model.Country;
import com.project.VacantionSpots.service.CountryService;
@Controller
public class CountryController {
	@Autowired
	@Qualifier(value = "countryServiceImpl")
	CountryService countryService;
	
    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    public ModelAndView getAllCountries() {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("countries", countryService.getAllCountries());
        return mav;
    }
	
	@RequestMapping(value = "/countries/{id}", method = RequestMethod.GET)
	public Country getSpotById(@PathVariable int id){
		return countryService.getCountryById(id);
	}
}
