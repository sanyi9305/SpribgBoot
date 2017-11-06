package com.elsospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elsospring.service.SpyServices;

@RestController
public class HomeController {

	// 1.megoldas nehéz tesztelni
	// @Autowired
	// private spyGirl spicy;

	// 2.megoldás setter alapú ez hasznos....
	// 
	// private spyGirl spicy;
	// @Autowired
	// public void setSpicy(spyGirl spicy) {
	// this.spicy = spicy;
	// }

	// //3.megoldás konstruktor alapó
//	 @Autowired
//	 private spyGirl spicy;
//	
//	 public HomeController(spyGirl spicy) {
//	 this.spicy = spicy;
//	 }
	
	private SpyServices spyServices;
	
	@Autowired
	public void setSpyServices(SpyServices spyServices) {
		this.spyServices = spyServices;
	}


	@RequestMapping("/")
	public String index() {
		return spyServices.iSaySomething();
	}
	
}
