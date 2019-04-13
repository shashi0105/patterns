package pattern_n_Basicprograms;

public class SubstrationWithoutMinusoperator {

	public static void main(String[] args) {
		SubstrationWithoutMinusoperator ad =new SubstrationWithoutMinusoperator();
		System.out.println(ad.Sub(4,12));
		System.out.println(ad.Sub(-6,2));
		System.out.println(ad.Sub(-6,-3));
		System.out.println(ad.Sub(0,-5));
		System.out.println(ad.Sub(-8,0));
		System.out.println(ad.Sub(0,-10));
		System.out.println(ad.Sub(-3,-2));

	}
	public int Sub(int a,int b)
	{
		return (a)+(-b) ;
	}

}
