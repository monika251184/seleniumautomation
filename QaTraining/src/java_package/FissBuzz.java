package java_package;

import java.util.Scanner;

public class FissBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.print("enter a number");
		int number=scanner.nextInt();
		
		if (number % 5==0 && number % 3==0)
		System.out.println("fiss buzz");
		else if(number% 5==0)
		  System.out.println("fiss");
		else if(number % 3==0)
		  System.out.println("buzz");
		else
			
		  System.out.println(" numberis" + number);
		
		
	}

}
