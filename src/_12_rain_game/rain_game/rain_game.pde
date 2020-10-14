int yDrop = 100;
 int randomNumber = (int) random(width);
void setup() {
  size(600, 600);
}
void draw() {
  background(#E03F3F);
  fill(#2F49EA);
  stroke(#030303);
  ellipse(randomNumber, yDrop, 50, 50);
  yDrop+=10;
}
