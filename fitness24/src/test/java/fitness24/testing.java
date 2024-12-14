package fitness24;

import fitness24.firstclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class testing {

	
	
	@Test
	public void testadd() {
		
		
		
		
		firstclass ob = new firstclass();
		
		int expected = 10;
		
		int actual= ob.add(5,5);
		
		assertTrue(actual==expected);
		
		

	}


	
	


}
