package tester;

import java.util.ArrayList;
import processing.core.*;

public class GraphicsMain extends PApplet{
	int screenWidth = 800;
	int screenHeight = 500;
	PGraphicsMaker pgm = new PGraphicsMaker(this);
	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();

	
	public void setup() {
		size(screenWidth,screenHeight,JAVA2D);
		background(255);
		
		motifArray = pgm.makeMotifArray();

		if (motifArray.get(0) == null) {
			System.out.println("The motif array is unfilled!");
		}
	}
	
	public void draw() {
		for (int i = 0; i < motifArray.size(); i ++) {
			image(motifArray.get(i),200+(400*i),100);

		}
		
			
	}

	/**
	 * @param args
	 */
	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "GraphicsMain" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}

}
