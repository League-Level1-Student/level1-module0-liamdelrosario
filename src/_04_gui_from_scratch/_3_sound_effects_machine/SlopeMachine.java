package _04_gui_from_scratch._3_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import javax.swing.JPanel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SlopeMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	private void run() {
		// TODO Auto-generated method stub
		frame.add(panel);
		
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	button.setText("eay");
	button1.setText("jel;ly");
	button2.setText("whel");
	button3.setText("he is soooooooooo jazzzzzzzzzieyyyyy");
	button4.setText("am i");
	frame.pack();
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);

	frame.setVisible(true);
	}
	
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			playSound("agony2.wav");
		}
		if(e.getSource()==button1) {
			playSound("timber.wav");
		}
		if(e.getSource()==button2) {
			playSound("THX.wav");
		}
		if(e.getSource()==button3) {
			playSound("[SFM] Shrekophone.wav");
		}
		if(e.getSource()==button4) {
			playSound("sawing-wood-daniel_simon.wav");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SlopeMachine().run();
	}
}
