package tester;

import java.util.ArrayList;
//import processing.core.PApplet;
//import processing.core.PGraphics;
//import processing.core.PImage;
import processing.core.*;

public class PGraphicsMaker {
	String filepath = "/Users/nataliesettles/Documents/workspace/elementImages/data/";
	PApplet parent;
	int populationSampleSize = 18;
//	int stageWidth = 150; // vertical - eventually make this based on the motif's max width
//	int stageHeight = 400; // vertical - make this based on the motif's max height
	int stageWidth = 200; // horizontal display
	int stageHeight = 150; // horizontal display
	ArrayList<PGraphics> motifArray;
	PImage pic;
//	float picWidth = 100; // for vertical display
	float picHeight = 100; // for horizontal display
	PImage pic2;
//	float pic2Width = 50; // for vertical display
	float pic2Height = 50; // for horizontal display
	PImage pic3;
//	float pic3Width = 75; // for vertical display
	float pic3Height = 75; // for horizontal display
	
	
	public PGraphicsMaker(PApplet pa) {
		parent = pa;
		
		// for vertical display
//		pic = parent.loadImage(filepath + "small_jones6.png"); 
//		pic2 = parent.loadImage(filepath + "small_dresser10.png");
//		pic3 = parent.loadImage(filepath + "small_jones6.png");
		
		// for horizontal display
		pic = parent.loadImage(filepath + "side_small_jones6.png");
		pic2 = parent.loadImage(filepath + "side_small_dresser10.png");
		pic3 = parent.loadImage(filepath + "side_small_morris6.png");
	}
	
	// TODO: Reel through a genotype and find the widest image (or a parenthetical image, which is half the image's width, plus the shift off the central axis).
	// Then find the height of a motif by doing something with the heights of the images and the segment spaces. This will all be reversed of course if the 
	// paper is oriented horizontally.
	
	/**makeMotifArray -
	 * An array of PGraphics objects that are individual graphic stages for each motif (remember to make each object slightly larger than the images it contains,
	 * so any visual effects won't run off the stage. Each of these stages allows individual visual effects (bitmap manipulations/displacement maps to be played 
	 * out on an individual.
	 * @return
	 */
	
//	public ArrayList makeMotifArray() {
//		String filepathTempPngs = "/Users/nataliesettles/Documents/workspace/PGraphicsTest/tempPngs/";
//		ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
//		
//		
//		for (int i = 0; i < populationSampleSize; i++) {
//			//TODO: Compose the images into a motif and query to see how big it is overall to determine how big to make the (createGraphics()) object
//			motifArray.add(parent.createGraphics(stageWidth,stageHeight,parent.P3D)); // create the stage
//			motifArray.get(i).beginDraw();
//			motifArray.get(i).background(255, 255, 255, 0);
//			motifArray.get(i).image(pic,((stageWidth/2) - (picWidth/2)),50,picWidth,90);
//			motifArray.get(i).image(pic2,((stageWidth/2) - (pic2Width/2)),10,pic2Width,50);
//			motifArray.get(i).endDraw();
////			motifArray.get(i).save(filepathTempPngs + "motif" + i + ".png");
//		}
//		return motifArray;
//	}
	
	public ArrayList makeMotifArray() {
	String filepathTempPngs = "/Users/nataliesettles/Documents/workspace/PGraphicsTest/tempPngs/";
	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
	
	for (int i = 0; i < populationSampleSize; i++) {
		//TODO: Compose the images into a motif and query to see how big it is overall to determine how big to make the (createGraphics()) object
		motifArray.add(parent.createGraphics(stageWidth,stageHeight,parent.P3D)); // create the stage
		motifArray.get(i).beginDraw();
		motifArray.get(i).background(255, 255, 255, 0);
		motifArray.get(i).image(pic,50,((stageHeight/2) - (picHeight/2)),90,picHeight);
		motifArray.get(i).image(pic2,10,((stageHeight/2) - (pic2Height/2)),50,pic2Height);
		motifArray.get(i).image(pic3,40,(stageHeight/2)-75,50,pic3Height/2);
		motifArray.get(i).endDraw();
//		motifArray.get(i).save(filepathTempPngs + "motif" + i + ".png");
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
