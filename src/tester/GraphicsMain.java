package tester;

import java.util.ArrayList;
import processing.core.*;

public class GraphicsMain extends PApplet{
	int screenWidth = 800;
	int screenHeight = 450;
//	int screenWidth = 1920;
//	int screenHeight = 1080;
	String filepath = "/Users/nataliesettles/Documents/workspace/elementImages/data/";
	PGraphicsMaker pgm;
	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
	Grid2 grid = new Grid2(this);
	ArrayList gridPositions;
	PImage pic;
	PImage pic2;
	PImage pic3;
	
	public void setup() {
		size(screenWidth,screenHeight,P3D);
		background(0);
		
		// loading these images here in setup reduces the program's memory load, though placing them here may be as effective as calling them in the PGraphicsMaker
		// class, as that object is also initialized here in setup. However, this tactic of preloading images in setup more substantially more advantageous during
		// implemetation in the main program, since this object will need to be reloaded many times in the main program.
		pic = loadImage(filepath + "side_small_jones6.png");
		pic2 = loadImage(filepath + "side_small_dresser10.png");
		pic3 = loadImage(filepath + "side_small_morris6.png");
		
		pgm = new PGraphicsMaker(this,pic,pic2,pic3);
		
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
			g.removeCache(motifArray.get(i));// this is avoiding a memory leak with the PGraphics
			println(frameCount + " " + g.getCache(motifArray.get(i)));

		}
		
			
	}

	/**
	 * The main program class which accepts the name if the class which extends the PApplet
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
