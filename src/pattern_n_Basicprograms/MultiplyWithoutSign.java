package pattern_n_Basicprograms;

import java.util.Scanner;

public class MultiplyWithoutSign
{
	   
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter numbers to multiply");
        a=sc.nextInt();
        b=sc.nextInt();
        
        int d=0;
        while(a>0)
        {
          d=d+b;
          a--;	
        }
        System.out.println("multiplication of given numbers is = "+d);
	}
}

 