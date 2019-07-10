package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot pop=new Robot();
		// 5. Set your robot's pen down 
		pop.penDown();
		// 3. Set the robot to go at max speed (100)
		pop.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			
		// 7. Change the pen color to random
		pop.setPenColor(Color.red);
			// 6. Move the robot 5 times the loop counter (5*i)
			pop.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		pop.turn(360/7);
			// 8. Set the pen width to i
		pop.setPenWidth(40);
		}	
	}
}
