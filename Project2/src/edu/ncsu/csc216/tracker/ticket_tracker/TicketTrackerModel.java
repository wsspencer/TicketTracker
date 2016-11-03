package edu.ncsu.csc216.tracker.ticket_tracker;

import edu.ncsu.csc216.tracker.command.Command;
import edu.ncsu.csc216.tracker.ticket.TrackedTicket;

/**
 * TicketTrackerModel maintains the current TrackedTicketList and handles activity around loading, saving, and 
 * creating new TrackedTicketLists.  For this, TicketTrackerModel will use TicketReader and TicketWriter from the 
 * TicketXML library.
 * 
 * @author Scott Spencer
 *
 */
public class TicketTrackerModel {
	
	/**
	 * This is an instance of TicketTrackerModel (passed to itself)
	 */
	private TicketTrackerModel singleton;
	
	/**
	 * This is an instance of TicketTrackerModel (passed to TrackedTicketList)
	 */
	private TicketTrackerModel trackedTicketList;
	
	/**
	 * This is the constructor method for TicketTrackerModel, which is private so that it cannot be called by any
	 * other method, we do not want the program instantiating this class anywhere but from the getInstance() method
	 */
	private TicketTrackerModel() {
		//TO DO: Implementation
	}
	
	/**
	 * This is the method we use to get an instance of TicketTrackerModel.  It's static so that it won't be passed
	 * inappropriately.
	 * @return TicketTrackerModel the instance of this class.
	 */
	public static TicketTrackerModel getInstance() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a voided method for saving the current tickets to a file.
	 */
	public void saveTicketsToFile() {
		//TO DO: Implementation
	}
	
	/**
	 * This is a voided method for loading a file from the parameterized filename.
	 * @param filename a String representation of the filepath the file is located.
	 */
	public void loadTicketsFromFile(String filename) {
		//TO DO: Implementation
	}
	
	/**
	 * This is a voided method simply used to create an entirely new ticket list.
	 */
	public void createNewTicketList() {
		//TO DO: Implementation
	}
	
	/**
	 * This is the method used to return a 2-dimensional array of Ticket objects, which we use to store our ticket list
	 * @return
	 */
	public Object[][] getTicketListAsArray() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method used to return the ticket list for a specific owner (which is passed as a parameterized 
	 * string)
	 * @param owner the String representation of the ticket owner
	 * @return Object[][] a 2-D array of ticket objects, specific to an owner
	 */
	public Object[][] getTicketListByOwnerAsArray(String owner) { 
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method used to return the ticket list for a specific submitter (which is passed as a parameterized 
	 * string)
	 * @param submitter the String representation of the ticket submitter
	 * @return Object[][] a 2-D array of ticket objects, specific to a submitter
	 */
	public Object[][] getTicketListBySubmitterAsArray(String submitter) {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method used to return a specific ticket (which we find with the parameterized ID number)
	 * @param idNumber the identifying number specific to that ticket
	 * @return TrackedTicket the ticket corresponding to the ID number
	 */
	public TrackedTicket getTicketById(int idNumber) {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method used to execute a parameterized GUI command  
	 * @param value the integer value used to ???
	 * @param command the Command we want to execute
	 */
	public void executeCommand(int value, Command command) {
		//TO DO: Implementation
	} 
	
	/**
	 * This is a method used to delete a ticket, found by its parameterized identification number.
	 * @param idNumber the integer used to identify specific tickets
	 */
	public void deleteTicketById(int idNumber) {
		
	}
	
	/**
	 * This is the method used to create tickets to be added with the parameters into the list.
	 * @param title the ticket's title
	 * @param submitter the name of the submitter
	 * @param owner the name of the owner
	 */
	public void addTicketToList(String title, String submitter, String owner) {
		
	}
}
