package edu.ncsu.csc216.tracker.ticket_tracker;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;
import org.xml.sax.InputSource;

import edu.ncsu.csc216.ticket.xml.TicketIOException;
import edu.ncsu.csc216.ticket.xml.TicketReader;

/**
 * This is a test class intended to test the tracked ticket list
 * @author Scott Spencer
 *
 */
public class TrackedTicketListTest {

	/**
	 * This method tests the functionality of the lists' construction
	 */
	@Test
	public void testLists() {
		TrackedTicketList ttl = new TrackedTicketList();
		String tickListXML = "edu.ncsu.csc216.ticket.xml/TicketList";
		InputSource list = new InputSource(getClass().getResourceAsStream(tickListXML)); 
		TicketReader tReader;
		try {
			tReader = new TicketReader("/edu.ncsu.csc216.ticket.xml/TicketList.class");
			ttl.addXMLTickets(tReader.getTickets());
		} catch (TicketIOException e) {
			throw new IllegalArgumentException();
		}
		
		ttl.getTrackedTickets();
		ttl.getTicketById(2);
		ttl.addTrackedTicket("boop", "boop", "boop");
		ttl.getTicketsByOwner("boop");
		ttl.getTicketsBySubmitter("boop");
		ttl.addTrackedTicket("boop", "boop", "boop");
		
	}
}
