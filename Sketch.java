import processing.core.PApplet;

  /**
  * A program that generates 8 differnt patterns in 8 different quadrants.
  * @author: C. Hong
  */

public class Sketch extends PApplet {
	
  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(93,138,168);
  }

  public void draw() {

    quadBorders();
    quad1();
    quad2();
    quad3();
    quad4();
    quad5();
    quad6();
    quad7();
    quad8();
  }

  public void quadBorders() {
    stroke(0);
    noFill();

    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // Plain grid
  public void quad1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + (intRow * 10);  
        intY = 303 + (intColumn * 10); 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  // Vertical grid
  public void quad2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 303 + (intRow * 10);
        intY = 303 + (intColumn * 10); 

        fill(0, 0, 0);
        noStroke();
        rect(intX, intY, 5, 5);
        
        if(intRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
          
        }
      }  
    }
  }

  // Horizontal grid
  public void quad3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 603 + (intRow * 10);
        intY = 303 + (intColumn * 10); 

        if(intColumn % 2 == 0){
          fill(0, 0, 0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
          
        }
      }  
    }
  }

  // Checkered grid 
  public void quad4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 903 + (intRow * 10);  
        intY = 303 + (intColumn * 10); 

        fill(0, 0, 0);
        noStroke();
        rect(intX, intY, 5, 5);
        
        if(intColumn % 2 != 0 && intRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
          
        }
      }
    }
  }
  
  // Bottom right triangle
  public void quad5(){
    int intX = 0;
    int intY = 0;
    int intCounter = 0;

    for(int intColumn = 30; intColumn > 0; intColumn--){
      for(int intRow = 30; intRow > intCounter; intRow--){
        intX = 3 - 10 + intRow * 300 / 30 ;
        intY = 3 + intColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        
      }
      intCounter++;
      
    }
  }

  // Bottom left triangle
  public void quad6(){
    int intX = 0;
    int intY = 0;
    int intCounter = 30;

    for(int intColumn = 30; intColumn > 0; intColumn--){
      for(int intRow = 0; intRow < intCounter; intRow++){
        intX = 303 + intRow * 300 / 30 ;
        intY = 3 - 10 + intColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        
      }
      intCounter--;
      
    }
  }

  // Top left triangle
  public void quad7(){
    int intX = 0;
    int intY = 0;
    int intCounter = 30;

    
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < intCounter; intColumn++){
        intX = 603 + intRow * 300 / 30 ;
        intY = 3 + intColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        
      }
      intCounter--;
      
    }
  }

  // Top right triangle
  public void quad8(){
    
    int intX = 0;
    int intY = 0;
    int intCounter = 30;

    for(int intRow = 30; intRow > 0; intRow--){
      for(int intColumn = 0; intColumn < intCounter; intColumn++){
        intX = 903 - 10 + intRow * 300 / 30 ;
        intY = 3 + intColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        
      }
      intCounter--;
      
    }
    
  }
}
