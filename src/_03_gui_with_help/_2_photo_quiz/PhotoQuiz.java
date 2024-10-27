package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		// 2. create a variable of type "Component" that will hold your image
		Component image1;
		// 3. use the "createImage()" method below to initialize your Component
		image1=createImage("file:///Users/league/git/level1-module0-liamdelrosario/images/chess.png");
		// 4. add the image to the quiz window
		quizWindow.add(image1);
		quizWindow.pack();
		quizWindow.setVisible(true);

		// 5. call the pack() method on the quiz window


		// 6. ask a question that relates to the image
		String healG = JOptionPane.showInputDialog("Is this guinea pig a chess grandmaster and is he better than you in anything no matter whay your race or identity is yes or no.");

		// 7. print "CORRECT" if the user gave the right answer
		if(healG.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You are super right he is better than you, you know despite you do not want to accept it people would always be better than no matter what the topic is about.");
			System.out.println("correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		if(healG.equals("no")) {
			JOptionPane.showMessageDialog(null, "Meet me at fourth street avanue this mourning we have some 'Arranged' work to do.");
			System.out.println("incorrect");
		}	else {
			JOptionPane.showMessageDialog(null, "Youre wrong");
		}


		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		

		// 10. find another image and create it (might take more than one line
		// of code)
		quizWindow.remove(image1);
		image1=createImage("file:///Users/league/git/level1-module0-liamdelrosario/images/images.jpg");
		quizWindow.add(image1);
		quizWindow.pack();
		String j = JOptionPane.showInputDialog("If you have parents that expected you to have only A++ what is your blood type");
		if(j.equals("A+")) {
			System.out.println("correct");
			JOptionPane.showMessageDialog(null, "╔═╦╗╔╦╗╔═╦═╦╦╦╦╗╔═╗\n"
											  + "║╚╣║║║╚╣╚╣╔╣╔╣║╚╣═╣ \n"
											  + "╠╗║╚╝║║╠╗║╚╣║║║║║═╣\n"
											  + "╚═╩══╩═╩═╩═╩╝╚╩═╩═╝");
		}
		else {
			System.out.println("incorrect");
			JOptionPane.showMessageDialog(null, "):<):<):<):<):<):<):):<):<):<");
		}
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}

		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
