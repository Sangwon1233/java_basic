package lesson09_interface.starcraft;

public class Tank extends AirUnit implements Repairable{
	boolean siege;
	
	void toggleSige() {
		siege= !siege;
	}
	
}
