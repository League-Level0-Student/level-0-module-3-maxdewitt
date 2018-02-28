//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
			
		
		//1. Create a new Robot
		Robot rob = new Robot();
		for (int i = 0; i < 1000; i++) {
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want to use?");
		//5. Use an if/else statement to set the pen color that the user requested
        if (color.equals("green") ) {
        	rob.setPenColor(Color.green);
        }
        
        else if (color.equals("red")) {
        	rob.setPenColor(Color.red);
        }
        
        else if (color.equals("blue")) {
        	rob.setPenColor(Color.blue);
        }
        
        else if (color.equals("yellow")) {
        	rob.setPenColor(Color.yellow);
        }
        
        else if (color.equals("pink")) {
        	rob.setPenColor(Color.pink);
        }
        
        //6. If the user doesn’t enter anything, choose a random color
        	else {
        		rob.setRandomPenColor();
        	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		i = 0;
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.setAngle(0);
		rob.penDown();
		rob.setSpeed(1000);
        rob.setX(500);
        rob.move(200);
        rob.turn(90);
        rob.move(200);
        rob.turn(90);
        rob.move(200);
        rob.turn(90);
        rob.move(200);
		}
	}
}
