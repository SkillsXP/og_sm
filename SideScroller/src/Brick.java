import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import javax.imageio.ImageIO;

//this is the brick that breaks
public abstract class Brick extends Platform{
	
	MainCharacter mario;
	List <Platform> bb = new ArrayList<Platform>();
	Rectangle brick = null;
	Image ob;
	Image brb;
	
	public Brick(int locx, int locy, int six, int siy, MarioPanel input) {
		super(locx, locy, six, siy, input);
		brick = new Rectangle(this.getLocx(), this.getLocy(), this.getWidth(),this.getHeight());
		//image of orignal brick
		try {
			ob = ImageIO.read(Brick.class.getResourceAsStream("brick.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		//image broken brick
		try {
			brb = ImageIO.read(Brick.class.getResourceAsStream("rbbrick.JPG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(brick.x, brick.y, brick.width, brick.height);
		g.drawImage(ob, brick.x, brick.y, brick.width, brick.height, null);
		if (breaks() == true){
			g.drawImage(brb, brick.x, brick.y, brick.width, brick.height, null);
		}
	}

	@Override
	public boolean breaks() {
		//breaks the break if Mario is in certain height and it hits it
		if ((mario.height == 150) && (brick.intersects(mario.getRmario()))){
			return true;
		} 
		else{
			return false;
		}
	}
	

}
