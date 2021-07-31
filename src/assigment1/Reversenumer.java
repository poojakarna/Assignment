package assigment1;

import java.util.Scanner;

public class Reversenumer {

	public static void main(String[] args) {

	      int num=0;
	      int reversenum =0;
	      System.out.println("Eter your number "
	      		+ ": ");
	      Scanner input = new Scanner(System.in);
	      num = input.nextInt();
	      
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);

	}

}
