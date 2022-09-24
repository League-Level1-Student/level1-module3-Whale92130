
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    PImage back;
        
    

    public void setup() {
      size(844, 600);
      back = loadImage("froggerBackground.png");
      
      
    }

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
