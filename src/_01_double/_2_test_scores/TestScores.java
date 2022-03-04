package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		
		String scoreString = JOptionPane.showInputDialog("What was your test score?");
		double score = Double.parseDouble(scoreString);
		if (score >= 100) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test! Really well done!");
		}
		
		else if (score >= 90) {
			JOptionPane.showMessageDialog(null, "Nice job! You missed a few points but still got an A!");
		}
		else if (score >= 80) {
			JOptionPane.showMessageDialog(null, "Pretty good, not an A, but not the worst.");
		}
		else if (score >= 70) {
			JOptionPane.showMessageDialog(null, "Okay, not a very good score, but you still passed.");
		}
		else if (score >= 60) {
			JOptionPane.showMessageDialog(null, "That's a pretty bad score bro.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You're terrible! You failed your test! FFFFFFFFFFFFFFFFFF");
		}
	}
}
