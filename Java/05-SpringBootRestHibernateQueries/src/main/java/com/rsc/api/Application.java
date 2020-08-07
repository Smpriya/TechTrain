package com.rsc.api;

import java.util.Date;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.rsc.api.model.Car;
import com.rsc.api.model.Fuel;
import com.rsc.api.model.Jeep;
import com.rsc.api.service.AutoMobileServiceManager;
import com.rsc.api.service.AutoMobileServiceManagerImpl;

@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class Application {

	@Autowired
	private AutoMobileServiceManager autoMobileServiceManagerImpl;

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

			autoMobileServiceManagerImpl.createAutoMobile(c1);
			autoMobileServiceManagerImpl.createAutoMobile(jp1);
			// userRepository.save(new User("John"));
			// userRepository.save(new User("Rambo"));
		};
	}
}
