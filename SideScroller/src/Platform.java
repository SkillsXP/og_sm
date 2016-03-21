import java.awt.Graphics;

// this is abstract class for the platform
//we can make specific platforms like bricks, floating ground and stick (etc...) by extending this thing
public abstract class Platform {
	MarioPanel mp;
	private int lx, ly, sx, sy;
	
	public Platform(int locx, int locy, int six, int siy){
		lx = locx;
		ly = locy;
		sx = six;
		sy = siy;
	}
	
	public abstract void draw(Graphics g); 
	
}
