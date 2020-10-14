package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTv implements ActionListener {
	JButton ducks = new JButton();
	JButton frog = new JButton();
	JButton fluffyUnicorns = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void showButton() {
		System.out.println("Button Clicked!");
		frame.setVisible(true);
		ducks.setText("Ducks");
		frog.setText("Frog");
		fluffyUnicorns.setText("Fluffy Unicorns");
		panel.add(fluffyUnicorns);
		panel.add(frog);
		panel.add(ducks);
		frame.add(panel);
		fluffyUnicorns.addActionListener(this);
		ducks.addActionListener(this);
		frog.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==ducks) {
			showDucks();
		}
		if(arg0.getSource()==fluffyUnicorns) {
			showFluffyUnicorns();
		}
		if(arg0.getSource()==frog) {
			showFrog();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
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

}
