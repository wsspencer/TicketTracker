package edu.ncsu.csc216.tracker.command;

/**
 * This is a class used to define the characteristics and behaviors of a Command
 * @author Scott Spencer
 *
 */
public class Command {
	/**
	 * This is a class meant to outline the characteristics and behaviors of CommandValue
	 * @author Scott Spencer
	 *
	 */
	public static enum CommandValue {  
		POSSESSION,
		ACCEPTED, 
		CLOSED, 
		PROGRESS, 
		FEEDBACK 
	}
	
	/**
	 * This is an enumeration outlining the possibilities of a Flag (accessed as such: "Flag.DUPLICATE")
	 * @author Scott Spencer
	 *
	 */
	public static enum Flag { 
		DUPLICATE, 
		INAPPROPRIATE, 
		RESOLVED 
	}	
	
	//Instances, enums accessed e.g. "CommandValue.CLOSED"
	/**
	 * This is an instance of a flag ENUMERATION that this command will reference (passed to Flag)
	 */
	private Flag flag;
	
	/**
	 * This is an instance of a command value ENUMERATION that this command will reference (passed to CommandValue)
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
	private String noteText;
	
	/**
	 * This is an instance variable for the author of the note
	 */
	private String noteAuthor;
	
	/**
	 * This is a constructor method for building a command
	 * @param c the value of the command
	 * @param owner the current ticket's owner
	 * @param flag the current ticket's flag
	 * @param noteAuthor the current ticket's notes 
	 * @param noteText the current ticket's note's author
	 */
	public Command(CommandValue c, String owner, Flag flag, String noteAuthor, String noteText) {
		if (c == null || noteAuthor == null || noteText == null) {
			throw new IllegalArgumentException();
		}
		
		if (c == CommandValue.POSSESSION && owner == null || owner.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		if (c == CommandValue.CLOSED && flag == null) {
			throw new IllegalArgumentException();
		}
		
		this.comVal = c;
		this.owner = owner;
		this.flag = flag;
		this.noteAuthor = noteAuthor;
		this.noteText = noteText;
	}
	 
	/**
	 * This is a getter method for returning the command value of the command
	 * @return CommandValue, the value of the command
	 */
	public CommandValue getCommand() {
		return this.comVal;
	}
	
	/**
	 * This is a method for returning the owner of the current ticket
	 * @return String the name of the owner
	 */
	public String getOwner() {
		return this.owner;
	}
	
	/**
	 * This is a method for returning the flag of the current ticket
	 * @return Flag the flag we are working with
	 */
	public Flag getFlag() {
		return this.flag;
	}
	
	/**
	 * This is a method for returning the note's text
	 * @return String the text of the note
	 */
	public String getNoteText() {
		return this.noteText;
	}
	
	/**
	 * This is a method for returning the note's author
	 * @return String of the author's name
	 */
	public String getNoteAuthor() {
		return this.noteAuthor;
	}
}
