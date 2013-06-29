package tester;

import java.util.ArrayList;
import processing.core.*;

public class GraphicsMain extends PApplet{
	int screenWidth = 800;
	int screenHeight = 500;
//	String filepath = "/Users/nataliesettles/Documents/workspace/elementImages/data/";
	PGraphicsMaker pgm = new PGraphicsMaker(this);
	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
//	ArrayList<PGraphics> motifArray;
//	int stageWidth = 100; // eventually make this based on the motif's max width
//	int stageHeight = 400; // make this based on the motif's max height
//	PImage pic = loadImage(filepath + "small_jones6.png");
//	PImage pic2 = loadImage(filepath + "small_dresser10.png");

	
	public void setup() {
		size(screenWidth,screenHeight,P3D);
		background(255);
		
		motifArray = pgm.makeMotifArray();
		
//		for (int i = 0; i < 2; i++) {
//			motifArray.add(createGraphics(stageWidth,stageHeight,P3D));
//			motifArray.get(i).beginDraw();
//			motifArray.get(i).image(pic,10,10,100,90);
//			motifArray.get(i).image(pic2,10,50,50,50);
//			motifArray.get(i).endDraw();			
//		}

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
