import java.awt.Graphics;

// this is abstract class for the platform
//we can make specific platforms like bricks, floating ground and stick (etc...) by extending this thing
public abstract class Platform {
	MarioPanel mp;
	private int locx, locy, width, height;
	
	public Platform(int locx, int locy, int six, int siy, MarioPanel input){
		locx = locx;
		locy = locy;
		width = six;
		height = siy;
		mp = input;
	}
	
	public abstract void draw(Graphics g); 
	
}
