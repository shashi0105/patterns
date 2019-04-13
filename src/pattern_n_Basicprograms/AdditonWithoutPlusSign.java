package pattern_n_Basicprograms;

public class AdditonWithoutPlusSign {

	public static void main(String[] args) {
		AdditonWithoutPlusSign ad =new AdditonWithoutPlusSign();
		System.out.println(ad.add(7	,3));
		System.out.println(ad.add(-7,4));
		System.out.println(ad.add(6,-2));
		System.out.println(ad.add(2,0));
		System.out.println(ad.add(-8,0));
		System.out.println(ad.add(0,-10));
		System.out.println(ad.add(-3,-2));
	}
    public int add(int a ,int b)
    {
    	int c =a-(-b);
    	return c;
    }
}
