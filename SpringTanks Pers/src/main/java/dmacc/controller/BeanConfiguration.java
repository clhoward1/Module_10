/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Apr 24, 2024
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Tank;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Tank tank() {
		Tank bean = new Tank();
		bean.setModelName("M4A2");
		bean.setYearIntroduced(1942);
		bean.setAmountMade(10000);
		return bean;
	}

}
