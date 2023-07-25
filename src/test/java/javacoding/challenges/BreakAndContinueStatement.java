package javacoding.challenges;

import org.testng.annotations.Test;

public class BreakAndContinueStatement {

	@Test
	public void getBreakTheLoop(){
		
		int num = 10; 
	//I want to break the loop at 5
		for(int i=0;i<num;i++) {
		   if(i==5)
			break;
			System.out.println(i);
		}
		
	}
	//@Test
	public void getSkipTheValue() {
		int num = 10; 
		//I want to skip the  4 and 7
			for(int i=0;i<num;i++) {
			   if(i==4 || i ==7 )
				continue;
				System.out.println(i);
			}
	}
	
	
	
}
