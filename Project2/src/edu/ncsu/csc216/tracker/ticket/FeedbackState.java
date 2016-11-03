package edu.ncsu.csc216.tracker.ticket;

import edu.ncsu.csc216.tracker.command.Command;

/**
 * This is a class for outlining the behaviors specific to the feedback state of a ticket
 * @author Scott Spencer
 *
 */
public class FeedbackState extends TrackedTicket implements TicketState {

	/**
	 * This is the constructor method used to construct the feedback state of a ticket
	 */
	private FeedbackState() {
		//TODO: Implementation
	}

	/**
	 * This is the method used to update the state of a ticket
	 * @param command this is the command passed from the UI
	 */
	@Override
	public void updateState(Command command) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * This is that method used to return the name of the state
	 * @return String the string representation of the state name
	 */
	public String getStateName() {
		//TO DO: Implementation
		return null;
	}
}
