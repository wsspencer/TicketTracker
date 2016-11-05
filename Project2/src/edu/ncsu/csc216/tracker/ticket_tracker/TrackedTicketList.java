package edu.ncsu.csc216.tracker.ticket_tracker;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import edu.ncsu.csc216.ticket.*;
import edu.ncsu.csc216.ticket.xml.Ticket;
import edu.ncsu.csc216.ticket.xml.TicketIOException;
import edu.ncsu.csc216.ticket.xml.TicketReader;
import edu.ncsu.csc216.ticket.xml.TicketWriter;
import edu.ncsu.csc216.tracker.command.Command;
import edu.ncsu.csc216.tracker.ticket.TrackedTicket;

/**
 * This is the method which maintains a List of TrackedTickets.
 * @author Scott Spencer
 *
 */
public class TrackedTicketList {
	
	/**
	 * This is an instance of TrackedTicketList (to be passed to TrackedTicket)
	 */
	private TicketTrackerModel trackedTicketList;

	/**
	 * This is a class constant used for the initial value of our ticket counter.
	 */
	private static final int INITIAL_COUNTER_VALUE = 1;

			
	/**
	 * This is the constructor method to create and set initial values of the TrackedTicketList
	 */
	public TrackedTicketList() {  
		this.trackedTicketList.getTicketListAsArray();
		TrackedTicket.setCounter(INITIAL_COUNTER_VALUE);
	}
	
	/**
	 * This is a method used to add a tracked ticket to the class list
	 * @param title the String name of the ticket
	 * @param submitter the String name of the submitter
	 * @param owner the String name of the owner
	 * @return int the integer representation of the ticket (identification number)
	 */
	public int addTrackedTicket(String title, String submitter, String owner) {
		//by constructing a new ticket, we perform an increment of the counter in the constructor, 
		//so a new ID is generated.
		TrackedTicket tt = new TrackedTicket(title, submitter, owner);
		this.trackedTicketList.addTicketToList(title, submitter, owner);
		return tt.getTicketId();
	}
	
	/**
	 * This is the method used for adding tickets to the XML file
	 * @param ticketList this is the List of abstract object type ticket(s)
	 */
	public void addXMLTickets(List<Ticket> ticketList) {
		//reads in the files, adds param to them, writes the content to the same location.
		try {
			TicketReader tReader = new TicketReader("edu.ncsu.csc216.ticket.xml/TicketList.class");
			TicketWriter tWriter = new TicketWriter("edu.ncsu.csc216.ticket.xml/TicketList.class");
			for (int i = 0; i < ticketList.size(); i++) {
				tReader.getTickets().add(ticketList.get(i));
			}	
			for (int i = 0; i < tReader.getTickets().size(); i++) {
				tWriter.addItem(tReader.getTickets().get(i));
			}
		} catch (TicketIOException e) {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * This is the method used to return this instance's list of abstract object type: TrackedTicket(s)
	 * @return this instance's List of abstract object type: TrackedTicket(s)
	 */
	public ArrayList<TrackedTicket> getTrackedTickets() {
		ArrayList<TrackedTicket> tt = new ArrayList<TrackedTicket>();
		//counting from 1 to the size because the ticket ID counts from 1 to its size
		for (int i = 1; i <= this.trackedTicketList.getTicketListAsArray().length; i++) {
			tt.add(this.trackedTicketList.getTicketById(i));
		}
		return tt;
	}
	
	/**
	 * This is a method used to return this instance's tickets by a specific submitter
	 * @return this instance's List by submitter of abstract object type: TracketTicket(s)
	 */
	public ArrayList<TrackedTicket> getTicketsBySubmitter(String submitter) {
		ArrayList<TrackedTicket> tickBySub = new ArrayList<TrackedTicket>();
		for (int i = 1; i <= this.trackedTicketList.getTicketListBySubmitterAsArray(submitter).length; i++) {
			tickBySub.add(this.trackedTicketList.getTicketById(i));
		}
		return tickBySub;
	}
	
	/**
	 * This is the method used to return this instance's list of tickets by a specific owner.
	 * @return this instance's List by owner of abstract object type: TrackedTicket(s)
	 */
	public ArrayList<TrackedTicket> getTicketsByOwner(String owner) {
		ArrayList<TrackedTicket> tickByOwn = new ArrayList<TrackedTicket>();
		for (int i = 1; i <= this.trackedTicketList.getTicketListByOwnerAsArray(owner).length; i++) {
			tickByOwn.add(this.trackedTicketList.getTicketById(i));
		}
		return tickByOwn;
	}
	
	/**
	 * This is the method used to return a tracked ticket specific to the parameterized ID number.
	 * @param idNumber the unique identification number (integer) of the desired ticket
	 * @return TrackedTicket the ticket associated with the parameterized  ID number 
	 */
	public TrackedTicket getTicketById(int idNumber) {
		//run loop until you find the index (i) where the ID number is found in the array of tickets
		for (int i = 0; i < this.getTrackedTickets().size(); i++) {
			//cast to integer since the array was build as a multi-dimensional object array 
			//(done because array is made of an int and 2 strings
			if ((Integer) this.trackedTicketList.getTicketListAsArray()[i][0] == idNumber) {
				return this.getTrackedTickets().get(i);
			}
		}
		return null;
	}
	
	/**
	 * This is the method used to execute a specific command passed from the GUI
	 * @param value integer used for ????
	 * @param command the command passed from the UI
	 */
	public void executeCommand(int value, Command command) {
		
	}
	
	/**
	 * This is a method for deleting a ticket with the parameterized ID number.
	 * @param idNumber the integer identification number 
	 */
	public void deleteTicketById(int idNumber) {
		
	}
}
