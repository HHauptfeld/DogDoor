package dogdoor;

public interface Remote {

	default void press() {throw new RuntimeException("Not implemented"); };

	default void press(boolean openButton) 
	{
		throw new RuntimeException("Not implemented"); 
	};
}