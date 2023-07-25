package javacoding.challenges;

import java.util.StringJoiner;

public class ImportantExtraCoding {
	public static void main(String[] args) {
		// converting String into int
				  String str= "500";	
		          int x=Integer.parseInt(str);
			      //System.out.println(x);
		 //another way
		          String str1 = "555";
		          int y=  Integer.valueOf(str1);
		         // System.out.println(y);

	  // converting int to String
					int k = 5;
					String name = String.valueOf(k);
					//System.out.println(name);
	 //another way
					
	               int number=50;   
	               String nam=Integer.toString(number);
	              // System.out.println(nam);
					
					
					
	// putting two strings together
					String name1 = "Hello";
					String name2 = "USA";
			        String result=name1.concat(" ").concat(name2);
			        //System.out.println(result);

	// adding two strings in StringJoiner class
			        String strA= "Lionel";
			        String strB="Messi";
					StringJoiner sj = new StringJoiner(" ");
					sj.add(strA).add(strB);
					//System.out.println(sj);

	// splitting string
					String str3 = "I Love USA";
					for (String newValue : str3.split(" ")) {
				    //System.out.println(newValue);
					}
	// Looking for the A in "Automation"
						String str4 = "Automation";
						str4=str4.toLowerCase();
						for (int i = 0; i < str4.length();i++) {
							
						if (str4.charAt(i) == 'a'){
							
						System.out.println(str4.charAt(i) + " at index " + i);
								
							}
							
						}

					}

}
