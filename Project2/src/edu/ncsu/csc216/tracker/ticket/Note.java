package edu.ncsu.csc216.tracker.ticket;

/**
 * This is the class meant to outline the characteristics and behaviors of the Note of a ticket
 * @author Scott Spencer
 *
 */
public class Note {

	/**
	 * This is the instance variable for the note's author
	 */
	private String noteAuthor;
	
	/**
	 * This is the instance variable for the note's text
	 */
	private String noteText;
	
	/**
	 * This is the constructor method for building a Note with the parameterized author and text
	 * @param author the author of the note
	 * @param text the text instide of a note
	 */
	public Note(String author, String text) {
		if (author == null || text == null) {
			throw new IllegalArgumentException();
		} 
		
		this.setNoteAuthor(author);
		this.setNoteText(text);
	}
	
	/**
	 * This is a getter method for returning the note's author as a String
	 * @return String the author of the note
	 */
	public String getNoteAuthor() {
		return this.noteAuthor;
	}
	
	/**
	 * This is the setter method for setting the value of the note's author
	 * @param author the String for the author's name 
	 */
	private void setNoteAuthor(String author) {
		this.noteAuthor = author;
	}
	
	/**
	 * This is the getter method for returning the note's text as a String
	 * @return String the string representation of the note's text
	 */
	public String getNoteText() {
		return this.noteText;
	}
	
	/**
	 * This is the setter method for setting a value for the note's text
	 * @param text the String representation of the note's text
	 */
	private void setNoteText(String text) {
		this.noteText = text;
	}
	
	/**
	 * Ths is the getter method for returning an array of 2 Strings representing the note author at index 0 and text 
	 * at index 1.
	 * @return String[] an array of notetext + author
	 */
	public String[] getNoteArray() {
		String[] noteArr = new String[2];
		noteArr[0] = this.noteAuthor;
		noteArr[1] = this.noteText;
		return noteArr;
	}
}
