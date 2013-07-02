package tester;

import processing.core.PApplet;
import static java.lang.System.out; // does the out.println() stuff
import java.util.ArrayList;

public class Grid2 {
  
  int populationSampleSize = 18; // the number of individual motifs the grid can hold
  ArrayList gridPositions; // this is the array issued by Grid that specifies the fixed positions in the wallpaper grid
  PApplet parent;
  
  Grid2(PApplet pa) {
	parent = pa;
    gridPositions = new ArrayList(populationSampleSize);
  }
  
  public ArrayList gridPositions() {
    float xPosition = 0 - 200; // the zero position minus half the width (height) of a horizontally displayed motif 
    float yPosition = 7*(parent.height/8) - 75; // 75 is half the width of a PGraphic stage so that the motif will be centered
    for (int i = 0; i < populationSampleSize; i++) {
      float[] segCoords = new float[2]; // a holding array for the x,y coords of a grid location
      if (i < 5) {
        if (i == 0) {
          // don't increment x
          // don't increment y
        } else {
          xPosition += parent.width/4;
          // don't increment y
        }
      } else if (i < 9) {
        if (i == 5) {
          xPosition = parent.width/8; // offset x
          yPosition -= parent.height/4; // increment y
        } else {
          xPosition += parent.width/4;
          // don't increment y
        }
      } else if (i < 14) {
        if (i == 9) {
          xPosition = 0; // reset x
          yPosition -= parent.height/4; // increment y
        } else {
          xPosition += parent.width/4;
          // don't increment y
        }
      } else if (i < 18) {
        if (i == 14) {
          xPosition = parent.width/8;
          yPosition -= parent.height/4; // increment y
        } else {
          xPosition += parent.width/4;
          // don't increment y
        }
      } else {
        out.println("Oops, you now have too many genotypes for this "+ populationSampleSize +" sized grid!");
      }
      segCoords[0] = xPosition;
      segCoords[1] = yPosition;
      gridPositions.add(i, segCoords);
    }
    //out.println(gridPositions);
    return gridPositions;
  }
}