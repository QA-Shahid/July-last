package javacoding.challenges;

public class SwapTheNumber {

	public static void main(String[] args) {
		//How to swap the numbers without using third variable or without using temporary variable?
		
		int x = 400;
		int y = 700;
		
		System.out.println("Before Swapping :");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	//	1100= 400 + 700
		x = x +y;
	//400=1100-700	
		y=x-y;
	//700=1100-400	
		x=x-y;
		
		System.out.println("After Swapping :");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	//Another Example
		
		int j =70;
		int k = 300;
		System.out.println("Before Swapping :");
		System.out.println("j = " + j);
		System.out.println("k = " + k);	
		
		j= j+k;
		k= j-k;
		j= j-k;
		System.out.println("After Swapping :");
		System.out.println("j = " + j);
		System.out.println("k = " + k);	
		
		//How to swap the numbers with using third variable or with using temporary variable?
		//This way is extra, if 1st way we know is good to go.
	
	int m = 85;
	int n = 150;
	System.out.println("Before Swapping :");
	System.out.println("m = " + m);
	System.out.println("n = " + n);		
		
	int temp = m;
	m=n;	
	n= temp;
	System.out.println("After Swapping :");
	System.out.println("m = " + m);
	System.out.println("n = " + n);	
	}
}
