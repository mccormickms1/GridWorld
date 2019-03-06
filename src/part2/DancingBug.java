import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	
	private int count = 0;

    int[] array;
    
	public DancingBug(int[] array) {
		this.array = array;
	}

	public void act() {
        for (int i = 0; i < array[count]; i++) {
            turn();
        }
        if (canMove()) {
			move();
        }
        if (count < array.length - 1) {
            count++;
        } else {
            count = 0;
        }
    }
}