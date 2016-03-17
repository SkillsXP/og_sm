import java.awt.Graphics;


public class Movable {
	///  What do moveable things need to know about themselves???
	private int x, y, height, width;
public Movable(int X, int Y, int h, int w){
	x = X;
	y = Y;
	height = h;
	width = w;
}
	public void move() {

	}

	public void draw(Graphics g) {
		
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
	
	public void set X(int X){
		x = X;
	}
	
	public void set Y(int Y){
		y = Y;
	}
	
	public void set height(int h){
		height = h;
	}
	
	public void set width(int w){
		width = w;
	}
}
