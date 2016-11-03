package edu.ncsu.csc216.tracker.ticket;

import edu.ncsu.csc216.tracker.command.Command;

/**
 * This is the interface that is used to define behaviors and methods of the ticket states
 * @author Scott Spencer
 *
 */
public interface TicketState {
	
	/**
	 * This is the method used to update a  ticket's state
	 * @param command command passed from the UI
	 */
	public void updateState(Command command);
	
	/**
	 * This is the method used to return a String of the ticket's state's name.
	 * @return String the name of the ticket's state
	 */
	public String getStateName();
}
