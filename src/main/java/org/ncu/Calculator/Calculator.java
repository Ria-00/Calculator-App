package org.ncu.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	
//	XML Config
//	AdditionService add;
//	SubtractionService sub;
//	DivisionService div;
//	MultiplicationService mul;
//	
//	Calculator(AdditionService add,SubtractionService sub){
//		this.add=add;
//		this.sub=sub;
//	}
//	public void setMultiply( MultiplicationService mul) {
//		this.mul=mul;
//	}
//	public void setdivision( DivisionService div) {
//		this.div=div;
//	}

	
//	SPRING
	
//	Annotation Config
	MathService add;
	MathService sub;
	MathService mul;
	MathService div;
//	
	
	@Autowired
//	Calculator(@Qualifier("additionService") MathService add,@Qualifier("subtractionService") MathService sub){
//		this.add=add;
//		this.sub=sub;
//	}
	
//	Java Config
	Calculator(@Qualifier("add") MathService add,@Qualifier("sub") MathService sub){
		this.add=add;
		this.sub=sub;
	}
	
	@Autowired
//	FOR ANNOTATION CONFIG
//	@Qualifier("divisionService")   
	
	@Qualifier("div")
	public void setDivision( MathService div) {
		this.div=div;
	}
	
	@Autowired
//	FOR ANNOTATION CONFIG
//	@Qualifier("multiplicationService")			 
	@Qualifier("mul")
	public void setMultiply( MathService mul) {
		this.mul=mul;
	}
	
	public void compute(String s, int x, int y) {
		if (s.equals("+")) {
			add.operate(x, y);
		} else if (s.equals("-")) {
			sub.operate(x, y);
		} else if (s.equals("*")) {
			mul.operate(x, y);
		} else if (s.equals("/")) {
			div.operate(x, y);
		} else {
			throw new RuntimeException(s + " not Valid!!");
		}
	}
//	
//	

//	Hard-Code 
//	public void compute(String s,int x,int y) {
//		if (s.equals("+")) {
//			AdditionService as=new AdditionService();
//			as.operate(x, y);
//		}
//		else if(s.equals("-")){
//			SubtractionService as=new SubtractionService();
//			as.operate(x, y);
//		}
//		else if(s.equals("*")){
//			MultiplicationService as=new MultiplicationService();
//			as.operate(x, y);
//			}
//		else if(s.equals("/")){
//			DivisionService as=new DivisionService();
//			as.operate(x, y);
//			}
//		else {
//			throw new RuntimeException(s+" not Valid!!");
//		}
//	}
//	

}
