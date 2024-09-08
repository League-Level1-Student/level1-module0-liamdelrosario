package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int xc =750;
    int yc =300;
    int birdYVelocity = -10;
    int gravity = 1;
    int upperPipeHeight = (int) random(100, 400);
    int pipeGap=250;
    int lowerY=pipeGap+upperPipeHeight;
    int lowerPipeHeight =HEIGHT-lowerY;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(78, 53, 120);
    	fill(250,220,20);
    	stroke(0, 0,0 );
    	ellipse(150, yc, 89, 89);
    	fill(100,250,50);
    	rect(xc,lowerY,90,lowerPipeHeight);
    	rect(xc,0,90,upperPipeHeight);
    	yc+=birdYVelocity;
    	birdYVelocity+=gravity;
    	if(birdYVelocity>=15) {
    		birdYVelocity=15;
    	
    		if(xc<0) {
    			xc=750;
    		     upperPipeHeight = (int) random(100, 400);
    		     lowerY=pipeGap+upperPipeHeight;
    		      lowerPipeHeight =HEIGHT-lowerY;

    		}
    	}
    	xc-=1.5;
    	
    }
    public void mousePressed() {
    birdYVelocity=-15;
    }
	boolean intersectsPipes() { 
        if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
           return true; }
       else if (birdY>lowerPipeTop && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
           return true; }
       else { return false; }
}

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
