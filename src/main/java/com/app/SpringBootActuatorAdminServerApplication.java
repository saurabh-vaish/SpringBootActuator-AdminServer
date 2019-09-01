package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/***
 * 
 * For Monitoring application info , health actuator is used . 
 * 
 *  For Actuator admin ---  depedency -   spring-boot-admin-server , spring-boot-server-ui , web 
 *  
 *  -- define server port in properties file .
 * 
 * 
 * */



@SpringBootApplication
@EnableAdminServer			// to enable actuator 
public class SpringBootActuatorAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorAdminServerApplication.class, args);
	}

}
