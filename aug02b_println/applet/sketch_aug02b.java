import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class sketch_aug02b extends PApplet {
  public void setup() {
background(255,0,127);
//background(255);
//one value = greyscale

//background(255,0,127);
//3 value = RGB

size(800,200);
//size(800,200);
//width is 800px and height 200px

// making comments with // is really helpful to remember the logic
// and asking for help
// also when we need to debug we dont have to delete the code,
// we can just put it into comments

print("hello");
print("processing");
print("to");
print("the end of the world");

// print is just for console so we understand what happening now.
// kinda more backend 

print(mouseX);
// print the location of mouse in X axis

println();
// the same as 'print' but break the line also
// empty print line for get to the new line first

println("hello");
println("processing");
println("to");
println("the end of the world");


int x=777;
println(x);

// in matrix display the most upper/left side IS 0,0
// so it's in the 4th quadrant,,,

// actually you don't have to remember any set of codes
// you can just search in processing.org/reference
// which can always copy-paste from,,,


int z=5;
float y=4.5f;
println(z+y);

// post hw on openprocessing classroom
// then send link to bootcamp site
  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "sketch_aug02b" });
  }
}
