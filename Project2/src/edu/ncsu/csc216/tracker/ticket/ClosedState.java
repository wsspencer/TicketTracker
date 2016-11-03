package edu.ncsu.csc216.tracker.ticket;

import edu.ncsu.csc216.tracker.command.Command;

/**
 * This is a class used to define the specific behaviors of the closed state of a ticket
 * @author Scott Spencer
 *
 */
public class ClosedState extends TrackedTicket implements TicketState {

	/**
	 * This is a constructor method used to construct the closed state
	 */
	private ClosedState() {
		//TO DO: Implementation
	}
	
	/**
	 * This is the voided method used to update the state given UI 
	 * @param command the command passed from the GUI
	 */
	@Override
	public void updateState(Command command) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This is the method used to return the name of the closed state
	 * @return String a string representation of the close state's name
	 */
	public String getStateName() {
		//TO DO: Implementation
		return null;
	}
}
