package edu.ncsu.csc216.tracker.ticket_tracker;

import java.awt.List;

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
	private TrackedTicketList tickets;

	/**
	 * This is a class constant used for the initial value of our ticket counter.
	 */
	private static final int INITIAL_COUNTER_VALUE = 1;
	
	/**
	 * This is the constructor method to create and set initial values of the TrackedTicketList
	 */
	public TrackedTicketList() {
		//TO DO: Implementation
	}
	
	/**
	 * This is a method used to add a tracked ticket to the class list
	 * @param title the String name of the ticket
	 * @param submitter the String name of the submitter
	 * @param owner the String name of the owner
	 * @return int the integer representation of the ticket (identification number)
	 */
	public int addTrackedTicket(String title, String submitter, String owner) {
		//TO DO: Implementation
		return 0;
	}
	
	/**
	 * This is the method used for adding tickets to the XML file
	 * @param ticketList this is the List of abstract object type ticket(s)
	 */
	public void addXMLTikets(List<Ticket> ticketList) {
		//TO DO: Implementation
	}
	
	/**
	 * This is the method used to return this instance's list of abstract object type: TrackedTicket(s)
	 * @return this instance's List of abstract object type: TrackedTicket(s)
	 */
	public List<TrackedTicket> getTrackedTickets() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method used to return this instance's tickets by a specific submitter
	 * @return this instance's List by submitter of abstract object type: TracketTicket(s)
	 */
	public List<TrackedTicket> getTicketsBySubmitter(String submitter) {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to return this instance's list of tickets by a specific owner.
	 * @return this instance's List by owner of abstract object type: TrackedTicket(s)
	 */
	public List<TrackedTicket> getTicketsByOwner(String owner) {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to return a tracked ticket specific to the parameterized ID number.
	 * @param idNumber the unique identification number (integer) of the desired ticket
	 * @return TrackedTicket the ticket associated with the parameterized  ID number 
	 */
	public TrackedTicket getTicketById(int idNumber) {
		//TO DO: Implementation
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
