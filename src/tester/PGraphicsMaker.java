package tester;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
//import processing.core.*;

public class PGraphicsMaker {
	int populationSampleSize = 16;
	String filepath = "/Users/nataliesettles/Documents/workspace/PGraphicsTest/src/data/";
	PApplet parent;
	
	public PGraphicsMaker(PApplet pa) {
		PApplet parent = pa;
//		PImage pic;

	}
	
	/**makeMotifArray -
	 * An array of PGraphics objects that are individual graphic stages for each motif (remember to make each object slightly larger than the images it contains,
	 * so any visual effects won't run off the stage. Each of these stages allows individual visual effects (bitmap manipulations/displacement maps to be played 
	 * out on an individual.
	 * @return
	 */
	//
	public ArrayList makeMotifArray() {
		PGraphics pg;
		ArrayList motifArray = new ArrayList();
		for (int i = 0; i < populationSampleSize; i++) {
			//TODO: Compose the images into a motif and query to see how big it is overall to determine how big to make the (createGraphics()) object
			int stageWidth = 100; // eventually make this based on the motif's max width
			int stageHeight = 400; // make this based on the motif's max height
			pg = parent.createGraphics(stageWidth,stageHeight,parent.P3D);
		}
		return motifArray;
	}
	
	public void makeImageMotif() {
		// this should be done iteratively by cruising through each genotype's array and using regex strings to call the images
		PImage pic = parent.loadImage(filepath + "small_jones6.png");
		int picWidth = pic.width;
		int picHeight = pic.height; 
		
		PImage pic2 = parent.loadImage(filepath + "small_dresser10.png");
		parent.image(pic,10,10,100,90);
		parent.image(pic2,10,50,50,50);

	}

}
