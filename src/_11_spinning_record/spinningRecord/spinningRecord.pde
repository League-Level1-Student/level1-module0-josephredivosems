PImage pictureOfRecord;
int angle = 0;
void setup(){
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
         pictureOfRecord.resize(height,width);
}

void draw() {
  
    
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0);  //in draw method
  if(mousePressed) {
  angle+=5;
  }
  }



   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
