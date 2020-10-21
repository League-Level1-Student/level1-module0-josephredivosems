int yDrop = 100;
int score = 0;
int xBucket = 0;
 int randomNumber;
void setup() {
  size(600, 600);
  randomNumber = (int) random(width);
}
void draw() {
  background(#030303);
  fill(#2F49EA);
  stroke(#030303);
  ellipse(randomNumber, yDrop, 20, 20);
  yDrop+=5;
  xBucket = mouseX;
  stroke(#D62036);
  fill(#050505);
  rect(xBucket, 525, 100, 75);
  
  if(yDrop == 525) {
   checkCatch(randomNumber); 
   yDrop = 100;
   randomNumber = (int) random(width);
  }
  
}
     void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
