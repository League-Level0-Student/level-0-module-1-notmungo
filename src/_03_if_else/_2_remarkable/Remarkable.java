package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
        String bob  = "I hiked mount Everest" ;
        String john = "I went to mars" ;
        String mark = "I went to the moon" ;
        String aidan = "I flew a plane" ;
		// 2. Ask the user to enter a name. Store their answer in a variable.
        String question = JOptionPane.showInputDialog("Hey can you put in a name?") ;
        if (question.equals("bob") )	{
        	JOptionPane.showMessageDialog(null,"You hiked mount Everest") ;
        }
        if (question.equals("john") )   {
        	JOptionPane.showMessageDialog(null,"I went to mars") ;
        }
        if (question.equals("mark") )   {
        	JOptionPane.showMessageDialog(null,"I went to the moon") ;
        }
        if (question.equals("aidan") )   {
        	JOptionPane.showMessageDialog(null,"I flew a plane") ;
        }
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		
        
              
	}
}

