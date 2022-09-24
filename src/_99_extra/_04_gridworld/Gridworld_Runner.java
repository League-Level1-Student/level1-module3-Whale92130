package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bug bug = new Bug();
		Bug bug2 = new Bug(Color.BLUE);
		Flower flower = new Flower();
 		bug2.turn();
		bug2.turn();
		World world = new World();
		
		Location location = new Location(1,1);
		Location location2 = new Location(9,7);
		Location location3 = new Location(9,6);
		Location location4 = new Location(9,8);
		world.show();
			for (int a = 0; a<10; a++) {
				for (int i = 0; i < 10; i++) {
					Location location5 = new Location(a,i);
					world.add(location5, flower);
				}
			}
		
		world.add(location, bug);
		world.add(location2, bug2);
		world.add(location3, flower);
		world.add(location4, flower);
		
		
		
	}

}
