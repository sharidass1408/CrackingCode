package com.chapter3.pg202;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ThreeStacksInSingleArrayTest {

	@Test
	void firstElementPushTest() {
		
		ThreeStacksInSingleArray specialArray = new ThreeStacksInSingleArray();
		
		try {
			specialArray.push(0, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(5, specialArray.buffer[0]);
	}
	
	@Test
	void pushAfterElementsAfterBufferSizeTest() {
		
		ThreeStacksInSingleArray specialArray = new ThreeStacksInSingleArray();
		
		assertThrows(Exception.class, () ->  {
			specialArray.push(0, 5);
			specialArray.push(0, 1);
			specialArray.push(0, 3);
			
		} );
	}
	
	@Test
	void popFirstElement() {
		
		ThreeStacksInSingleArray specialArray = new ThreeStacksInSingleArray();
		int poppedElement = 0;
		try {
			specialArray.push(0, 5);
			poppedElement = specialArray.pop(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(5, poppedElement);
	}
	
	@Test
	void popbeyondLastElement() {
		
		ThreeStacksInSingleArray specialArray = new ThreeStacksInSingleArray();
		
		assertThrows(Exception.class, () ->  {
			specialArray.push(0, 5);
			specialArray.pop(0);
			specialArray.pop(0);
			
		} );
	}

}
