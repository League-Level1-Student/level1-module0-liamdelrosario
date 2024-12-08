package _04_gui_from_scratch._4_cuteness_tv;

import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _04_gui_from_scratch._3_sound_effects_machine.SlopeMachine;

public class VideoNOl {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	private void Run() {
	frame.add(panel);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	button.setText("Im a duck that is a best man");
	button1.setText("This rain video is especially calming at 1:38:24");
	button2.setText("What more cudly than a unicorn.....");
	frame.pack();
	frame.setVisible(true);
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showRain() {
	     playVideo("https://www.youtube.com/watch?v=jE30dFzT6FI");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=bl2C2KSSQao");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VideoNOl().Run();

	}

}
