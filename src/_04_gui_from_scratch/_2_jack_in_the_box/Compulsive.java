package _04_gui_from_scratch._2_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Compulsive implements ActionListener {

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton button = new JButton();
	int score = 0;
	private void run() {
		// TODO Auto-generated method stub
		frame.add(button);
	
	button.setText("Surprise");
	frame.pack();
	button.addActionListener(this);
	frame.setVisible(true);
	
	}
	
	
		private void showPicture(String fileName) {
		     try {
		          JLabel imageLabel = createLabelImage(fileName);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();

		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}


		private JLabel createLabelImage(String fileName) {
		     try {
		          URL imageURL = getClass().getResource(fileName);
		          if (imageURL == null) {
		               System.err.println("Could not find image " + fileName);
		               return new JLabel();
		          } else {
		               Icon icon = new ImageIcon(imageURL);
		               JLabel imageLabel = new JLabel(icon);
		               return imageLabel;
		          }
		     } catch (Exception e) {
		          System.err.println("Could not find image " + fileName);
		          return new JLabel();
		     }
		}

	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	
}
public static void main(String[] args) {
		new Compulsive().run();
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		score+=1;
	}
	if(score==5) {
		showPicture("jackInTheBox.png");
		for(int i=0; i<50; i++) {
			playSound("homer-woohoo.wav");
		}
		System.out.println("me enjoy food");
	}
}
}
