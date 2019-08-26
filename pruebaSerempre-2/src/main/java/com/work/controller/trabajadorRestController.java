package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.work.entity.Trabajador;
import com.work.servicios.trabajadorServicios;

@RestController
public class trabajadorRestController {
	
	@Autowired
	private trabajadorServicios tr;
	
	
	@RequestMapping(value = "/rest/add", method = RequestMethod.POST)
	public void addRequestHomework(@RequestBody Trabajador tra) {		
		tr.save(tra);
	}
}
