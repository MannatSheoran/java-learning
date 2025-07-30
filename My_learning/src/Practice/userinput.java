package Practice;

import java.util.Scanner;

public class userinput {
	public float add() {
	Scanner scanner = new Scanner(System.in);
	float a,b;
	System.out.println("enter value of first number");
	a = scanner.nextFloat();
	System.out.println("enter value of second number");
	b = scanner.nextFloat();
	scanner.close();
	return a+b;
	
	}
	
}
