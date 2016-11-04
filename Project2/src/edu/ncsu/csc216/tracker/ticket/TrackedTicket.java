package edu.ncsu.csc216.tracker.ticket;

import java.util.ArrayList;

import edu.ncsu.csc216.ticket.xml.Ticket;
import edu.ncsu.csc216.tracker.command.Command;
import edu.ncsu.csc216.tracker.command.Flag;

/**
 * TrackedTicket is a class which maintains all of the history of the progression of the TrackedTicket through the 
 * Finite State Machine. The object is constructed with parameters title, submitter, and note. The submitter is the 
 * noteAuthor of the first Note in the TrackedTicket.
 * 
 * @author Scott Spencer
 *
 */
public class TrackedTicket {

	//INSTANCES
	/**
	 * This is an instance variable representing a ticket's state (passed to TicketState interface)
	 */
	private TicketState state;
	
	/**
	 * This is an instance variable of the Notes associated with the ticket (passed to Note)
	 */
	private Note notes;
	
	/**
	 * This is an instance variable for the flag associated with the ticket (passed to Flag)
	 */
	private Flag flag;
	
	/**
	 * This is an instance variable for the ticket's id number (integer).
	 */
	private int ticketId;
	
	/**
	 * This is an instance variable for the ticket's title (String).
	 */
	private String title;
	
	/**
	 * This is an instance variable for the ticket's submitter's name (String).
	 */
	private String submitter;
	
	/**
	 * This is an instance variable for the ticket's owner's name (String).
	 */
	private String owner;
	
	/**
	 * This is an instance constant for the new name
	 */
	public static final String NEW_NAME;
	
	/**
	 * This is an instance constant for the assigned name
	 */
	public static final String ASSIGNED_NAME;
	
	/**
	 * This is an instance constant for the working name
	 */
	public static final String WORKING_NAME;
	
	/**
	 * This is an instance constant for the feedback name
	 */
	public static final String FEEDBACK_NAME;
	
	
	/**
	 * This is an instance constant for the closed name
	 */
	public static final String CLOSED_NAME;
	
	
	/**
	 * This is an instance variable for the counter
	 */
	private static int counter = 0;
	
	
	/**
	 * This is the constructor method for this class
	 * @param title String representation of the ticket title
	 * @param submitter String representation of the ticket's submitter's name
	 * @param owner String representation of the ticket's owner's name
	 */
	public TrackedTicket(String title, String submitter, String owner) {
		//TO DO: Implementation
	}
	
	/**
	 * This is the constructor method for this class when the other two parameters are not passed to it
	 * @param title String representation of the ticket's title
	 */
	public TrackedTicket(String title) {
		//TO DO: Implementation
	}
	
	/**
	 * This is the voided method used to increment the class' counter
	 */
	public static void incrementCounter() {
		//TO DO: Implementation
	}
	
	/**
	 * This is the method used to return the ticket's identification number.
	 * @return int the ticket's ID number
	 */
	public int getTicketId() {
		//TO DO: Implementation
		return 0;
	}
	
	/**
	 * This is the method used to return the String of the "state name" (for determining state) of the ticket
	 * @return 
	 */
	public String getStateName() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to change the state of the ticket
	 * @param stateName the name of the state we are going to set the ticket to
	 */
	private void setState(String stateName) {
		//TO DO: Implementation
	}
	
	/**
	 * This is a getter method for returning a flag associated with this ticket
	 * @return Flag the flag  associated with this ticket
	 */
	public Flag getFlag() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method for getting the name of the desired flag associated with this ticket
	 * @return String the name of the flag associated with this ticket
	 */
	public String getFlagString() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to set a flag to this ticket
	 * @param flag the String name of the flag
	 */
	private void setFlag(String flag) {
		//TO DO: Implementation
	}
	
	/**
	 * This is the method used to return the owner of this ticket's name
	 * @return String the string of the owner's name
	 */
	public String getOwner() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to return the title of this ticket
	 * @return String representing the title of the ticket
	 */
	public String getTitle() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to return the name of the submitter of this ticket
	 * @return String representing the submitter's name
	 */
	public String getSubmitter() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to return the notes associated with this ticket
	 * @return ArrayList<Note>  this is the array list of notes associated with this ticket
	 */
	public ArrayList<Note> getNotes() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is the method used to update the ticket after receiving a command from the UI.
	 * @param command this is the command passed from the GUI
	 */
	public void update(Command command) {
		//TO DO: Implementation
	}
	
	/**
	 * This is a method used to return an XML ticket (this instance of this ticket)
	 * @return Ticket the instance of this ticket
	 */
	public Ticket getXMLTicket() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method used to alter the counter based on the parameterized integer
	 * @param counter an integer 
	 */
	public static void setCounter(int counter) {
		//TO DO: Implementation
	}
	
	/**
	 * This is a method used to return the 2-D array of strings that represent the notes on this ticket
	 * @return String[][] a 2-D array of strings
	 */
	public String[][] getNotesArray() {
		//TO DO: Implementation
		return null;
	}
}
