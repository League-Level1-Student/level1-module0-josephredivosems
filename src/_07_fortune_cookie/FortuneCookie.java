package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	  public void showButton() {
          System.out.println("Button clicked");
          JFrame frame = new JFrame();
          frame.setVisible(true);
          JButton button = new JButton();
          frame.add(button);
          frame.pack();
          button.addActionListener(this);
         
          Random ran = new Random();
          int rand = ran.nextInt(4);
          if(rand == 0) {
        	  JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camoflauge");
          }
          else if(rand == 1) {
        	  JOptionPane.showMessageDialog(null, "A faithful friend is a strong defense.");
          }
          else if(rand == 2) {
        	  JOptionPane.showMessageDialog(null, "A fresh start will put you on your way.");
        	  
          }
          else if(rand == 3) {
        	  JOptionPane.showMessageDialog(null, "A friend asks only for your time not money.");
          }
     }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
	}
}
