import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		SpiralBug alice = new SpiralBug(10);
		alice.setColor(Color.ORANGE);
		world.add(new Location(9, 0), alice);
		world.show();
	}
}