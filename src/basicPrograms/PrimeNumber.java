package basicPrograms;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	 System.out.println("Enter the number to check");
	 Scanner s = new Scanner(System.in);
	 int num = s.nextInt();
	 if(num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0 )
	 {   
		 System.out.println("the number is  Prime");
	 }else
	   {
		 System.out.println("the number is not Prime");
	   }
	 
	}

}
