/*
"Show Me Your Anger"
Use mouse to release your pain, Hit spacebar to clear your mind.
by Aimee Piyatas Tantanapornchai

Course: Graphic Programming
Instructor: Liubo Borissov
Date: September 16, 2010
*/

void mouseMoved(){
  
  //mouse move, draw quad around it
  stroke( random(0,255),0,0,100);
  quad(mouseX,mouseY,random(width),random(height),
  random(width),random(height),random(width),random(height) );
}

void mouseDragged(){
  
  //mouse drag, draw heavy lines
  stroke( random(0,255),0,0,100);
  strokeWeight( random(2,(2*(mouseY/height))) );
  strokeJoin(BEVEL);
  quad(mouseX,mouseY,random(width),random(height),
  random(width),random(height),random(width),random(height) );
}

void setup(){
  size(800,600);
  background(250);
  frameRate(30);
  smooth();
}

void drawquad(){
  //basically, draw 
  
  //passive state, draw gray
  noFill();
  stroke( random(0,100),100 );
  strokeWeight( random(1) );
  quad(  random(width),random(height),random(width),random(height),
         random(width),random(height),random(width),random(height) );
  
  //spacebar pressed, draw white
  if ((keyPressed==true)&&(key==' ')){
  noStroke();
  fill(250,100);
  quad(  random(width),random(height),random(width),random(height),
         random(width),random(height),random(width),random(height) );
  }
}

void draw(){ //loops over and over
  drawquad();
}


