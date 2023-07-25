package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {

	//How to declare List ? 
	public static void main(String[] args) {
		//ArrayList Decleration
		// we can declare Arraylist by 4 ways . But we use 3rd and 4th way most. 
		//for interview all ways we need to know 
		
		
		// 1st way
		ArrayList listOne = new ArrayList (); //before java 1.5 this way was used.Thats why showing error.
		listOne.add(200);                     //It is clalled non generic code.
		listOne.add(300);
		listOne.add("shahid");
		listOne.add("messi");
		
		//2nd way
		ArrayList<Integer> listTwo =new ArrayList<Integer>();
		listTwo.add(200);
		listTwo.add(200);
		listTwo.add(300);
		listTwo.add(400);
		listTwo.add(null);
		listTwo.add(null);
		listTwo.add(null);
		ArrayList<String> listThree = new ArrayList<String>();
		listThree.add("messi");
		listThree.add("ronaldo");
	    listThree.add("neymer");
	    System.out.println(listTwo.get(2)); // to see the 300 on output
	    System.out.println(listTwo); //output will be on same array
	    //for seperate output need to use loop
	    for(int i=0;i<listTwo.size();i++) {
	    	System.out.println(listTwo.get(i));
	    }
	    
	    //3rd way
	   List<Integer> listFour =new ArrayList<Integer>(); //Here listFour is a instance of interface List
	    
	    listFour.add(200);
	    listFour.add(400);
	    listFour.add(null); 
	    listFour.add(null);
	    List<String> listFive =new ArrayList<String>();  
	    listFive.add("messi");
	    listFive.add("ronaldo");
	    listFive.add("neymer");
	    listFive.add(null);
	    listFive.add(null);
	  
	   // 4th way
	   // Mostly used way
	    
	 List<Integer> listSix =new ArrayList<Integer>(Arrays.asList(200,300,400,null, null, 100,200,500)) ; 
	  // as much required i can  declare the value inside ,no limit 
	 List<String> listSeven =new ArrayList<String>(Arrays.asList("messi","ronaldo",null,"neymer", null)) ; 
	 
	 //LinkedList decleration
	 LinkedList<String> linkedlist1 = new LinkedList<String>();
	 linkedlist1.add("messi");
	 linkedlist1.add("Ronaldo");
	 LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
	 linkedlist2.add(200);
	 linkedlist2.add(400);
	 
	 //Vector decleration
	 Vector <String> vector1 =new Vector <String> ();
	 vector1.add("messi");
	 vector1.add("ronaldo");
	 
	 Vector <Integer> vector2 =new Vector <Integer> ();
	 vector2.add(200);
	 vector2.add(400);
	 
	 //Stack decleration
	 Stack<String> stack1 = new Stack<String> ();
	 stack1.add("messi");
	 stack1.add("ronaldo");
	 
	 Stack<Integer> stack2 = new Stack<Integer> ();
	 stack2.add(200);
	 stack2.add(400);
	}
}
