package tester;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.*;

public class PGraphicsMaker {
	int populationSampleSize = 16;
	String filepath = "/Users/nataliesettles/Documents/workspace/elementImages/data/";
	PApplet parent;
//	ArrayList<PImage> motifArray = new ArrayList<PImage>();
	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
	PImage pic;
	PImage pic2;
	
	public PGraphicsMaker(PApplet pa) {
		PApplet parent = pa;
		pic = parent.loadImage(filepath + "small_jones6.png");
		pic2 = parent.loadImage(filepath + "small_dresser10.png");
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
		ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
//		ArrayList<PImage> motifArray = new ArrayList<PImage>();
//		for (int i = 0; i < populationSampleSize; i++) { // for later
		for (int i = 0; i < 2; i++) {
			PGraphics pg = new PGraphics();
			//TODO: Compose the images into a motif and query to see how big it is overall to determine how big to make the (createGraphics()) object
			int stageWidth = 100; // eventually make this based on the motif's max width
			int stageHeight = 400; // make this based on the motif's max height
//			motifArray.add(i,pic); // create the stage
			pg = parent.createGraphics(stageWidth,stageHeight,parent.P3D);
			motifArray.set(i,pg);
//			motifArray.set(i,parent.createGraphics(stageWidth,stageHeight,parent.P3D)); // create the stage
			motifArray.get(i).beginDraw();
			motifArray.get(i).image(pic,10,10,100,90);
			motifArray.get(i).image(pic2,10,50,50,50);
//			makeImageMotif(motifArray.get(i)); // render the motif on the stage (see method below)
			motifArray.get(i).endDraw();
		}
		return motifArray;
	}
	
//	public void makeImageMotif(PGraphics pg_) {
//		// this should be done iteratively by cruising through each genotype's array and using regex strings to call the images
//		PGraphics pg = pg_;
//		PImage pic = parent.loadImage(filepath + "small_jones6.png");
////		int picWidth = pic.width;
////		int picHeight = pic.height; 
//		PImage pic2 = parent.loadImage(filepath + "small_dresser10.png");
//		
//		pg.parent.image(pic,10,10,100,90);
//		pg.parent.image(pic2,10,50,50,50);
//
//	}

}
