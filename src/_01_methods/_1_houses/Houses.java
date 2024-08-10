package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	   public static void main(String[] args) {
		   
		Robot rob=new Robot();
		Robot.setWindowSize(900, 700);
		rob.setX(0);
		rob.setY(400);
		   // Check the recipe to find out what code to put here
		Random ran= new Random();
		   for(int i=0;i<=8;i++) {
		house(rob, ran.nextInt(300)+30  );

	
		   }
		
	}

	   
	   public static void house(Robot rob, int height) {
	
	rob.penDown();
	rob.setRandomPenColor();
	rob.setSpeed(200);
	rob.setPenWidth(25);
	rob.move(height);
	if(height<=140) {
		
		pointyRoof(rob);
	}else {
		flatRoof(rob);
	}
	rob.move(height);	
	rob.setPenColor(0,255,0);
	rob.turn(-90);
	rob.move(50);
	rob.turn(-90);
	}

	   public static void pointyRoof(Robot rob) {
		  rob.penDown();
		  rob.setSpeed(200);
		   rob.turn(45);
		   rob.move(30);
		   rob.turn(90);
		   rob.move(30);
		   rob.turn(45);
		   
	   }
	   public static void flatRoof(Robot rob) {
		   
		   rob.turn(90);
		rob.move(60);
		rob.turn(90);
	   }
	}

	