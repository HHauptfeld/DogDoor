
package dogdoor;

import ddd.controller.DogDoorController;

public class TestDogDoor extends DogDoor
{
	public TestDogDoor(DogDoorController controller)
	{
		super(controller);
	}
	
	public void setIsOpen(boolean state)
	{
		super.isOpen = state;
	}

}
