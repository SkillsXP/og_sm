import java.awt.Image;

public class Goomba extends Enemy{
  
  private int lives = 1;
  private boolean hit;
  public Goomba(int X, int Y, int h, int w, Image i){
    super(X, Y, h, w, i);
  }
  
  public void isHit(MainCharacter m){
    if(m.getX() <= this.getX() + this.getWidth() && this.getX() <= m.getX() + m.getWidth() && this.getY() - 1 >= m.getY() + m.getHeight()){
      hit = true;
    }
    // check for more stuff such as fireballs here (later)
  }
  
  public void despawn(){
    if(hit == true){
      setY(10000); 
    }
  }
  
  public void move(){
	  int counter = 0;
		while(collidesWithPlatform() == false){
			if(counter%2 == 0){
				setX(getX() - 10);
			}
			else{
				setX(getX() + 10);
			}
		}
		counter++;
  }
  
  public boolean collidesWithPlatform(){
  	for(int i = 0; i < p.size(); i++){
  		if(this.getY() + this.getHeight() > p.get(i).getY() && (p.get(i).getX() <= this.getX() + this.getWidth() || this.getX() <= p.get(i).getX() + p.get(i).getWidth())){
  			return true;	
  		}
  		return false;
  	}
  }
  
}
