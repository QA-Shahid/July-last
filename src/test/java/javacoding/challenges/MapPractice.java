package javacoding.challenges;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
	//OLD WAY
		HashMap map = new HashMap();
		
	// we use this way
		HashMap<Integer,String> mapOne = new HashMap<Integer,String> ();
		mapOne.put(12345, "messi");// here we need to use put method
		mapOne.put(17645, "neymer");//duplicate value possibe but key unique
		mapOne.put(13245, "neymer");
		mapOne.put(null, "ronaldo"); //only one null key is possible
		mapOne.put(3445, null);      // null value no limit
		mapOne.put(965345, null);
		mapOne.put(45345, null);
		
		for(Entry newValue : mapOne.entrySet()) { // here Entry is class from Map
			System.out.println(newValue.getKey() + " " + newValue.getValue());
		}
		
	}
}
