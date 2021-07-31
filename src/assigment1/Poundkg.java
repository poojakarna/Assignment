package assigment1;

import java.util.Scanner;

public class Poundkg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);   
	    final double Kgperpound = 0.454; 
	    System.out.print("Enter a number in pounds: ");
	    double pounds = input.nextDouble();
	    double kilograms = pounds *  Kgperpound;
	    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	  }
	}


