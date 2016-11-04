package edu.ncsu.csc216.tracker.ticket;

import java.util.ArrayList;

import edu.ncsu.csc216.ticket.xml.Ticket;
import edu.ncsu.csc216.tracker.command.Command;

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
	private Command.Flag flag;
	
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
	public static final String NEW_NAME = "New";
	
	/**
	 * This is an instance constant for the assigned name
	 */
	public static final String ASSIGNED_NAME = "Assigned";
	
	/**
	 * This is an instance constant for the working name
	 */
	public static final String WORKING_NAME = "Working";
	
	/**
	 * This is an instance constant for the feedback name
	 */
	public static final String FEEDBACK_NAME = "Feedback";
	
	
	/**
	 * This is an instance constant for the closed name
	 */
	public static final String CLOSED_NAME = "Closed";
	
	
	/**
	 * This is an instance variable for the counter.  It is static so when it is incremented, that instance is shared
	 * by all counter instances in this class, making it a good ID generator.
	 */
	private static int counter = 1;
	
	
	/**
	 * This is the constructor method for this class
	 * @param title String representation of the ticket title
	 * @param submitter String representation of the ticket's submitter's name
	 * @param owner String representation of the ticket's owner's name
	 */
	public TrackedTicket(String title, String submitter, String owner) {
		//TO DO: Implementation
		this.submitter = submitter;
		this.title = title;
		this.owner = owner;
		//intialized to 1, when changed its static nature will change it across the class, to make it an ID generator
		TrackedTicket.counter = this.ticketId;
		TrackedTicket.incrementCounter();
	}
	
	/**
	 * This is the constructor method for this class when the other two parameters are not passed to it
	 * @param title String representation of the ticket's title
	 */
	public TrackedTicket(Ticket ticket) {
		//TO DO: Implementation
	}
	
	/**
	 * This is the voided method used to increment the class' counter
	 */
	public static void incrementCounter() {
		TrackedTicket.counter++;
	}
	
	/**
	 * This is the method used to return the ticket's identification number.
	 * @return int the ticket's ID number
	 */
	public int getTicketId() {
		return this.ticketId;
	}
	
	/**
	 * This is the method used to return the String of the "state name" (for determining state) of the ticket
	 * @return 
	 */
	public String getStateName() {
		return this.state.getStateName();
	}
	
	/**
	 * This is the method used to change the state of the ticket
	 * @param stateValue the name of the state we are going to set the ticket to
	 */
	private void setState(String stateValue) {
		//TO DO: if parameter is INCORRECT, throw illegalargumentexception
		if (stateValue == null) {
			throw new IllegalArgumentException();
		}
		//IF a New ticket, 
		if (this.getStateName().equals(this.NEW_NAME)) {
			if (stateValue.equals(this.ASSIGNED_NAME)) {

			}
		}
	}
	
	/**
	 * This is a getter method for returning a flag associated with this ticket
	 * @return Flag the flag  associated with this ticket
	 */
	public Command.Flag getFlag() {
		return this.flag;
	}
	
	/**
	 * This is a method for getting the name of the desired flag associated with this ticket
	 * @return String the name of the flag associated with this ticket
	 */
	public String getFlagString() {
		return this.flag.name();
	}
	
	/**
	 * This is the method used to set a flag to this ticket
	 * @param flag the String name of the flag
	 */
	private void setFlag(String flag) {
		if (flag.equals(Command.Flag.DUPLICATE)) {
			this.flag = Command.Flag.DUPLICATE;
		}
		if (flag.equals(Command.Flag.INAPPROPRIATE)) {
			this.flag = Command.Flag.INAPPROPRIATE;
		}
		if (flag.equals(Command.Flag.RESOLVED)) {
			this.flag = Command.Flag.RESOLVED;
		}
	}
	
	/**
	 * This is the method used to return the owner of this ticket's name
	 * @return String the string of the owner's name
	 */
	public String getOwner() {
		return this.owner;
	}
	
	/**
	 * This is the method used to return the title of this ticket
	 * @return String representing the title of the ticket
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * This is the method used to return the name of the submitter of this ticket
	 * @return String representing the submitter's name
	 */
	public String getSubmitter() {
		return this.submitter;
	}
	
	/**
	 * This is the method used to return the notes associated with this ticket
	 * @return ArrayList<Note>  this is the array list of notes associated with this ticket
	 */
	public ArrayList<Note> getNotes() {
		//no idea what this is suppose to do...
		return new ArrayList<Note>();
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
		if (counter <= 0) {
			throw new IllegalArgumentException();
		}
		TrackedTicket.counter = counter;
	}
	
	/**
	 * This is a method used to return the 2-D array of strings that represent the notes and note author
	 * on this ticket
	 * @return String[][] a 2-D array of strings
	 */
	public String[][] getNotesArray() {
		return null;
	}
	
	/**
	 * This is a class for the behaviors and methods of the assigned state
	 * @author Scott Spencer
	 *
	 */
	public class AssignedState implements TicketState {
		
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
			if (command.getCommand() == Command.CommandValue.ACCEPTED) {
				//Valid for the Assigned State
				//change to working state
			}
			
			if (command.getCommand() == Command.CommandValue.CLOSED) {
				//Valid for the Assigned State
				//change to closed state
			}
			
			if (command.getCommand() == Command. CommandValue.FEEDBACK || 
					command.getCommand() == Command.CommandValue.POSSESSION
					|| command.getCommand() == Command.CommandValue.PROGRESS) {
				//Invalid for Assigned State
				throw new UnsupportedOperationException();
			}
		}
		
		/**
		 * This is a method used to return the name of this state
		 * @return String name of the state
		 */
		public String getStateName() {
			return TrackedTicket.ASSIGNED_NAME;
		}
	}

	/**
	 * This is a class used to define the specific behaviors of the closed state of a ticket
	 * @author Scott Spencer
	 *
	 */
	public class ClosedState implements TicketState {

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
			if (command.getCommand() == Command.CommandValue.POSSESSION) {
				//Valid for the Closed state
			}
			
			if (command.getCommand() == Command.CommandValue.PROGRESS) {
				//Valid for the Closed state
			}
			
			if (command.getCommand() == Command.CommandValue.ACCEPTED || command.getCommand() == 
					Command.CommandValue.CLOSED || command.getCommand() == Command.CommandValue.FEEDBACK) {
				//Invalid for the Closed state
				throw new UnsupportedOperationException();
			}
		}

		/**
		 * This is the method used to return the name of the closed state
		 * @return String a string representation of the close state's name
		 */
		public String getStateName() {
			return TrackedTicket.CLOSED_NAME;
		}
	}

	/**
	 * This is a class for outlining the behaviors specific to the feedback state of a ticket
	 * @author Scott Spencer
	 *
	 */
	public class FeedbackState implements TicketState {
	
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
			if (command.getCommand() == Command.CommandValue.PROGRESS) {
				//Valid for FeedbackState
			}
			
			if (command.getCommand() == Command.CommandValue.ACCEPTED || command.getCommand() ==
					Command.CommandValue.CLOSED || command.getCommand() == Command.CommandValue.FEEDBACK
					|| command.getCommand() == Command.CommandValue.POSSESSION) {
				//Invalid for FeedbackState
				throw new UnsupportedOperationException();
			}
			
		}
		
		/**
		 * This is that method used to return the name of the state
		 * @return String the string representation of the state name
		 */
		public String getStateName() {
			return TrackedTicket.FEEDBACK_NAME;
		}
	}
	
	/**
	 * This is the class that is used to define the specific behaviors of the new ticket state
	 * @author Scott Spencer
	 *
	 */
	public class NewState implements TicketState {

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
			if (command.getCommand() == Command.CommandValue.ACCEPTED) {
				//Valid for New state
			}
			
			if (command.getCommand() == Command.CommandValue.CLOSED || command.getCommand() == 
					Command.CommandValue.FEEDBACK || command.getCommand() == Command.CommandValue.POSSESSION
					|| command.getCommand() == Command.CommandValue.PROGRESS) {
				//Invalid for New state
				throw new UnsupportedOperationException();
			}
			
		}
		
		/**
		 * This is the method used to return the name of the state
		 * @return String the string representation of the state's name
		 */
		public String getStateName() {
			return TrackedTicket.NEW_NAME;
		}
	}

	/**
	 * This is a class representing the behaviors specific to the working state of a ticket
	 * @author Scott Spencer
	 *
	 */
	public class WorkingState implements TicketState {
		
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
			if (command.getCommand() == Command.CommandValue.FEEDBACK) {
				//Valid for Working state
			}
			
			if (command.getCommand() == Command.CommandValue.CLOSED) {
				//Valid for Working state
			}
			
			if (command.getCommand() == Command.CommandValue.ACCEPTED) {
				//Valid for Working state
			}
			
			if (command.getCommand() == Command.CommandValue.PROGRESS) {
				//Valid for Working state
			}
			
			if (command.getCommand() == Command.CommandValue.POSSESSION) {
				//Invalid for Working state 
				throw new UnsupportedOperationException();
			}
		}
		
		/**
		 * This is the method to return the name of the state the ticket is in
		 * @return String representation of the state name
		 */
		public String getStateName() {
			return TrackedTicket.WORKING_NAME;
		}
	}
	
	/**
	 * Interface for states in the Ticket State Pattern.  All 
	 * concrete ticket states must implement the TicketState interface.
	 * 
	 * @author Dr. Sarah Heckman (sarah_heckman@ncsu.edu) 
	 */
	private interface TicketState {
		
		/**
		 * Update the {@link TrackedTicket} based on the given {@link Command}.
		 * An {@link UnsupportedOperationException} is throw if the {@link CommandValue}
		 * is not a valid action for the given state.  
		 * @param c {@link Command} describing the action that will update the {@link TrackedTicket}'s
		 * state.
		 * @throws UnsupportedOperationException if the {@link CommandValue} is not a valid action
		 * for the given state.
		 */
		void updateState(Command c);
		
		/**
		 * Returns the name of the current state as a String.
		 * @return the name of the current state as a String.
		 */
		String getStateName();
	
	}
}
