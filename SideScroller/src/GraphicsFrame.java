import javax.swing.JFrame;


public class GraphicsFrame extends JFrame {

	MarioPanel masterMario = null;
	
	public static void main(String[] args) {
		new GraphicsFrame();
	}
	
	public GraphicsFrame() {
		super("Mario Maker");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		masterMario = new MarioPanel();
		this.add(masterMario);
		this.pack();
		this.setVisible(true);
	}

}
