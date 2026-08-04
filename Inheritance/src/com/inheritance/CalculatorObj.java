package com.inheritance;

public class CalculatorObj {

	public static void main(String[] args) {
		
		Calculator GrandParent = new Calculator();
		
		System.out.println("From Calculator Class");
		
		int sum = GrandParent.sum(10 , 10);
		System.out.println(sum);

		int mul = GrandParent.mul(10, 3);
		System.out.println(mul);
		
		System.out.println("=======================");
		
		System.out.println("From AdvCalculator Class");
		
		AdvCalculator Parent = new AdvCalculator();
		
		int div = Parent.div(10, 2);
		System.out.println(div);
		
		int sum1 = Parent.sum(10, 30);
		System.out.println(sum1);
		
		int sub = Parent.sub(10, 10);
		System.out.println(sub);
		
		System.out.println("=======================");
		
		
		System.out.println("From ModrenCalculator Class");
		
		ModrenCalculator child = new ModrenCalculator();
		
		int sum3 = child.sum(55, 1);
		System.out.println(sum3);
		
		int sub3 = child.sub(10, 8);
		System.out.println(sub3);
		
		int modul = child.modul(10, 3);
		System.out.println(modul);
		
		System.out.println("=======================");
		
	}

}
