package javaBasics;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=9;
		switch(x)
		{
		case 1:
			System.out.println("Poor");
			break;
			
		case 2:
			System.out.println("ok");
			break;
		case 3:
			System.out.println("good");
			break;
		case 4:
			System.out.println("above avg");
			break;
		case 5:
			System.out.println("excellent");
			break;
			default:
				System.out.println("Not matching grading system");
		}

	}

}
