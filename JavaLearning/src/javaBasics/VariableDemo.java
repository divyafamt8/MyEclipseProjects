package javaBasics;

public class VariableDemo {
	
	//global variables contains null by default
	
	static int a;
	
	static int b = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		boolean status = true;
		
		char w=67;
		
		char r='R';
		
		int d = 56;
		
		//casting = changing to float from double
		//double is taken as default by java - so u need to convert to float..use cast or use f
		
		float marks = (float) 90.09;
		
		float marks2 = 89.77f;
		
		System.out.println("Status is "+status);
		
		System.out.println("char is "+w);
		
		System.out.println("char is "+r);
		
		System.out.println("int is "+d);
		
		System.out.println("marks is "+marks);
		
		
		System.out.println("marks 2 is "+marks2);
		
		System.out.println("global variable is "+a);
		
		System.out.println("global variable is "+b);
		
		

	}

}
