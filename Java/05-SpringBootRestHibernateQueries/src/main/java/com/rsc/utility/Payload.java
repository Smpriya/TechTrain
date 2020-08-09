package com.rsc.utility;

import java.util.Date;

import com.google.gson.Gson;
import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.Car;
import com.rsc.api.model.EngineCamShaft;
import com.rsc.api.model.EnginePiston;
import com.rsc.api.model.EngineSparkPlug;
import com.rsc.api.model.Fuel;
import com.rsc.api.model.Jeep;

public class Payload {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setColor("blue");
		c1.setEngineCapacity(1500);
		c1.setManufacturer("Maruti");
		c1.setIsRightHandDrive(true);
		c1.setType("hatchback");
		c1.setVin("35fdfdsfsdf4526353");
		c1.setYear("2020");
		c1.setFuel(Fuel.PETROL);
		c1.setManfDate(new Date());
		c1.setSellingDate(new Date());
		
		
		Jeep jp1 = new Jeep();
		jp1.setType("Jeep");
		
		jp1.setIsCovered(true);
		jp1.setEngineCapacity(2500);
		jp1.setIsFourWheelDrive(true);
		jp1.setIsPickUpTruckAttached(true);
		jp1.setVin("76454545454656565");
		c1.setFuel(Fuel.DIESEL);
		jp1.setManfDate(new Date());
		jp1.setSellingDate(new Date());
		
		
		Gson gs = new Gson();
		
		System.out.println(gs.toJson(c1));
		System.out.println(gs.toJson(jp1));
		
		EngineCamShaft ecs = new EngineCamShaft();
		ecs.setLenght(25);
		ecs.setManufacturer("sundaram");
		ecs.setName("CAMShaft001");
		ecs.setNoOfJumps(4);
		ecs.setType("internal");
		
		EngineSparkPlug esp = new EngineSparkPlug();
		esp.setFuel(Fuel.DIESEL);
		esp.setLength(65);
		esp.setManufacturer("bosch");
		esp.setName("EngineSparkPlug002");
		esp.setVolt(25);
		
		EnginePiston ep = new EnginePiston();
		ep.setDiameter(35);
		ep.setIs4Stroke(true);
		ep.setLength(86);
		ep.setManufacturer("tata");
		ep.setName("EnginePiston001");
		
		System.out.println(gs.toJson(ecs));
		System.out.println(gs.toJson(esp));
		System.out.println(gs.toJson(ep));
		
	}
}
