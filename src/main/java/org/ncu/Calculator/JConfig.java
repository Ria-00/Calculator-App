package org.ncu.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConfig {

	
	@Bean
	Calculator calc(){
		Calculator c=new Calculator(add(),sub());
		c.setDivision(div());
		c.setMultiply(mul());
		return c;
	}
	
	@Bean
	MathService add() {
		return new AdditionService();
	}
	
	@Bean
	MathService sub() {
		return new SubtractionService();
	}
	
	@Bean
	MathService mul() {
		return new MultiplicationService();
	}
	
	@Bean
	MathService div() {
		return new DivisionService();
	}
	
	
	
	

	
}
