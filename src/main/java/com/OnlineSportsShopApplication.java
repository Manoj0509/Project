package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import springfox.documentation.service.ApiInfo;



@SpringBootApplication
//@EnableSwagger2



public class OnlineSportsShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSportsShopApplication.class, args);
		System.out.println("Connected to database");
	}
  
	/*public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(metadata()).select().paths(regex("/OnlineSportShop.*")).build();
	}

	private ApiInfo metadata() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
