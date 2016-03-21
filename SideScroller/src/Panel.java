// this is general general outline code 
// DO NOT DELETE THIS
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class MarioPanel extends JPanel {

	final int WIDTH = 800, HEIGHT = 600;// starting values for width and height in pixels

	
	private Random die = new Random();// I wanted randomness (specifically for colors)
	private MarioWorld world;
	private BufferedImage bkgrnd;
	private int BCKGRD_W ;
	
	public MarioPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));// Otherwise, the frame starts off small
		
		world = new MarioWorld(this);
		setUpKeyBindings();
		setUpBackground();
	}

	private void setUpBackground() {
		URL url = getClass().getResource("Images/background.jpg");
		
		try {
			this.bkgrnd=(BufferedImage) ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.BCKGRD_W=bkgrnd.getWidth(null);
		System.out.println(this.BCKGRD_W);
		
	}

	private void setUpKeyBindings() {
		this.getInputMap().put(KeyStroke.getKeyStroke("pressed RIGHT"), "RightMove");
		this.getInputMap().put(KeyStroke.getKeyStroke("released RIGHT"), "RightStop");
		this.getInputMap().put(KeyStroke.getKeyStroke("pressed LEFT"), "LeftMove");

		
		this.getActionMap().put("RightMove",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.right();
			}

		});
		this.getActionMap().put("RightStop",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.stop();
			}

		});
		this.getActionMap().put("LeftMove",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.left();
			}

		});
		this.requestFocusInWindow();

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBackground(g);
		System.out.println("repainting");
		world.draw(g);
		
	}

	private void drawBackground(Graphics g) {
		int x = this.BCKGRD_W/2-this.getWidth()/2;
		double step = this.BCKGRD_W/360.0;
		//x+=step*this.compassHeading;
		
		//BufferedImage rightView = bkgrnd.getSubimage(x	, 0	, this.getWidth(), this.bkgrnd.getHeight());
		g.drawImage(this.bkgrnd, 0,0,this.getWidth(), this.getHeight(),null);
	}

	
}

// Some changes made here
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class MarioPanel extends JPanel {

	final int WIDTH = 3000, HEIGHT = 1500;// starting values for width and height in pixels

	private Random die = new Random();// I wanted randomness (specifically for colors)
	private MarioWorld world;
	private BufferedImage djtverbg;
	private int bg_W ;
	
	public MarioPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));// Otherwise, the frame starts off small
		world = new MarioWorld(this);
		setUpKeyBindings();
		setUpBackground();
	}

	private void setUpBackground() {
		URL url = getClass().getResource("Images/djtverbg.jpg");
		
		try {
			this.djtverbg=(BufferedImage) ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.bg_W=djtverbg.getWidth(null);
		System.out.println(this.bg_W);
		
	}

	private void setUpKeyBindings() {
		this.getInputMap().put(KeyStroke.getKeyStroke("pressed RIGHT"), "RightMove");
		this.getInputMap().put(KeyStroke.getKeyStroke("released RIGHT"), "RightStop");
		this.getInputMap().put(KeyStroke.getKeyStroke("pressed LEFT"), "LeftMove");
		this.getInputMap().put(KeyStroke.getKeyStroke("released LEFT"), "LeftStop");
		
		this.getActionMap().put("RightMove",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.right();
			}

		});
		this.getActionMap().put("RightStop",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.stop();
			}

		});
		this.getActionMap().put("LeftMove",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.left();
			}

		});
		this.getActionMap().put("LeftStop",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				world.stop();
			}

		});
		this.requestFocusInWindow();

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBackground(g);
		System.out.println("repainting");
		world.draw(g);
		
	}

	private void drawBackground(Graphics g) {
		int x = this.bg_W/2-this.getWidth()/2;
		double step = this.bg_W/360.0;
		//x+=step*this.compassHeading;
		
		//BufferedImage rightView = bkgrnd.getSubimage(x	, 0	, this.getWidth(), this.bkgrnd.getHeight());
		g.drawImage(this.djtverbg, 0,0,this.getWidth(), this.getHeight(),null);
	}

	
}

