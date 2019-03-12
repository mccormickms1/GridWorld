1. ArrayList<Actor> getActors();
void processActors(ArrayList<Actor> actors)
ArrayList<Location> getMoveLocations()
Location selectMoveLocation(ArrayList<Location> locs)
void makeMove (Location loc)
2. Make a list of actors around the critter, process them and learn what they are, find all possible locations to move, select a desired location to move, move to that location.
3. Yes, maybe if a critter could only process the actors on the front side of it.
4. A critter could move in the opposite direction of an actor, move on top of the actor and destroy it, or switch places with the actor
5. getMoveLocations-Determine which locations around the critter are possible to move to
selectMoveLocation-Determine which location is most desirable
makeMove-Move to that desired location
6. Critters don't need any of their own constructed variables

1. It overrides the methods that are used in the act methot.
2. It is using the make move function of the general critter class.
3. Add it to the makemove method in the same way that bugs drop flowers.
4. The critter needs to be able to see all actors around it which is what getActors aleady does.
5. The Actor class
6. Use gr.get();

1. Its all good as is, the crab eats the actors it finds.
2. The crab only eats the actors in the three tiles in front, it won't eat actors to its sides or behind it.
3. It helps the crab see only the locations in front of it.
4. South, southeast, southwest.
5. They both choose a random location to move to of their availible movement locations, but the crab can only move to its direct right or direct left.
6. If both of its possible move locations are not vaild it will turn.
7. Crabs don't eat other critters.
