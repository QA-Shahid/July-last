package javacoding.challenges;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		//1st way
		HashSet<String> set1 = new HashSet<String>(); //here set1 is a object of HashSet class
		set1.add("messi");
		set1.add("ronaldo");
		set1.add(null); // only one null value possible, if i give more null it automatically remove the others
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(200);
		set2.add(400);
		set2.add(500);
		set2.add(null);
		set2.add(null);// output automatically remove the null values, just keep one null value
		set2.add(null);
	// now i wanna check 400 is there are not?
	//for this i cant use index theory here.
	// i need to use contain method.
		
		System.out.println(set2.contains(400));// output will show true 
		//2nd way 
		
		Set<String> set3 =new HashSet<String>();// here set3 is a instance of Set interface
		set3.add("messi");
		set3.add("ronaldo");
		Set<Integer> set4 =new HashSet<Integer>();
		set4.add(200);
		set4.add(400);
	}

}
