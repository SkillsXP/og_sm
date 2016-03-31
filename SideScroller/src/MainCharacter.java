import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;


public class MainCharacter extends Moveable{
	private int x, y, sx, sy;
	private int lives = 3;
	private Rectangle rmario;
	Image ebitmario;
	
	public MainCharacter(int x, int y, int sx, int sy){
		//knows its own location and size 
		//it is rectangle with the image on top of it
		super(x,y,sx,sy);
		this.x = x;
		this.y = y;
		this.sx = sx;
		this.sy = sy;
		//image construct
		try {
			ebitmario = ImageIO.read(MarioWorld.class.getResourceAsStream("Images/StatMario.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void draw (Graphics g){
		g.drawRect(this.getX(), this.getY(), this.getSx(), this.getSy());
		g.drawImage(ebitmario, sx, sy, null);
	}
	
	//getters&setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSx() {
		return sx;
	}

	public void setSx(int sx) {
		this.sx = sx;
	}

	public int getSy() {
		return sy;
	}

	public void setSy(int sy) {
		this.sy = sy;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public Rectangle getRmario() {
		return rmario;
	}
}
