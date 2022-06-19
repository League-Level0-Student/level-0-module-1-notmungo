package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score 
		int scoreHolder = 0 ;
	

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		 String question = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?") ;
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		 if (question.equals("Nothing. Good riddles like this never get old.") ) {
			 JOptionPane.showMessageDialog(null, "Correct") ;
			scoreHolder += 1 ;
			
		 }
		// 5. Otherwise, say "wrong" and tell them the answer
		 else {
			 JOptionPane.showMessageDialog(null, "wrong") ; 
			 JOptionPane.showMessageDialog(null, "The answer is Nothing. Good riddles like this never get old.") ;
			 scoreHolder -= 1 ;
		 }
		  
		// 6. Add some more riddles
		 String question2 = JOptionPane.showInputDialog("You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
		 
		 if (question2.equals("Paper") ) {
			 JOptionPane.showMessageDialog(null, "Correct") ;
			 scoreHolder += 1;
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "wrong") ; 
			 JOptionPane.showMessageDialog(null, "The answer is paper") ;
			 scoreHolder -= 1;
		 }
		// 2. Make a pop up to show the score.
		 JOptionPane.showMessageDialog(null, scoreHolder) ;
	}
}

