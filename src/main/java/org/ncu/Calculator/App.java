package org.ncu.Calculator;

import java.util.Scanner;

//import org.ncu.greet_app.FrenchGreet;
//import org.ncu.greet_app.GreetingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operator:");
		String s = sc.next();
		System.out.println("Enter operands:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(JConfig.class);
		Calculator cal = ac.getBean("calc", Calculator.class);
		cal.compute(s, x, y);
		ac.close();

//        Stereotype: are flags, don't have any implementations,are just template 

//      XML CONFIG:  

//    	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//    	MathService gs= c.getBean("mul",MathService.class);
//    	gs.operate(x,y);

//        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//    	Calculator ca=c.getBean("cal",Calculator.class); 
//    	ca.compute(s, x, y);
//    	c.close();

//  	ANNOTATION CONFIG:

//    	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
//        Calculator cal=ac.getBean("calc",Calculator.class);
//    	cal.compute(s,x, y);
//    	ac.close();

//        JAVA CONFIG
//        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(JConfig.class);
//    	Calculator cal=ac.getBean("calc",Calculator.class);
//    	cal.compute(s,x, y);
//    	ac.close();

	}
}
