package edu.ncsu.csc216.tracker.ticket_tracker;

import java.util.List;

import edu.ncsu.csc216.ticket.xml.Ticket;
import edu.ncsu.csc216.ticket.xml.TicketIOException;
import edu.ncsu.csc216.ticket.xml.TicketReader;
import edu.ncsu.csc216.ticket.xml.TicketWriter;
import edu.ncsu.csc216.tracker.command.Command;
import edu.ncsu.csc216.tracker.ticket.TrackedTicket;

/**
 * TicketTrackerModel maintains the current TrackedTicketList and handles activity around loading, saving, and 
 * creating new TrackedTicketLists.  For this, TicketTrackerModel will use TicketReader and TicketWriter from the 
 * TicketXML library.
 * 
 * @author Scott Spencer
 *
 */
public class TicketTrackerModel {
	
	/**
	 * This is an instance of TicketTrackerModel (passed to itself)
	 */
	private static TicketTrackerModel singleton;
	
	/**
	 * This is an instance of TicketTrackerModel (passed to TrackedTicketList)
	 */ 
	private TrackedTicketList trackedTicketList;
	
	/**
	 * This is a deviation from the UML.  It is a helper variable to store the list of Tickets
	 * read from the XML file.
	 */
	private List<Ticket> listXML;
	  
	/**
	 * This is the constructor method for TicketTrackerModel, which is private so that it cannot be called by any
	 * other method, we do not want the program instantiating this class anywhere but from the getInstance() method
	 */
	private TicketTrackerModel() {
		this.trackedTicketList = new TrackedTicketList();
		singleton = this;
	}
	
	/**
	 * This is the method we use to get an instance of TicketTrackerModel.  It's static so that it won't be passed
	 * inappropriately.
	 * @return TicketTrackerModel the instance of this class.
	 */
	public static TicketTrackerModel getInstance() {
		return TicketTrackerModel.singleton;
	}
	
	/**
	 * This is a voided method for saving the current tickets to a file.
	 * @param fileName the string of the filepath
	 */
	public void saveTicketsToFile(String fileName) {
			TicketWriter tWrite = new TicketWriter(fileName);
			try {
				tWrite.marshal();
			} catch (TicketIOException e) {
				throw new IllegalArgumentException();
			}
	} 
	
	/**
	 * This is a voided method for loading a file from the parameterized filename.
	 * @param filename a String representation of the filepath the file is located.
	 */
	public void loadTicketsFromFile(String filename) {
		TicketReader tRead;
		try {
			tRead = new TicketReader(filename);
		} catch (TicketIOException e) {
			throw new IllegalArgumentException();
		}
		this.listXML = tRead.getTickets();
		
	}
	
	/**
	 * This is a voided method simply used to create an entirely new ticket list.
	 */
	public void createNewTicketList() {
		this.trackedTicketList = new TrackedTicketList();
	}
	
	/**
	 * This is the method used to return a 2-dimensional array of Ticket objects, which we use to store our ticket list
	 * INDEXED AS:  [0] idNumber, [1] state name, [2] title
	 * (may need to build it from the IO input file
	 * @return Object[][] a 2-dimensional array for any Object (will need to be casted)
	 */ 
	public Object[][] getTicketListAsArray() {
		Object[][] temp = new String[listXML.size()][3];
		//builds array of arrays
		for (int i = 0; i < listXML.size(); i++) {
			temp[i][0] = listXML.get(i).getId(); //Integer array of IDs
			temp[i][1] = listXML.get(i).getState(); //String array of state names
			temp[i][2] = listXML.get(i).getTitle(); //String array of titles
		}
		return temp;
	}
	
	/**
	 * This is a method used to return the ticket list for a specific owner (which is passed as a parameterized 
	 * string)
	 * @param owner the String representation of the ticket owner
	 * @return Object[][] a 2-D array of ticket objects, specific to an owner
	 */
	public Object[][] getTicketListByOwnerAsArray(String owner) { 
		if (owner == null) {
			throw new IllegalArgumentException();
		}
		Object[][] ownArr = new Object[this.trackedTicketList.getTrackedTickets().size()][3];
		int j = 0;
		for (int i = 0; i < this.trackedTicketList.getTrackedTickets().size(); i++) {
			if (this.trackedTicketList.getTrackedTickets().get(i).getOwner().equals(owner)) {
				ownArr[j][0] = this.trackedTicketList.getTrackedTickets().get(i).getTicketId(); //Integer array of IDs
				ownArr[j][1] = this.trackedTicketList.getTrackedTickets().get(i).getStateName(); //String array of state names
				ownArr[j][2] = this.trackedTicketList.getTrackedTickets().get(i).getTitle(); //String array of titles
				j++;
			}
		}
		return ownArr;
	}
	
	/**
	 * This is a method used to return the ticket list for a specific submitter (which is passed as a parameterized 
	 * string)
	 * @param submitter the String representation of the ticket submitter
	 * @return Object[][] a 2-D array of ticket objects, specific to a submitter
	 */
	public Object[][] getTicketListBySubmitterAsArray(String submitter) {
		if (submitter == null) {
			throw new IllegalArgumentException();
		}
		Object[][] subArr = new Object[this.trackedTicketList.getTrackedTickets().size()][3];
		int j = 0;
		for (int i = 0; i < this.trackedTicketList.getTrackedTickets().size(); i++) {
			if (this.trackedTicketList.getTrackedTickets().get(i).getSubmitter().equals(submitter)) {
				subArr[j][0] = this.trackedTicketList.getTrackedTickets().get(i).getTicketId(); //Integer array of IDs
				subArr[j][1] = this.trackedTicketList.getTrackedTickets().get(i).getStateName(); //String array of state names
				subArr[j][2] = this.trackedTicketList.getTrackedTickets().get(i).getTitle(); //String array of titles
				j++;
			}
		}
		return subArr;
	}
	
	/**
	 * This is a method used to return a specific ticket (which we find with the parameterized ID number)
	 * @param idNumber the identifying number specific to that ticket
	 * @return TrackedTicket the ticket corresponding to the ID number
	 */
	public TrackedTicket getTicketById(int idNumber) {
		return this.trackedTicketList.getTicketById(idNumber);
	}
	
	/**
	 * This is a method used to execute a parameterized GUI command  
	 * @param value the integer value used to ???
	 * @param command the Command we want to execute
	 */
	public void executeCommand(int value, Command command) {
		//TO DO: Implementation
		for (int i = 0; i < this.trackedTicketList.getTrackedTickets().size(); i++) {
			if (this.trackedTicketList.getTrackedTickets().get(i).getTicketId() == value) {
				//Execute command?
				this.trackedTicketList.getTrackedTickets().get(i).update(command); 
			}
		}
	} 
	
	/**
	 * This is a method used to delete a ticket, found by its parameterized identification number.
	 * @param idNumber the integer used to identify specific tickets
	 */
	public void deleteTicketById(int idNumber) {
		for (int i = 0; i < this.listXML.size(); i++) {
			if (this.trackedTicketList.getTrackedTickets().get(i).getTicketId() == idNumber) {
				this.trackedTicketList.deleteTicketById(idNumber);
			}
		}
	}
	
	/**
	 * This is the method used to create tickets to be added with the parameters into the list.
	 * @param title the ticket's title
	 * @param submitter the name of the submitter
	 * @param owner the name of the owner
	 */
	public void addTicketToList(String title, String submitter, String owner) {
		this.trackedTicketList.addTrackedTicket(title, submitter, owner);
	}
}
