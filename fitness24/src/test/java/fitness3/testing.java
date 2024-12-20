package fitness3;

import static org.junit.Assert.*;

import org.junit.Test;

import fitness3.firstclass;

public class testing {

	
	
	@Test
	public void testadd() {
		
		
		
		
		firstclass ob = new firstclass();
		
		int expected = 10;
		
		int actual= ob.add(5,5);
		
		assertTrue(actual==expected);
		
		

	}


	
	


}
