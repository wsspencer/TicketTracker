package edu.ncsu.csc216.tracker.command;

/**
 * This is a class meant to outline the characteristics and behaviors of CommandValue
 * @author Scott Spencer
 *
 */
public enum CommandValue {

	/**
	 * This is an instance of CommandValue meant to represent Possession that this class references
	 */
	public static final CommandValue POSSESSION;
	
	/**
	 * This is an instance of CommandValue meant to represent Accepted that this class references
	 */
	public static final CommandValue ACCEPTED;
	
	/**
	 * This is an instance of CommandValue meant to represent Closed that this class references
	 */
	public static final CommandValue CLOSED;
	
	/**
	 * This is an instance of CommandValue meant to represent Progress that this class references
	 */
	public static final CommandValue PROGRESS;
	
	/**
	 * This is an instance of CommandValue meant to represent Feedback that this class references
	 */
	public static final CommandValue FEEDBACK;
	
	/**
	 * This is a constructor method used to build a CommandValue
	 */
	public CommandValue() {
		
	}
}
