package com.test.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
 * Description	: @SpringBootApplication은 스프링 부트 애플리케이션임을 나타내는 어노테이션이다.
 * 				    해당 어노테이션은 @Configuration, @EnableAutoConfiguration, @ComponentScan을 묶은 것이다.
 * 				  SpringApplicaion.run 메소드를 통해 스프링부트 애플리케이션을 실행시킨다. 
 * 				  @EnableEurekaClient 어노테이션은 Eureka Client로 서비스의 등록과 탐색을 활성화한다.
 * 				  @EnalbeZuulProxy 어노테이션은 zuul 서버(Api gateway)로 동작할 수 있게 활성화한다.
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
