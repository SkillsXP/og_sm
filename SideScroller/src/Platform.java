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
	
	public void gotHit(){
		isHit = true;
	}
	
	public void unHit(){
		isHit = false;
	}
	
	public void reverb(int dir, Graphics g){
		if (dir == 0){
			mp.bup(g, 10);
		}
		else if (dir == 1){
			mp.bright(g, 10);
		}
		else if (dir == 2){
			mp.bdown(g, 10);
		}
		else {
			mp.bleft(g, 10);
		}
	}
	
}
