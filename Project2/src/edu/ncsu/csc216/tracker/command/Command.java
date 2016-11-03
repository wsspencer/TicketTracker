package edu.ncsu.csc216.tracker.command;

/**
 * This is a class used to define the characteristics and behaviors of a Command
 * @author Scott Spencer
 *
 */
public class Command {
	
	//Instances
	/**
	 * This is an instance of a flag that this command will reference (passed to Flag)
	 */
	private Flag flag;
	
	/**
	 * This is an instance of a command value that this command will reference (passed to CommandValue)
	 */
	private CommandValue comVal;

	/**
	 * This is a class constant for the duplicate name
	 */
	public static final String F_DUPLICATE = "Duplicate";
	
	/**
	 * This is a class constant for the inappropriate name
	 */
	public static final String F_INAPPROPRIATE = "Inappropriate";
	
	/**
	 * This is a class constant for the resolved name
	 */
	public static final String F_RESOLVED = "Resolved";
	
	/**
	 * This is an instance variable for the name of the owner
	 */
	private String owner;
	
	/**
	 * This is an instance variable for the note
	 */
	private String note;
	
	/**
	 * This is an instance variable for the author of the note
	 */
	private String noteAuthor;
	
	/**
	 * This is a constructor method for building a command
	 * @param value the value of the command
	 * @param owner the current ticket's owner
	 * @param flag the current ticket's flag
	 * @param note the current ticket's notes 
	 * @param noteAuthor the current ticket's note's author
	 */
	public Command(CommandValue value, String owner, Flag flag, String note, String noteAuthor) {
		//TO DO: Implementation
	}
	
	/**
	 * This is a getter method for returning the command value of the command
	 * @return CommandValue, the value of the command
	 */
	public CommandValue getCommand() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method for returning the owner of the current ticket
	 * @return String the name of the owner
	 */
	public String getOwner() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method for returning the flag of the current ticket
	 * @return Flag the flag we are working with
	 */
	public Flag getFlag() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method for returning the note's text
	 * @return String the text of the note
	 */
	public String getNoteText() {
		//TO DO: Implementation
		return null;
	}
	
	/**
	 * This is a method for returning the note's author
	 * @return String of the author's name
	 */
	public String getNoteAuthor() {
		//TO DO: Implementation
		return null;
	}
}
