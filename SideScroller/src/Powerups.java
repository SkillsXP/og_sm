
public abstract class Powerups {
	private int sx,sy, lx, ly; //sx & sy means width and height and lx & ly means location's coordinate
	
	public Powerups(int width, int height, int locx, int locy) {
		sx = width;
		sy = height;
		lx = locx;
		ly = locy;
	}
	
	public abstract boolean ate(); // collision checking; if mario touched the object
	
}
