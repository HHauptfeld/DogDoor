/**
 * 
 */
package dogdoor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ddd.controller.DogDoorController;

/**
 * @author Hauptfeld
 *
 */
class DogDoorTest
{
	private DogDoor theDoor;
	private TestDogDoor testDoor;
	private Remote theRemote;
	
	@BeforeEach
	void setup()
	{
		testDoor = new TestDogDoor(new DogDoorController());
		theDoor = testDoor;
		theRemote = new OneButtonRemote(theDoor);
	}

	
	@Test
	void openDoorFromOneButtonRemote() 
	{ 
		assertFalse(theDoor.isOpen());
		theRemote.press();
		assertTrue(theDoor.isOpen());
	}
	
	@Test
	void closeDoorUsingOneButtonRemote()
	{
		testDoor.setIsOpen(true);
		assertTrue(theDoor.isOpen());
		theRemote.press();
		assertFalse(theDoor.isOpen());
	}

}
