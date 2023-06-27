package org.ncu.Calculator;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService implements MathService{

	@Override
	public void operate(int x, int y) {
		System.out.println("Multiplication:"+(x*y));
		
	}

}
