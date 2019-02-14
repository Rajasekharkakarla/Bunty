package test1;

import java.util.Scanner;

public class Fibcco {
	 
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the n numbers of values");
		int n=scan.nextInt(), t1=0, t2=1;
		System.out.print("sum of "+n+" numbers are ");
		scan.close();
		
		for(int i=1;i<=n;i++) {
			System.out.print(+t1+" ");
			
			int sum=t1+t2;
			t1=t2;
			t2=sum;
	}
		
	}
}