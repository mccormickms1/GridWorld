1. loc1.getRow();
2. False
3. 4, 4
4. 135
5. It asks for a direction and chooses the nearest grid space along that direction

1. Use the getOccupiedAdjacentLocations.length on a bunch of different locations.
Use the getEmptyAdjacentLocations.length on a bunch of different locations.
2. boolean isValid(10, 10);
3. The code isn't necessary to understand what the methods do. This code could be found in the actual Grid interface if you wanted to see it.
4. No, an ArrayList lets the list have a variable length rather than a predetermined one. If you used a normal array the code wouldn't work for any number of objects greater than the spots in the array.

1. Location, Color, Direction
2. North, Red
3. There are classes which extend it.
4. None of these work with the user controlled interface, the first one won work because Actors can only have one location. The second one wont work because to remove an actor there must be an actor present. The third one won't work because once an actor is removed there is no way of getting it back without creating a new one.
5. setDirection(getDirection() + 90);

1. Location next = loc.getAdjacentLocation(getDirection());     
if (!gr.isValid(next))       
return false; 
2. return (neighbor == null) || (neighbor instanceof Flower) //No rock
3. It uses the isValid method to see if the location it is looking for exists in the grid.
4. The getAdjacentLocation method is invoked to check what the space directly in front of the bug contains.
5. (neighbor == null) || (neighbor instanceof Flower)
6. It removes itself from the grid
7. It could be avoided, but the loc variable makes it more convenient.
8. They are created using the getColor of the bug.
9. No, it needs to move to place a flower.
10. Flower flower = new Flower(getColor());     
flower.putSelfInGrid(gr, loc);
11. 4
1.
a. Just forward one space
b. Check if the space directly in front of it is empty, and jump forward one space if it is.
c. Turn 90 degrees right
d. Check if the space in front of it is empty and move to it if it is, else turn 90 degrees right
e. Treat it like any other actor
f. Nope

2.
a. Extend bug
b. Yes, the bug class
c. Yes, it needs a color and direction
d. None
e. We can add a canJump(), and Jump() method
f. Make a JumperRunner with different obstacles in the bug's path