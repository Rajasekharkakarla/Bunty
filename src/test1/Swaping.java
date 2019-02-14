package test1;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter First number");
		int first=scan.nextInt();
		System.out.println("Enter second number");
		int second=scan.nextInt();
		scan.close();
		
		System.out.println("Enter values are "+first+" and "+second);
		
		first= first+second;
		second=first-second;
		first=first-second;
		System.out.println("after swapping "+first+" and "+second);
		

	}

}
