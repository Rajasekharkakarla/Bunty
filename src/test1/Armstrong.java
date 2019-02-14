package test1;

public class Armstrong {

	    public boolean isArmstrongNumber(int number){

	        int tmp = number;
	        int noOfDigits = String.valueOf(number).length();
	        int sum = 0;
	        int div = 0;
	        while(tmp > 0){
	             div = tmp % 10;
	            int temp = 1;
	            for(int i=0; i < noOfDigits; i++){
	                temp *= div;
	            }
	            sum += temp;
	             tmp = tmp/10;
	        }
	        if(number == sum) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String a[]) {
	    	Armstrong man = new Armstrong();
	        System.out.println("Is 371 Armstrong number? " + man.isArmstrongNumber(371));
	        System.out.println("Is 523 Armstrong number? " + man.isArmstrongNumber(523));
	    
	    
	    }

}
