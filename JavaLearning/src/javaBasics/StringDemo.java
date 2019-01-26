package javaBasics;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name = "Selenium-Webdriver-HP-QTP";
		String[]splitname = name.split("-");
		
		for(int i=0;i<splitname.length;i++)
		{
			System.out.println("Value of i "+i+" is "+splitname[i]);
		}
	}

}
