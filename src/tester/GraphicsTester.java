package tester;

import processing.core.PApplet;

public class GraphicsTester extends PApplet{
	
	
	public void setup() {
		size(400,400,P3D);
		
	}

	/**
	 * @param args
	 */
	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "MasterWallpaper" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}

}
