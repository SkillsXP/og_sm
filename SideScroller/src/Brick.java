import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

//this is the brick that breaks
public abstract class Brick extends Platform{
	
	MainCharacter mario;
	List <Platform> bb = new ArrayList<Platform>();
	Rectangle brick = null;
	
	public Brick(int locx, int locy, int six, int siy, MarioPanel input) {
		super(locx, locy, six, siy, input);
		brick = new Rectangle(this.getLocx(), this.getLocy(), this.getWidth(),this.getHeight());
	}

	@Override
	public void draw(Graphics g) {

	}

	@Override
	public boolean breaks() {
		//breaks the break if Mario is in certain height and it hits it
		if ((mario.height == 150) && (brick.intersects(mario.getRmario()))){
			return true;
		} else{
			return false;
		}
	}
	

}
