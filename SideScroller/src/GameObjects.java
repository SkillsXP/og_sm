
public class GameObjects{
  int x, y, height, width;
  Image image;
  
  public(int X, int Y, int w, int h, Image i){
      x = X;
      y = Y;
      width = w;
      height = h;
      image = i;
  }
  
  public void draw(){
    
  }
  
  	public int get X(){
		return x;
	}
	
	public int get Y(){
		return y;
	}
	
	public int get height(){
		return height;
	}
	
	public int get width(){
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
}
