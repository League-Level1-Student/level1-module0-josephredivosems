package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot("mini");

	public void run() {
		rob.setWindowColor(Color.BLACK);
		rob.setSpeed(100);
		rob.moveTo(0,600);
		rob.penDown();
		Random rand = new Random();
		for (int i = 0; i < 18; i++) {
			int ranHeight = rand.nextInt(3);
			System.out.println(ranHeight);
			String certainHeight;
			if(ranHeight == 2) {
			certainHeight = "small";
			}
			else if(ranHeight == 1) {
				 certainHeight = "medium";
				
			}
			else {
				 certainHeight = "large";
			}
			int rancolor = rand.nextInt(3);
			
			drawHouse(certainHeight, rancolor);
		}
	}
	void drawHouse (String height, int color) {
		if (height.equals("small")) {
			if(color == 2) {
		rob.setPenColor(Color.RED);
			}
			else if(color == 1) {
				rob.setPenColor(Color.BLUE);
			}
			else {
				rob.setPenColor(Color.YELLOW);
			}
		rob.move(60);
		flatRoof();
		rob.move(60);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(25);
		rob.turn(-90);
		}
		if (height.equals("medium")) {
			if(color == 2) {
		rob.setPenColor(Color.RED);
			}
			else if(color == 1) {
				rob.setPenColor(Color.BLUE);
			}
			else {
				rob.setPenColor(Color.YELLOW);
			}
			rob.move(120);
			flatRoof();
			rob.move(120);
			rob.turn(-90);
			rob.setPenColor(Color.GREEN);
			rob.move(25);
			rob.turn(-90);
		}
		if (height.equals("large")) {
			if(color == 2) {
		rob.setPenColor(Color.RED);
			}
			else if(color == 1) {
				rob.setPenColor(Color.BLUE);
			}
			else {
				rob.setPenColor(Color.YELLOW);
			}
			rob.move(250);
			pointyRoof();
			rob.move(250);
			rob.turn(-90);
			rob.setPenColor(Color.GREEN);
			rob.move(25);
			rob.turn(-90);
		}

		
		}
	void flatRoof() {
		rob.turn(90);
		rob.move(24);
		rob.turn(90);
	}
	void pointyRoof() {
		rob.turn(60);
		rob.move(12);
		rob.turn(60);
		rob.move(12);
		rob.turn(60);
	}
}
