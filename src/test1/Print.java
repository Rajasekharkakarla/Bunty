package test1;

public class Print {
	
	public static void withoutloop(int n) {
		if(n<=0) {
			System.out.println(n);
			withoutloop(n+1);
			
		}
	}
	public static void main(String[] args) {
		Print.withoutloop(1);
	}

}
