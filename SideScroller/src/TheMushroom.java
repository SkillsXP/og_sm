import java.awt.Rectangle;


public class TheMushroom extends Powerups{

	MainCharacter mario;
	Rectangle marioref;
	Rectangle msrm = null;
	
	public TheMushroom(int width, int height, int locx, int locy) {
		super(width, height, locx, locy);
		marioref = new Rectangle(mario.getX(), mario.getY() , mario.getSx(), mario.getSy());
		msrm = new Rectangle(width,height,locx,locy);
	}

	@Override
	public boolean ate() {
		if (marioref.intersects(msrm)){
			mario.setSy(150);
			return true;
		}else{
			return false;
		}
	}
	
}
