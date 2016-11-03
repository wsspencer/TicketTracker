package edu.ncsu.csc216.tracker.ticket;

import edu.ncsu.csc216.tracker.command.Command;

/**
 * This is a class representing the behaviors specific to the working state of a ticket
 * @author Scott Spencer
 *
 */
public class WorkingState extends TrackedTicket implements TicketState {
	
	/**
	 * This is the constructor method for a working state
	 */
	private WorkingState() {
		 //TO DO: Implementation
	}
	
	/**
	 * This is the method used to update the state using the UI command
	 * @param command the UI command passed from the GUI
	 */
	@Override
	public void updateState(Command command) {
		//TO DO: Implementation
	}
	
	/**
	 * This is the method to return the name of the state the ticket is in
	 * @return String representation of the state name
	 */
	public String getStateName() {
		//TO DO: Implementation
		return null;
	}
}
