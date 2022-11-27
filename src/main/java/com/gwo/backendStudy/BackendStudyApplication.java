package com.gwo.backendStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan({"com.gwo.backendStudy*"})
public class BackendStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendStudyApplication.class, args);
	}

}
