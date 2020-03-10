package com.spring.employee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
	@EnableSwagger2
	public class SwaggerConfiguration {
	    @Bean
	    public Docket employeeApi() {
	        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).build();
	               // .select().apis(RequestHandlerSelectors.basePackage(".controllers"))
	              //  .paths(regex("/Employee.*"))
	               // .build();
	    }
	    private ApiInfo metaData() {
	        ApiInfo apiInfo = new ApiInfo(
	                "Spring Boot REST API",
	                "Spring Boot REST API for Online Store",
	                "1.0",
	                "Terms of service",
	                new Contact("mani", "https://springframework.com/about/", "mani@springfrmework.com"),
	               "Apache License Version 2.0",
	                "https://www.apache.org/licenses/LICENSE-2.0");
	        return apiInfo;
	    }
	}


