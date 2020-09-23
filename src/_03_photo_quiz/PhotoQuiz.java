package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
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

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String dogImage = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=1.00xw:0.669xh;0,0.190xh&resize=1200:*";
		// 2. create a variable of type "Component" that will hold your image
		Component dogHolder;
		// 3. use the "createImage()" method below to initialize your Component
		dogHolder = createImage(dogImage);
		// 4. add the image to the quiz window
		quizWindow.add(dogHolder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String dogSize = JOptionPane.showInputDialog("Is this dog big or small?");
		// 7. print "CORRECT" if the user gave the right answer
		if(dogSize.equals("Small")) {
			System.out.println("CORRECT");
		}
		else if(dogSize.equals("Large")) {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
			
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(dogHolder);
		// 10. find another image and create it (might take more than one line
		// of code)
		String catImage = "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png";
		Component catHolder;
		catHolder = createImage(catImage);
		// 11. add the second image to the quiz window
		quizWindow.add(catHolder);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String catQuestion = JOptionPane.showInputDialog("Is this cat staring at you?");
		// 14+ check answer, say if correct or incorrect, etc.
				if(catQuestion.equals("No")) {
					System.out.println("CORRECT");
				}
					else {
						System.out.println("INCORRECT");
					}
				}
	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
