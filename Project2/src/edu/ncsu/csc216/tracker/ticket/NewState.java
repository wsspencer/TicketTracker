package edu.ncsu.csc216.tracker.ticket;

import edu.ncsu.csc216.tracker.command.Command;

/**
 * This is the class that is used to define the specific behaviors of the new ticket state
 * @author Scott Spencer
 *
 */
public class NewState extends TrackedTicket implements TicketState {

	/**
	 * This is the constructor class used to construct the new state of a ticket
	 */
	private NewState() {
		//TO DO: Implementation
	}

	/**
	 * This is the voided method used to update the state of a ticket
	 * @param command this is the command that is passed to the method from the GUI
	 */
	@Override
	public void updateState(Command command) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * This is the method used to return the name of the state
	 * @return String the string representation of the state's name
	 */
	public String getStateName() {
		//TO DO: Implementation
		return null;
	}
}
