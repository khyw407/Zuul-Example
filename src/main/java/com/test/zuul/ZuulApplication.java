package com.test.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
 * Description	: @SpringBootApplication�� ������ ��Ʈ ���ø����̼����� ��Ÿ���� ������̼��̴�.
 * 				    �ش� ������̼��� @Configuration, @EnableAutoConfiguration, @ComponentScan�� ���� ���̴�.
 * 				  SpringApplicaion.run �޼ҵ带 ���� ��������Ʈ ���ø����̼��� �����Ų��. 
 * 				  @EnableEurekaClient ������̼��� Eureka Client�� ������ ��ϰ� Ž���� Ȱ��ȭ�Ѵ�.
 * 				  @EnalbeZuulProxy ������̼��� zuul ����(Api gateway)�� ������ �� �ְ� Ȱ��ȭ�Ѵ�.
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
