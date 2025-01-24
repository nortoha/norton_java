package game;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	
	private JTextField txtGuess;
	private JLabel lblOutput;
	private JButton btnGuessButton;
	private JButton btnPlayAgain;
	private int theNumber;
	private int triesRemaining = 7;
	
	/**
	 * Constructor, create game GUI
	 */
	public GuessingGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Holly's Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel HeadingLabel = new JLabel("Holly's Hi-Lo Guessing Game");
		HeadingLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		HeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HeadingLabel.setBounds(10, 34, 416, 28);
		getContentPane().add(HeadingLabel);
		
		JLabel lblGuessNumberLabel = new JLabel("Guess a number between 1 and 100");
		lblGuessNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGuessNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGuessNumberLabel.setBounds(51, 96, 236, 28);
		getContentPane().add(lblGuessNumberLabel);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(298, 98, 45, 26);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		btnGuessButton = new JButton("Guess!");
		btnGuessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuessButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGuessButton.setBounds(175, 151, 85, 21);
		getContentPane().add(btnGuessButton);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOutput.setBounds(10, 213, 416, 28);
		getContentPane().add(lblOutput);
		
		btnPlayAgain = new JButton("Play Again!");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlayAgain.setBounds(158, 151, 120, 21);
		getContentPane().add(btnPlayAgain);
		// hide button till we need it
		btnPlayAgain.setVisible(false);
	}

	/**
	 * Check guess input from the GUI
	 */
	public void checkGuess() {
		
		String guessText = txtGuess.getText();
		String message = "";
		
		try {
			int guess = Integer.parseInt(guessText);
			if(triesRemaining > 0) {
				if(guess < theNumber) {
					message = guess + " is too low. You have " + triesRemaining + " left.";
					triesRemaining--;
				} else if(guess > theNumber) {
					message = guess + " is too high. You have " + triesRemaining + " left.";
					triesRemaining--;
				} else {
					message = guess + " is correct. You win!";
					btnPlayAgain.setVisible(true);
					btnGuessButton.setVisible(false);
				}	
			} else {
				message = "You have no tries remaining. You lose!";
				btnPlayAgain.setVisible(true);
				btnGuessButton.setVisible(false);
			}
			
		}catch (Exception e) {
			// display error message
			message = "Enter a whole number between 1 and 100.";
		}finally {
		
			// set message to display
			lblOutput.setText(message);
			// clear out previous guess
			txtGuess.setText("");
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	
	/**
	 * Start a new game and generate a new random number
	 */
	public void newGame() {
		theNumber = (int) (Math.random() * 100 + 1);
		btnGuessButton.setVisible(true);
		btnPlayAgain.setVisible(false);
		lblOutput.setText("");
	}
	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450, 300));
		theGame.setVisible(true);
	}
}
