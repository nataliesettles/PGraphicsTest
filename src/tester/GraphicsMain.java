package tester;

import processing.core.*;

public class GraphicsMain extends PApplet{
	PImage pic;
	PImage pic2;
	String filepath = "/Users/nataliesettles/Documents/workspace/PGraphicsTest/src/data/";
	
	public void setup() {
		size(400,400,P3D);
		background(255);
		pic = loadImage(filepath + "small_jones6.png");
		pic2 = loadImage(filepath + "small_dresser10.png");
		
	}
	
	public void draw() {
		image(pic,10,10,100,90);
		image(pic2,10,50,50,50);
			
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
