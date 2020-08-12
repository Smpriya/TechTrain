package com.rsc.api;

import java.util.Date;
import java.util.List;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.rsc.api.model.Animal;
import com.rsc.api.model.Bat;
import com.rsc.api.model.Car;
import com.rsc.api.model.Elephant;
import com.rsc.api.model.EngineCamShaft;
import com.rsc.api.model.EnginePiston;
import com.rsc.api.model.EngineSparkPlug;
import com.rsc.api.model.Fuel;
import com.rsc.api.model.Jeep;
import com.rsc.api.service.AnimalServiceManager;
import com.rsc.api.service.AutoMobileServiceManager;
import com.rsc.api.service.AutoMobileServiceManagerImpl;
import com.rsc.api.service.AutoPartsManager;
import com.sun.xml.bind.v2.model.core.Element;

import javassist.expr.Instanceof;

@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class Application {

	@Autowired
	private AutoMobileServiceManager autoMobileServiceManagerImpl;

	@Autowired
	private AnimalServiceManager animalServiceManagerImpl;
	
	@Autowired
	private AutoPartsManager autoPartsManagerImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {

			Car c1 = new Car();
			c1.setColor("blue");
			c1.setEngineCapacity(1500);
			c1.setManufacturer("Maruti");
			c1.setIsRightHandDrive(true);
			c1.setType("hatchback");
			c1.setVin(System.currentTimeMillis()+"");
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
			jp1.setVin(System.currentTimeMillis()+"");
			jp1.setFuel(Fuel.DIESEL);
			jp1.setManfDate(new Date());
			jp1.setSellingDate(new Date());

			//autoMobileServiceManagerImpl.createAutoMobile(c1);
			//autoMobileServiceManagerImpl.createAutoMobile(jp1);
			
			Bat bat = new Bat();
			bat.setName("Indian bat");
			bat.setSpecies("Zynclovia");
			
			Elephant elp1 = new Elephant();
			elp1.setSpecies("Asian");
			elp1.setWeight(150);
			
			Elephant elp2 = new Elephant();
			elp2.setSpecies("Afreican");
			elp2.setWeight(170);
			
			//animalServiceManagerImpl.createAutoMobile(bat);
			//animalServiceManagerImpl.createAutoMobile(elp1);
			//animalServiceManagerImpl.createAutoMobile(elp2);
			
			List<Animal> animals = animalServiceManagerImpl.getAnimals();
			for(int i=0;i<animals.size();i++) {
				System.out.println(animals.get(i));
				if ( animals.get(i) instanceof Bat) {
					System.out.println("BAT...");
				}
				
				if ( animals.get(i) instanceof Elephant) {
					System.out.println("Elephant...");
				}
				
			}
			//@Inheritance(strategy = InheritanceType.JOINED)
			System.out.println("=========================================");
			List<Elephant> eleph = animalServiceManagerImpl.getElephants();
			System.out.println(eleph);
			
			System.out.println("=========================================");
			List<Bat> bats = animalServiceManagerImpl.getBats();
			System.out.println(bats);
			
			//Inheritance(strategy = InheritanceType.SINGLE_TABLE)
			System.out.println("=========================================");
			
			EngineCamShaft ecamshft1 = new EngineCamShaft();
			ecamshft1.setLenght(45);
			ecamshft1.setManufacturer("Mannar&Mannar");
			ecamshft1.setName("Mannar");
			ecamshft1.setNoOfJumps(5);
			ecamshft1.setType("Diesel Engine");
			
			EnginePiston ep1 = new EnginePiston();
			ep1.setDiameter(35);
			ep1.setIs4Stroke(false);
			ep1.setLength(85);
			ep1.setManufacturer("Pattrai");
			ep1.setName("2 stroke piston");
			
			EngineSparkPlug engSprkPlg1 = new EngineSparkPlug();
			engSprkPlg1.setFuel(Fuel.DIESEL);
			engSprkPlg1.setLength(105);
			engSprkPlg1.setManufacturer("Maruthi");
			engSprkPlg1.setName("Maruti");
			engSprkPlg1.setVolt(120);

			autoPartsManagerImpl.createAutoParts(ecamshft1);
			autoPartsManagerImpl.createAutoParts(ep1);
			autoPartsManagerImpl.createAutoParts(engSprkPlg1);
		};
	}
}
