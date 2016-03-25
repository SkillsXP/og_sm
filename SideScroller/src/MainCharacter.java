import java.awt.Rectangle;


public class MainCharacter extends Moveable{
	int x, y, sx, sy;
	int lives = 1;
	Rectangle rmario;
	
	public MainCharacter(int x, int y, int sx, int sy){
		//knows its own location and size 
		//it is rectangle with the image on top of it
		super(x,y,sx,sy);
		this.x = x;
		this.y = y;
		this.sx = sx;
		this.sy = sy;
		}
	//getters&setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSx() {
		return sx;
	}

	public void setSx(int sx) {
		this.sx = sx;
	}

	public int getSy() {
		return sy;
	}

	public void setSy(int sy) {
		this.sy = sy;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public Rectangle getRmario() {
		return rmario;
	}
	
	public void moveRight{
		turnRight();
		x+=10;
	}
	
	public void moveLeft{
		turnLeft();
		x-=10;
	}
	
	public void turnRight(){
		//changes to right-facing image
	}
	
	public void turnLeft(){
		//changes to right-facing image
	}
	
	public void Jump(){
		
	}
	
	
	
}
