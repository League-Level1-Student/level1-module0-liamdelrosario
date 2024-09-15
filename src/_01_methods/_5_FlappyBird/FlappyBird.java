package _01_methods._5_FlappyBird;

import javax.swing.JOptionPane;

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
    int score=0;
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
    	ellipse(150, yc, 50, 50);
    	fill(100,250,50);
    	rect(xc,lowerY,90,lowerPipeHeight);
    	rect(xc,0,90,upperPipeHeight);
    	rect(0,575,WIDTH,25);
    	rect(0,0,WIDTH,25);
    	textSize(40);
    	text("score:"+score, 250, 50);
    	
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
    	xc-=2;
    	if(intersectsPipes()) {
    		
    		JOptionPane.showMessageDialog(null, "You killed the circle");
    		System.exit(0);
    	}
    	if(birdfall()) {
    		
    		JOptionPane.showMessageDialog(null, "You killed the circle");
    		System.exit(0);
    	}
    	if(birdDeathScene()) {
    		JOptionPane.showMessageDialog(null, "You killed the circle");
    		System.exit(0);
    	}
    	if(xc+90==126) {
    		score++;
    	}
    }
    public void mousePressed() {
    birdYVelocity=-13;
    }
	boolean intersectsPipes() { 
        if (yc < upperPipeHeight && 150 > xc && 150 < (xc+90)){
           return true; }
       else if (yc>lowerY && 150 > xc && 150 < (xc+90)) {
           return true; }
       else { return false; }
	}
	boolean birdfall() {
		  if(yc<25) {
	        	return true; }
	        else { return false; }
		}
	boolean birdDeathScene() {
	if(yc>575) {
    	return true; }
    else { return false; }
	}
	/*boolean intersectsPipes() { 
         if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
            return true; }
        else if (birdY>lowerPipeTop && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
            return true; }
        else { return false; }
}rect(0,575,WIDTH,25);
*/
	
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
