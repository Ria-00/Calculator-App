package org.ncu.Calculator;
import org.springframework.stereotype.Component;


@Component
public class DivisionService implements MathService {

	@Override
	public void operate(int x, int y) {
		if((x>y) && y>0) {
			System.out.println("Division:"+(x/y));
		} else {
			System.out.println("Error");
		}
	}

}
