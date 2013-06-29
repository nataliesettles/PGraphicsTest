package tester;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.*;

public class PGraphicsMaker {
	String filepath = "/Users/nataliesettles/Documents/workspace/elementImages/data/";
	PApplet parent;
	int populationSampleSize = 16;
//	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
	int stageWidth = 100; // eventually make this based on the motif's max width
	int stageHeight = 400; // make this based on the motif's max height
	ArrayList<PGraphics> motifArray;
	PImage pic;
	PImage pic2;
//	
	public PGraphicsMaker(PApplet pa) {
		parent = pa;
		pic = parent.loadImage(filepath + "small_jones6.png");
		pic2 = parent.loadImage(filepath + "small_dresser10.png");
	}
	
	/**makeMotifArray -
	 * An array of PGraphics objects that are individual graphic stages for each motif (remember to make each object slightly larger than the images it contains,
	 * so any visual effects won't run off the stage. Each of these stages allows individual visual effects (bitmap manipulations/displacement maps to be played 
	 * out on an individual.
	 * @return
	 */
	
	public ArrayList makeMotifArray() {
		String filepathTempPngs = "/Users/nataliesettles/Documents/workspace/PGraphicsTest/tempPngs/";
		ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
		
		
		for (int i = 0; i < populationSampleSize; i++) {
			//TODO: Compose the images into a motif and query to see how big it is overall to determine how big to make the (createGraphics()) object
			motifArray.add(parent.createGraphics(stageWidth,stageHeight,parent.JAVA2D)); // create the stage
			motifArray.get(i).beginDraw();
			motifArray.get(i).image(pic,10,10,100,90);
			motifArray.get(i).image(pic2,10,50,50,50);
			motifArray.get(i).endDraw();
			motifArray.get(i).save(filepathTempPngs + "motif" + i + ".png");
		}
		return motifArray;
	}
//	
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
