import java.awt.Graphics;

// this is abstract class for the platform
//we can make specific platforms like bricks, floating ground and stick (etc...) by extending this thing
public abstract class Platform {
	MarioPanel mp;
	private int locx, locy, width, height;
	private boolean isHit = false;
	
	public Platform(int locx, int locy, int six, int siy, MarioPanel input){
		locx = locx;
		locy = locy;
		width = six;
		height = siy;
		mp = input;
	}
	
	public abstract void draw(Graphics g); 
	public abstract void breaks();
	
	public void gotHit(){
		isHit = true;
	}
	
	public void unHit(){
		isHit = false;
	}
	
	public void reverb(int dir, int magnitude, Graphics g){
		if (dir == 0){
			mp.bup(g, magnitude);
		}
		else if (dir == 1){
			mp.bright(g, magnitude);
		}
		else if (dir == 2){
			mp.bdown(g, magnitude);
		}
		else {
			mp.bleft(g, magnitude);
		}
	}
	
}
