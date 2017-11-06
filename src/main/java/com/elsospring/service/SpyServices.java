package com.elsospring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("spying")
public class SpyServices {
	
	public String iSaySomething() {
		return "Én egy kém vagyok";
		
	}

}
