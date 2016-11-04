package edu.ncsu.csc216.tracker.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandTest {

	@Test
	public void testCommandConstruction() {
		//Check that null command value throws exception
		try {
			Command com1 = new Command(null, "me", Command.Flag.DUPLICATE, "me", "boop");
			fail();
		} catch (IllegalArgumentException e) {
			//Pass
		}
		//check that null author throws exception
		try {
			Command com2 = new Command(Command.CommandValue.ACCEPTED, "me", Command.Flag.DUPLICATE,
					null, "boop");
			fail();
		} catch (IllegalArgumentException e) {
			//Pass
		}
		//check that null notetext throws exception
		try {
			Command com3 = new Command(Command.CommandValue.ACCEPTED, "me", Command.Flag.DUPLICATE,
					"me", null);
			fail();
		} catch (IllegalArgumentException e) {
			//Pass
		}
		//check that command value of possession and null owner throws exception
		try {
			Command com4 = new Command(Command.CommandValue.POSSESSION, null, Command.Flag.DUPLICATE,
					"me", "boop");
			fail();
		} catch (IllegalArgumentException e) {
			//Pass
		}
		//Check that command value of possession and empty owner throws exception
		try {
			Command com5 = new Command(Command.CommandValue.POSSESSION, "", Command.Flag.DUPLICATE,
					"me", "boop");
			fail();
		} catch (IllegalArgumentException e) {
			//Pass
		}
		//Check that command value of closed and null flag throws exception
		try {
			Command com6 = new Command(Command.CommandValue.CLOSED, "me", null, "me", "boop");
			fail();
		} catch (IllegalArgumentException e) {
			//Pass
		}
		//Check that the fields set under normal conditions 
		Command com7 = new Command(Command.CommandValue.ACCEPTED, "me", Command.Flag.RESOLVED,
				"me", "boop");
		assertEquals("me", com7.getOwner());
		assertEquals(Command.CommandValue.ACCEPTED, com7.getCommand());
		assertEquals(Command.Flag.RESOLVED, com7.getFlag());
		assertEquals("me", com7.getNoteAuthor());
		assertEquals("boop", com7.getNoteText());
	}
	
	@Test
	public void testCommand() {
		
	}

}
