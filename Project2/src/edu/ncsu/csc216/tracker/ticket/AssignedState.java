package edu.ncsu.csc216.tracker.ticket;

import edu.ncsu.csc216.tracker.command.Command;

/**
 * This is a class for the behaviors and methods 
 * @author Scott Spencer
 *
 */
public class AssignedState extends TrackedTicket implements TicketState {
	
	/**
	 * This is a constructor method for the assigned state
	 */
	private AssignedState() {
		//TO DO: Implementation
	}
	
	/**
	 * This is a method to update the state given a UI commmand
	 * @param command the command passed from the GUI
	 */
	@Override
	public void updateState(Command command) {
		//TO DO: Implementation
	}
	
	/**
	 * This is a method used to return the name of this state
	 * @return String name of the state
	 */
	public String getStateName() {
		//TO DO: Implementation
		return null;
	}
}
