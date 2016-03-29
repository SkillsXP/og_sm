
import java.awt.Image;


public class Movable{
  int x, y, height, width;
  Image image;
  
  public Movable(int X, int Y, int w, int h, Image i){
      x = X;
      y = Y;
      width = w;
      height = h;
      image = i;
  }
  
  public void draw(){
    
  }
  
  	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
	
	public Image getImage(){
	  return image;
	}
	
	public void setX(int X){
		x = X;
	}
	
	public void setY(int Y){
		y = Y;
	}
	
	public void setHeight(int h){
		height = h;
	}
	
	public void setWidth(int w){
		width = w;
	}
	
	public void setImage(Image i){
	  image = i;
	}
	
	public boolean collidesWith(){
	  return true; //change
  	}
	
}
    
