package abcd;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first value");
		double num1=scan.nextDouble();
		System.out.println("Enter the second value");
		double num2=scan.nextDouble();
		
		System.out.println("Enter operator like (+, -, *, / )");
		char oper=scan.next().charAt(0);
		scan.close();
		double result;
		
		switch(oper) {
			case '+':
				result=num1+num2;
				break;
				
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result= num1/num2;
				break;
				
			default:
				System.out.println("Enter the valid symbol");
				return;
			
		}
			System.out.println(num1+" "+oper+" "+num2+" = "+result);

	}

}
