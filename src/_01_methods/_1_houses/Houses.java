package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	   public static void main(String[] args) {
		   
		Robot rob=new Robot();
		rob.setX(0);
		rob.setY(400);
		   // Check the recipe to find out what code to put here
		   for(int i=0;i<=10;i++) {
		iDraw(rob);
		   }
		
	}
public static void iDraw(Robot rob) {
	
	rob.penDown();
	rob.setSpeed(200);
	rob.setPenWidth(25);
	rob.move(100);
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
	rob.move(100);
	rob.turn(-90);
	rob.setPenColor(0,255,0);
	rob.move(30);
	rob.turn(-90);
}
		
	}

	''