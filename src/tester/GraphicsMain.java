package tester;

import java.util.ArrayList;
import processing.core.*;

public class GraphicsMain extends PApplet{
	int screenWidth = 800;
	int screenHeight = 450;
//	int screenWidth = 1920;
//	int screenHeight = 1080;
	PGraphicsMaker pgm = new PGraphicsMaker(this);
	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
	Grid2 grid = new Grid2(this);
	ArrayList gridPositions;

	
	public void setup() {
		size(screenWidth,screenHeight,P3D);
		background(0);
		
		motifArray = pgm.makeMotifArray();
		if (motifArray.get(0) == null) {
			System.out.println("The motif array is unfilled!");
		}
		
		gridPositions = grid.gridPositions();
	}
	
	public void draw() {
		
		for (int i = 0; i < motifArray.size(); i ++) {
			float [] coords = (float[]) gridPositions.get(i);
			image(motifArray.get(i),coords[0],coords[1]);
			g.removeCache(motifArray.get(i));// this is avoiding the leak
			println(frameCount + " " + g.getCache(motifArray.get(i)));

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
