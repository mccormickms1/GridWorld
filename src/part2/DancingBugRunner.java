import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
	
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 1, 7, 1, 5};
        
        ActorWorld world = new ActorWorld();
		DancingBug alice = new DancingBug(array);
		alice.setColor(Color.ORANGE);
		DancingBug bob = new DancingBug(array);
		world.add(new Location(7, 8), alice);
		world.add(new Location(5, 5), bob);
		world.show();
	}
}