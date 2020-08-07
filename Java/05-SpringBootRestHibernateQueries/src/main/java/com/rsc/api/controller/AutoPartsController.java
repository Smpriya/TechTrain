//package com.rsc.api.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rsc.api.model.AutoParts;
//import com.rsc.api.model.Car;
//import com.rsc.api.model.EngineCamShaft;
//import com.rsc.api.model.EnginePiston;
//import com.rsc.api.model.EngineSparkPlug;
//import com.rsc.api.service.AutoPartsMgrImpl;
//
//@RestController
//@RequestMapping("api")
//public class AutoPartsController extends BaseController {
//
//	@Autowired
//	private AutoPartsMgrImpl service;
//	
//	@GetMapping(value = "/autoparts", produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<AutoParts>> getAutoParts() {
//		
//		List<AutoParts> lst = service.getAutoParts();
//		for(int i=0;i<lst.size();i++) {
//			if (lst.get(i) instanceof EngineCamShaft) {
//				System.out.println("=====CamShaft=====" + lst.get(i) );
//			} else if (lst.get(i) instanceof EngineSparkPlug) {
//				System.out.println("=====SparkPlug=====" + lst.get(i) );
//			} else if (lst.get(i) instanceof EnginePiston) {
//				System.out.println("=====EnginePiston=====" + lst.get(i) );
//			}
//				
//		}
//		
//		
//		return new ResponseEntity<List<AutoParts>>(service.getAutoParts(),HttpStatus.OK);
//	}
//	
//	@PostMapping(value = "/autoparts/enginecamshaft", produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Boolean> createAutoParts1(@RequestBody EngineCamShaft eCamShart) {
//		service.createAutoParts(eCamShart);
//		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
//	}
//	
//	@PostMapping(value = "/autoparts/enginepistor", produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Boolean> createAutoParts1(@RequestBody EnginePiston ePiston) {
//		service.createAutoParts(ePiston);
//		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
//	}
//	
//	@PostMapping(value = "/autoparts/enginesparkplug", produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Boolean> createAutoParts1(@RequestBody EngineSparkPlug eSprkPlg) {
//		service.createAutoParts(eSprkPlg);
//		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
//	}
//	
//	
//	
//}
