package basicPrograms;

import java.util.Scanner;

public class EvenOdd
{

	public static void main(String[] args) 
	{
		System.out.println("enter the number to check");
		Scanner scan = new Scanner(System.in);
        long num = scan.nextInt();
        if(num%2==0)
        {
         System.out.println("entered number is even");
        }else
          {
           System.out.println("entered number is odd");
          }
	}

}
