package assigment1;

import java.util.Scanner;

public class Sumnaturalnymers {

	public static void main(String[] args) {
		int sum=0,num;
	    Scanner scan = new Scanner(System.in);
	  
	System.out.print("Enter the integer number: ");
	num = scan.nextInt();
	for(int i=1; i<=num; i++){
	  sum = sum+i;
	}
	System.out.print("Sum of natural numbers: "+sum);

	}

}
