package pattern_n_Basicprograms;

import java.util.Scanner;

public class DivisionWithoutSign {
    
	public static void main(String[] args)
	{
	 Scanner sc =new Scanner(System.in)	;
	 System.out.println("Enter Division and Divisor");
	 int Divison = sc.nextInt();
	 int Divisor = sc.nextInt();
	 
	 for (int i=1; i<10000; i++)
	 {
       if (Divisor*i==Divison) 
        {
		  System.out.println("Quotient after division is "+i);
		  break;
      	}
      		
	 }
		
  }	

}
