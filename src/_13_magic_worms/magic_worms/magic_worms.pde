int yDrop = (int) random(width);
int xDrop = (int) random(height);

void setup() {
  size(600, 600);
    background(#000000);
}
void draw() {
 fill(#FF0303);
 yDrop = (int) random(width);
 xDrop = (int) random(height);
  ellipse(xDrop, yDrop, 10, 10);
  
  
}
  float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
