package abcd;

import java.util.Scanner;


public class programs {
	
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		
	//	prime();
		range_Prime(1, 100);
	//	Fibbco();
	//	perfect_Number();
	//	Reverse_num();
	//	Even_Odd();
	//	Reverse_String();
	//	VowelConsonant();
	//	Amstrong();
	//	palindrome();
	
	}
	public static void prime() {
		System.out.println("Enter the number");
		int num=scan.nextInt();
		scan.close();
		boolean isprime=true;
		for(int i=2;i<num;i++) {
			
			if(num % i == 0) {   			//  logic for not prime
				isprime= false;
				break;
			}	
		}
		if(isprime)
			System.out.println("is prime");
		else
			System.out.println("not prime");
		
	}			
	public static void range_Prime(int first, int last) {
		while(first < last) {
			boolean range=true;
			for(int i=2;i<=first/2;i++) {
				if(first % i ==0) {
					range=false;
					break;
				}
			}
			if(range)
				System.out.print(first+ " ");
			++first;
		}
	}
	public static void Fibbco() {
		int num, t1=0, t2=1;
		System.out.println("Enter the Range of num");
		num=scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++) {
			System.out.print(t1+ " ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}	
	public static void perfect_Number() {		
		System.out.println("Please Enter any Number: ");
		int Number=scan.nextInt(), Sum = 0 ;
		scan.close();

		for(int i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			
			System.out.println(Number+" is a Perfect Number" );
		}
		else {
			System.out.println(Number+" is NOT a Perfect Number");
		}
	}
	public static void Reverse_num() {
		int num = 123456, temp = 0;
		while(num != 0) {
            int digit = num % 10;
            temp = temp * 10 + digit;
            num = num/10;
        }

        System.out.println("Reversed Number: " + temp);
	}
	public static void Even_Odd() {
		System.out.println("Enter the number");
		int number=scan.nextInt();
		scan.close();	
		if(number % 2 ==0) {
			System.out.println("Enter number is Even");
		}
		else {
			System.out.println("enter number is odd");
		}	
	}
	public static void Reverse_String() {
		System.out.println("Enter a string to reverse");
		String name= scan.nextLine(), reverse=" ";
	      int length = name.length();
	      System.out.println(name.length());
	      for (int i = length - 1 ; i >= 0 ; i--) {
	    	  
	         reverse = reverse + name.charAt(i);
	      System.out.println(name.charAt(i));
	      }
	      System.out.println("Reverse of the string: " + reverse);
	}
	public static void VowelConsonant () {
		System.out.println("Enter a char");
		char ch = scan.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
	}
	public static void Amstrong() {
		System.out.println("Enter any number");
		int number = scan.nextInt(), i, remainder, result = 0 , n=0;
		for (i=number; i != 0; i = i/10, ++n);

        for (i=number; i != 0; i = i/10)
        {
            remainder = i % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
	public static void palindrome() {
		System.out.println("Enter the number");
		int num = scan.nextInt(), reversedInteger = 0, remainder, originalInteger=num;
        while( num != 0 ) {														// reversed integer is stored in variable
            remainder = num % 10;
            System.out.println(remainder);
            reversedInteger = reversedInteger * 10 + remainder;
            num  = num/10;
        }
        if (originalInteger == reversedInteger)									// palindrome if orignalInteger and reversedInteger are equal
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");	
	}
}
