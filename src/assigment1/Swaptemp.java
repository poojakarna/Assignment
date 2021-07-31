package assigment1;

public class Swaptemp {

	public static void main(String[] args) {
		int x = 35;
		  int y = 26;
		  swap(x, y);


	}

	private static void swap(int x, int y) {
		int temp = x;
		  x = y;
		  y = temp;
		  System.out.println("Value of x is :" + x);
		  System.out.println("Value of y is :" + y);
		
	}

}
