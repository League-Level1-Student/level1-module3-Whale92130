package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    PImage back;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	back = loadImage("froggerBackground.png");
    	
    	
    }

    @Override
    public void draw() {
    	background(back);
    }
    public void keyPressed()
	{
	    if(key == CODED){
	        if(keyCode == UP)
	        {
	            //Frog Y position goes up
	        }
	        else if(keyCode == DOWN)
	        {
	            //Frog Y position goes down 
	        }
	        else if(keyCode == RIGHT)
	        {
	            //Frog X position goes right
	        }
	        else if(keyCode == LEFT)
	        {
	            //Frog X position goes left
	        }
	    }
	}
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
