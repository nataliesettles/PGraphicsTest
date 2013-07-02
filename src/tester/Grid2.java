package tester;

import processing.core.PApplet;
import static java.lang.System.out; // does the out.println() stuff
import java.util.ArrayList;

public class Grid2 {
  
  int populationSampleSize = 16; // the number of individual motifs the grid can hold
  ArrayList gridPositions; // this is the array issued by Grid that specifies the fixed positions in the wallpaper grid
  PApplet parent;
  
  Grid2(PApplet pa) {
	parent = pa;
    gridPositions = new ArrayList(populationSampleSize);
  }
  
  public ArrayList gridPositions() {
    float xPosition = (parent.width/8) - 75; // 75 is half the width of a PGraphic stage so that the motif will be centered
    float yPosition = 0;
    for (int i = 0; i < populationSampleSize; i++) {
      float[] segCoords = new float[2]; // a holding array for the x,y coords of a grid location
      if (i < 4) {
        if (i == 0) {
          // don't increment x
          // don't increment y
        } else {
          // don't increment x
          yPosition += parent.height/4;
        }
      } else if (i < 8) {
        if (i == 4) {
          xPosition += parent.width/4;
          yPosition = 0; // reset y
        } else {
          // don't increment x
          yPosition += parent.height/4;
        }
      } else if (i < 12) {
        if (i == 8) {
          xPosition += parent.width/4;
          yPosition = 0; // reset y
        } else {
          // don't increment x
          yPosition += parent.height/4;
        }
      } else if (i < 16) {
        if (i == 12) {
          xPosition += parent.width/4;
          yPosition = 0; // reset y
        } else {
          // don't increment x
          yPosition += parent.height/4;
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