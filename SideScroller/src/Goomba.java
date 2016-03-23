public class Goomba extends Enemy{
  
  private int lives = 1;
  private boolean hit;
  public Goomba(int X, int Y, int h, int w, Image i){
    super(X, Y, h, w, i);
  }
  
  public void isHit(MainCharacter m){
    if(m.getX() <= this.getX() + this.getWidth() && this.getX() <= m.getX() + m.getWidth() && this.getY() + this.getWidth() + 1 = m.getY()){
      hit = true;
    }
    // check for more stuff such as fireballs here (later)
  }
  
  public void despawn(){
    if(hit == true){
      // finish after figuring things out
    }
  }
  
  
