package basicPrograms;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args) 
	{				
     int fact=1; 
   	 System.out.println("Enter the number whose factorial is to be find");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	/*
	   if(num==0 || num==1)
	 	 {
          System.out.println(1);  
	     }
    */
	 if(num!=0 || num!=1)
	   {
		for (int i=1; i<num; i++)
		{
			    fact=fact*i;
		}
		       
		System.out.println("Factorial of number "+ num +"= "+fact); 
	   }
   }

}
