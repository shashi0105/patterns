package pattern_n_Basicprograms;

import java.util.Scanner;

public class ReaminderWithoutModulous
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Division and Divisor");
		int division =sc.nextInt();
		int divisor = sc.nextInt();
		int Quotient =division/divisor;
		int Remainder =division-(divisor*Quotient);
		System.out.println("ramainder without using modulus ="+Remainder);
	}

}
