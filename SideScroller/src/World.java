import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class MarioWorld {

	MainCharacter mario; // declare the location and size later when it is formed
	List<Moveable> enemies = new ArrayList<Moveable>(); //Dong Kingkong
	List<Moveable> helpers = new ArrayList<Moveable>(); //mushrooms
	List<Platform> platforms = new ArrayList<Platform>(); //bricks
	private MarioPanel panel;
	private int x, y;
	private int dx = 0;
	Image marioi;
	Rectangle mmario = null;
	
	public MarioWorld(MarioPanel marioPanel) {
		panel = marioPanel;
	}
	
	public void draw(Graphics g) {
		//draw new background when main character reaches the boundary
		mario = new MainCharacter(0, 100, 150, 77);
		mario.draw(g);
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
	
	public MainCharacter getMario() {
		return mario;
	}

}
