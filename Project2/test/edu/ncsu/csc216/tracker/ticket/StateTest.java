package edu.ncsu.csc216.tracker.ticket;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.ticket.xml.Ticket;
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
		tt.setCounter(1);
		assertEquals(1, tt.getTicketId());
		
		try {
			tt.setCounter(0);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(tt.getTicketId(), 1);
		}
	}
	
	/**
	 * This is a method used to test the trackedTicket class (specifically the state functionality)
	 */
	@Test
	public void testStates() {
		Ticket t = new Ticket();
		t.setSubmitter("Me");
		t.setOwner("Myself");
		t.setTitle("title");
		TrackedTicket tt1 = new TrackedTicket(t);
		TrackedTicket tt2 = new TrackedTicket("title", "Me", "Myself");
		assertEquals(1, tt2.getTicketId());
		assertEquals("Me", t.getSubmitter());
		assertEquals("Myself", t.getOwner());
		assertEquals("title", t.getTitle());
	}
}
