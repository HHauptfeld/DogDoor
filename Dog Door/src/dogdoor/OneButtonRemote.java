package dogdoor;

public class OneButtonRemote implements Remote 
{
	private DogDoor dogDoor;
	
	public OneButtonRemote(DogDoor door)
	{
		this.dogDoor = door;
	}
	
	@Override
	public void press()
	{
		dogDoor.press();
	}

}
