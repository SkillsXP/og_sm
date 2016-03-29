import java.awt.Graphics;

public class Ground extends Platform{
  	MarioPanel mp;
	private int locx, locy, width, height;
	private boolean isHit = false;
	public static List<Platform> p = new List<Platform>();
	
	public Ground(int locx, int locy, int six, int siy, MarioPanel input){
	  super(locx, locy, six, siy, input);
}
