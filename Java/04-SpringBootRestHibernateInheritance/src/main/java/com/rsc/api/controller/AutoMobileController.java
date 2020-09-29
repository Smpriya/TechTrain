package com.rsc.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.Car;
import com.rsc.api.model.Jeep;
import com.rsc.api.service.AutoMobileMgrImpl;

@RestController
@RequestMapping("api")
public class AutoMobileController extends BaseController {

	@Autowired
	private AutoMobileMgrImpl serviceAutoMobile;
	
	@GetMapping(value = "/cars", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Car>> getAutoMobiles() {
		return new ResponseEntity<List<Car>>(serviceAutoMobile.getCars(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/automobies", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AutoMobile>> getAllAutoMobiles() {
		return new ResponseEntity<List<AutoMobile>>(serviceAutoMobile.getAllAutoMobiles(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/car", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> createCar(@RequestBody Car car) {
		serviceAutoMobile.createAutoMobile(car);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	@PostMapping(value = "/jeep", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> createJeep(@RequestBody Jeep jeep) {
		System.out.println("======Jeep==" + jeep);
		serviceAutoMobile.createAutoMobile(jeep);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	@GetMapping(value="/car/{id}")
	public ResponseEntity<Car> getCarByID(@PathVariable int id){
		return new ResponseEntity<Car>(serviceAutoMobile.fetchCarByID(id),HttpStatus.OK);
	}
	
	
}
