package assigment1;

import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
   
		 int a, b, sum;
	        float avg;

	        Scanner buf = new Scanner(System.in);

	        System.out.print("Enter first number : ");
	        a = buf.nextInt();

	        System.out.print("Enter second number : ");
	        b = buf.nextInt();
	        sum = a + b;
	        avg = (float)((a + b) / 2);

	        System.out.print("Sum : " + sum + "\nAverage : " + avg);
		   
		   
		   
   
	}

}
