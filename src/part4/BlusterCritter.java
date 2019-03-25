import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class BlusterCritter extends Critter {
	
	private static final double BRIGHTENING_FACTOR = 0.1;
    private int courageFactor = 0;

    public BlusterCritter(int c) {
        c = this.courageFactor;
    }

	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
        System.out.println(n);
		if (n > courageFactor) {
			brighten();
			return;
		}

	}

	private void brighten() {   
		Color c = getColor();   
		int red = (int) (c.getRed() * (1 + BRIGHTENING_FACTOR));   
		int green = (int) (c.getGreen() * (1 + BRIGHTENING_FACTOR));   
		int blue = (int) (c.getBlue() * (1 + BRIGHTENING_FACTOR));

		setColor(new Color(red, green, blue));
	} 

}
