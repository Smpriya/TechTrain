package com.rsc.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsc.api.service.AnimalServiceManager;

@RestController
@RequestMapping("api")
public class MyController extends BaseController {
	
	@Autowired
	private AnimalServiceManager animalServiceManagerImpl;
	
	@GetMapping(value = "/service1/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Object>> fetchData1(@PathVariable int id) {
		return new ResponseEntity<List<Object>>(animalServiceManagerImpl.getQueryJoin(),HttpStatus.OK);
	}
	
}
