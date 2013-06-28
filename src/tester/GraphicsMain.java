package tester;

import java.util.ArrayList;
import processing.core.*;

public class GraphicsMain extends PApplet{
//	PImage pic;
//	PImage pic2;
	String filepath = "/Users/nataliesettles/Documents/workspace/PGraphicsTest/src/data/";
//	ArrayList<PGraphics> motifArray = new ArrayList<PGraphics>();
	ArrayList<PGraphics> motifArray;
//	PGraphics pg = new PGraphics();
	PGraphicsMaker pgm;
	
	public void setup() {
		size(800,500,P3D);
		background(255);
//		ArrayList<PGraphics> motifArray = new ArrayList();
		PGraphicsMaker pgm = new PGraphicsMaker(this); // pass itself as the applet to make the processing library accessible
		motifArray = pgm.makeMotifArray();
		if (motifArray.get(0) == null) {
			System.out.println("The motif array is unfilled!");
		}
	}
	
	public void draw() {
		for (int i = 0; i < motifArray.size(); i ++) {
			image(motifArray.get(i),200+(400*i),100);
//			motifArray.get(i);
//			canvas.beginDraw();
//			canvas.endDraw();
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
