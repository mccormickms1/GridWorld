import info.gridworld.actor.Bug;

import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

public class Jumper extends Bug {

    public Jumper() {
        
    }

	public void act() {
		if (canMove()) {
            move();
		} else {
            turn();
            turn();
        }
	}

    public boolean canMove() {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return false;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next2 = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(next2)) {
            return false;
        }
        Actor neighbor = gr.get(next2);
        return (neighbor == null);

    }

    public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next2 = next.getAdjacentLocation(getDirection());
        if (gr.isValid(next2)) {       
            moveTo(next2);     
        } else {       
            removeSelfFromGrid();
        }
        Rock rock = new Rock();
        rock.putSelfInGrid(gr, loc);
    }

}
