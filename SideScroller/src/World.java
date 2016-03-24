import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class MarioWorld {

	MainCharacter mario = null; // declare the location and size later when it is formed
	List<Moveable> enemies = new ArrayList<Moveable>(); //Dong Kingkong
	List<Moveable> helpers = new ArrayList<Moveable>(); //mushrooms
	List<Platform> platforms = new ArrayList<Platform>(); //bricks
	private MarioPanel panel;
	private int x, y;
	private int dx = 0;
	Image marioi;
	
	public MarioWorld(MarioPanel marioPanel) {
		panel = marioPanel;
		try {
			marioi = ImageIO.read(MarioWorld.class.getResourceAsStream("Images/mariomh.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics g) {
		//draw new background when main character reaches the boundary
		mario = new MainCharacter(0, 100, 150, 77);
		g.draw3DRect(mario.getX(), mario.getY(), mario.getSx(), mario.getSy(), true);
		g.drawImage(marioi,mario.getX(),mario.getY(),mario.getSx(),mario.getSy(),null);
	}

	public void right() {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void left() {
		// TODO Auto-generated method stub
		
	}
	

}
