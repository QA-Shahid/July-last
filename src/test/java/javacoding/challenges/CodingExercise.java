package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class CodingExercise {
	//Decleration->looping->condition->breaking
//Q1. How to find out the even and odd number?
	@Test
	public void getEvenAndOdd() {
		int num = 30;
		for(int i=0; i<=num;i++) {
			if(i % 2 ==0) {
				System.out.println("Even number:" + i);
			}
			else {
				//System.out.println("Odd number:" + i);	
			}
		}
	}
	
	//if They ask for only odd number. 
	//@Test
	public void getOdd() {
		int num = 20;
		for(int i=0;i<=num;i++) {
			if(i % 2 !=0) {
				System.out.println("Odd number:" + i);
			}
		}
	}
	
	
	//Q2.How to merge two arrays?
	
	//@Test
	public static void getMergeTwoArrays() {
	//step1-Inorder to merge two arrays First of all i have to declare two arrays(desire value).
		
		String value1 [] = {"L","I","O","N","E","L"};
		String value2 [] = {"M","E","S","S","I"};
	//Step2-I have to declare ArrayList and pass the argument as a first Array variable 
	//and take the control of first array value in ArrayList object			
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(value1));
	//Step3-using ArrayList objectName I have to call the addAll method and  pass the second array variable
		list.addAll(Arrays.asList(value2));
	//Step4-using ArrayList objectName I have to call the toArray method (for convert list to array) and storing into ObjectClass which is the parent class of java . 
		Object[] mergeValue = list.toArray();
		System.out.println(Arrays.toString(mergeValue));
		
	}
	
	
	//Q3.How to reverse number or string?****
	//@Test
	public void getReverseNumber() {
	//there are many ways to reverse the number.
	//Step1- I have to declaare an array with help of wrapper class.because for reverse I'm using Collections utility class.(so int dont work here.)	
		Integer num []= {100,345,250,1356,765};
		System.out.println("Before reverse Array value " + Arrays.toString(num));
	//Step2-With the help of Collections utility class i have to call reverse method and  i have to pass the array here.
	Collections.reverse(Arrays.asList(num));
	System.out.println("After reverse Array value " + Arrays.toString(num));
	
	}
	//@Test
	public void getReverseString() {
	//there are many ways to reverse the number.
	//Step1- I have to declaare an array with help of wrapper class.because for reverse I'm using Collections utility class.(so int dont work here.)	
		String arr []= {"Welcome","To","The","Office"};
		System.out.println("Before reverse Array value " + Arrays.toString(arr));
	//Step2-With the help of Collections utility class i have to call reverse method and  i have to pass the array here.
	Collections.reverse(Arrays.asList(arr));
		
	System.out.println("After reverse Array value " + Arrays.toString(arr));
	
	}
	//Q4.How to reverse string without pre defined method or function?****
	//@Test
	public void getRevStringWithoutPreDefMethod() {
	//Step1- I have to declare a String variable
	String name = "Welcome"	;
	//Step2- Now I have to breakdown the characters of string ,to do that I have to call toCharArray method with the help of name variable  and store into char object array.	
	char[] rev=	name.toCharArray();
	//Step3-I'm using loop and decrement the loop.
	for(int i=rev.length-1; i>=0;i--) { // why -1? to make index and length number same
		System.out.print(rev[i]);
	}
	}
	//Q5.How to find out the second highest number?
	//@Test
	public void getSecondHighestNum() {
	//Step1-I'm declaring an Array 	
		int num[] = {200,900,234,432,1000,123,876,456,345,679};
	//Step2-With the help of Array object I'm calling the length and store into the int variable.
		int size = num.length;
	//Step3-By calling sort method I can sort the values to make them in order
		Arrays.sort(num);
		System.out.println("Sorted Array: " + Arrays.toString(num));
	//Step4-With the help of a variable passing the argument for the desire number	
		int secondHighest = num [size-2];
		System.out.println("Second Highest Number : " + secondHighest);
	}
	
	//Q6.How to break/Split the sentence?
	//@Test
	public void getSplitWord() {
		//Step1-I''m declaring a Sentence with the help  of a variable.
		String name = "Welcome to our company";
		//Step2-Now I'm creating a loop, inorder to breakdown I just call the split method with the help of variable.
		for(String newValue : name.split(" ")) {
		System.out.println(newValue);
		}
	}
	
	//Another way if possible remember
	//@Test
	public void getSplitWordB() {
		String name = "How Are You?";
		for(String newValue : name.split("\\s+")) {
		System.out.println(newValue);
		}
	}
	
	//Q7.How to find the duplicate value from Array without any predefined method or functions?
	//@Test
	public void getDuplicateVlue() {
	//Step1-I'm declaring an Array object which contains duplicate values.	
	int num []	= {500,75,900,300,750,500,200,100,200,300};
	//Step2-Now I'm using nested loop here . inside the loop  using java conditions  I will found the duplicate values.
	for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate Values: " + num[i]) ;
				}
			}
		}
	}
