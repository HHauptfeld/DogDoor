package dogdoor;

import ddd.controller.DogDoorController;

public class DogDoor 
{
	private DogDoorController controller;
	protected boolean isOpen;
	
	/**
	 * The unique constructor for the DogDoor injects a DogDoorController
	 * that is used for communicating with the physical controller.
	 * @param controller the controller to communicate with
	 */
	public DogDoor(DogDoorController controller)
	{
		this.controller = controller;
		isOpen = false;
	}
	
	/**
	 * This method is called when the button is pressed on a 1-button
	 * remote. If the door is open then it will be closed and if the
	 * door is closed when this method is called then it will be opened.
	 */
	public void press()
	{
		if (isOpen) {
			controller.close();
		} else {
			controller.open();
		}
		isOpen = !isOpen;
	}
	
	/**
	 * @return the state of the door: open -> true, closed -> false
	 */
	public boolean isOpen()
	{
		return isOpen;
	}

}
