package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CokeCookie implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		new CokeCookie().showButton();

	}

	private void showButton() {
		// TODO Auto-generated method stub
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener( this);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You would be a failure for the rest of your life");
		}
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "You would become a werid person form an southeastern country");
		}
		if(rand==2) {
			JOptionPane.showMessageDialog(null, "I vexed you to have a good day.");
		}
		if(rand==3) {
			JOptionPane.showMessageDialog(null, "Someone is going chase you down Flavian street I believe his name is Angelo Bronte.");
		}
		if(rand==4) {
			JOptionPane.showMessageDialog(null, "In 5 second all your neurons are going to dissapear then after 5 days you would be in agony and organs of your would dissapear, afte one month you would barely exist then when it seems it can not be any worse you're hair turns red");
		}
	}
}
