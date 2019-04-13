package pattern_n_Basicprograms;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values of x and y"); 
      int x =sc.nextInt();
      int y =sc.nextInt();
      
      System.out.println("values of x and y before swapping"+" x="+x+" y="+y);
      int temp = 0;
      temp=y;
      y=x;
      x=temp;
      System.out.println("values of x and y after swapping"+" x="+x+" y="+y);
	}

}
