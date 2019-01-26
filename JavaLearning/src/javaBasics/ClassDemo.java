package javaBasics;

public class ClassDemo {
	
	//Data Members/Properties--
	int x = 30;
	int y = 40;
	
	//Behaviour/Methods
	
	public void sum(){
		int a = 1;
		int b = 2;
		int c = b+a;
		
		System.out.println("Sum of two numbers : "+c);
		
	}
	
	
	public static void main(String[] args) {
		ClassDemo obj = new ClassDemo();
		
		obj.sum();
		
		int h = obj.x + obj.y;
		
		System.out.println("Sum of global two numbers: "+h);
		
		Calculator b2 = new Calculator();
		b2.add(50,50);
		
		Calculator.subtraction(10, 15);
	}

}
