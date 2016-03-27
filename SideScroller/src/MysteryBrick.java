// spawn bunch of random objects like mushrooms -^-_-^-
import java.util.ArrayList;
import java.util.List;


public class MysteryBrick extends Brick{

	public List<Powerups>box = new ArrayList<Powerups>();
	
	public MysteryBrick(int locx, int locy, int six, int siy, MarioPanel input) {
		super(locx, locy, six, siy, input);
	}
	
	// need to add random powerup objects but how??
	public Powerups item(){
		// need to add random powerup before this stepo
		if (this.breaks() == true){
			for(int x = 0; x < box.size(); x++)
				return box.get(x);
		}
		return null;
	}
}
