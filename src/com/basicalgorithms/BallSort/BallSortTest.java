package com.basicalgorithms.BallSort;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BallSortTest {

	private BallRack rack = new BallRack();

	@Test
	public void getBalls_givenNoBalls_returnsEmptyArray() {
		assertEquals(0, rack.getBalls().length);
	}

	@Test
	public void getBalls_givenOneBall_returnsArrayWithBall() {
		
		rack.addBall(20);
		
		assertArrayEquals(new int[] {20}, rack.getBalls());
	}
	
	@Test
	public void getBalls_givenManyBalls_returnsAscendingSortedArray() {
		
		rack.addBall(55);
		rack.addBall(30);
		rack.addBall(10);
		rack.addBall(1);
		rack.addBall(29);
		rack.addBall(45);
		
		assertArrayEquals(new int[] {1, 10, 29, 30, 45, 55}, rack.getBalls());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void addBall_givenLessThan1_throwsIllegalArgumentException() {
		rack.addBall(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void addBall_givenGreaterThan60_throwsIllegalArgumentException() {
		rack.addBall(61);
	}
	
	@Test(expected = ArrayStoreException.class)
	public void addBall_givenDuplicate_throwsArrayStoreException() {
		rack.addBall(5);
		rack.addBall(5);
	}
}