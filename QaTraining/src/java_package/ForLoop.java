package java_package;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner= new Scanner(System.in);
     System.out.print("enter the number");
     int number=scanner.nextInt();
     for(int i=0;i<=number;i++)
    	 System.out.println(i);
	}

}
