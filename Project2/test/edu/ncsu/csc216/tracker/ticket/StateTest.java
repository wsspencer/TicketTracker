package edu.ncsu.csc216.tracker.ticket;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This is a class meant to test the ticket state functionality
 * @author Scott Spencer
 *
 */
public class StateTest {
	/**
	 * Method to test the tracked ticket functionality
	 */
	@Test
	public void testTrackedTicket() {
		TrackedTicket tt = new TrackedTicket("title", "Me", "Myself");
		
		assertEquals(1, tt.getTicketId());
		tt.incrementCounter();
		assertEquals(2, tt.getTicketId());
	}
		
}