//Q8.How to remove the duplicate values from Arraylist?
//@Test	
	public void getRemoveDuplicateValues() {
	//Step1- I'm declaring an AraayList with duplicate value.
	List<Integer> withDup = new ArrayList<Integer>(Arrays.asList(500,75,900,300,750,500,200,100,200,300));
	//Step2- now with thee help of object I'm callig stream method, distinct method,collect method . 
	//then inside the collect i have to call Collectors,then toList method. Then I have to store in List.
	List<Integer> removeDup = withDup.stream().distinct().collect(Collectors.toList());	
	System.out.println("Duplicate value are removed : " + removeDup );	
	}
	
	//Another way-> if they ask remove duplcate using set
//@Test
	public void getRemDup() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,5,10,100,5,50,25,10,2,85));
		Set<Integer> set = new HashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println("without duplicate value :" + list);
	}
	//H.W-how to find the duplicate value from string?
	
	
	//Q9.How to find out the maximum value and minimum value?
	//@Test
	public void getMaxAndMinValue() {
		List<Integer> value = new ArrayList<Integer>(Arrays.asList(500,999,300,750,800,200,175,455));
    int maxValue= Collections.max(value);
    System.out.println("Maximum value is: " + maxValue ) ;
    int minValue= Collections.min(value);
    System.out.println("Minimum value is: " + minValue ) ;

	}
	
	//Q10. How to sort the data from string or how to sort the string using ArrayList?
	//@Test
	public void getSortData() {
	List<String> list = new ArrayList<String>(Arrays.asList("Ronaldo","Neymar","Messi","Biden","Trump","Chowdhury"));
	Collections.sort(list); // on Q5 we use Arrays.sort because it was array, here we use Collections because this one is ArrayList.
	//System.out.println("sorted data:" + list); //this also works try it
	for(String sortedValue : list) {
		System.out.println(("sorted data:" +sortedValue));	
	}
	//Now if they ask for any data suppose Chowdhury present or not? 
	if(list.contains("Chowdhury")) {
		System.out.println("Chowdhury is present");
	}
	else {
		System.out.println("Chowdhury is not present");
	}
	}
	
	//Q11.How to find out the vowels from String/ Sentence?
	//@Test
	public void getVowels() {
		
		String vowel = "Hi,Welcome to USA";
	    vowel=vowel.toLowerCase();
		for(int i =0; i<vowel.length();i++) {
			if(vowel.charAt(i)=='a'||vowel.charAt(i)=='e'||vowel.charAt(i)=='i'||vowel.charAt(i)=='o'||vowel.charAt(i)=='u' ) {
				//System.out.println(vowel.charAt(i));
				System.out.println(vowel.charAt(i) + " At Index Number :" + i);
			}
		}
	}
	
	
	//Q12.What is the fibonacci number?
	
	//0+1=1
	//1+1=2
	//2+1=3
	//3+2=5
	//5+3=8
	//8+5=13
	//13+8=21
	
	//Q13.How to find out the prime number?
	//Q14.How to find out the Palindrome number?
	
	//How to find uncommon(or different) values from two arrays ?
		public static void main(String[] args) {
			
	 int value1 [] = {1,2,3,4,5,5,6};
	 int value2 [] = {2,5,7,6,8,9};
	    
	    Set<Integer> set1 = new HashSet<>();
	    Set<Integer> set2 = new HashSet<>();
	    
	    for(int newValue1 : value1) {
	    	set1.add(newValue1);
	    	}
	    
	    for(int newValue2 : value2) {	
	    set2.add(newValue2)	;
	    }
	    
	    Set<Integer> allValues = new HashSet<>();
	    allValues.addAll(set1);
	    allValues.addAll(set2);
	    System.out.println("uncommon values are: " + allValues);
		}
	////How to find uncommon values from two list ?
		public static void mainA(String[] args) {
			
			 
		    
		    Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,5,6));
		    Set<Integer> set2 = new HashSet<>(Arrays.asList(2,5,7,6,8,9));
		    
		   
		    
		    Set<Integer> allValues = new HashSet<>();
		    allValues.addAll(set1);
		    allValues.addAll(set2);
		    System.out.println("uncommon values are: " + allValues);
			}
		
	}


