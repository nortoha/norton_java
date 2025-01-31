package game;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MadLibsGame extends JFrame {
	
	private JTextField txtAdj1;
	private JTextField txtAdj2;
	private JTextField txtAdj3;
	private JTextField txtNoun1;
	private JTextField txtNoun2;
	private JTextField txtNoun3;
	private JTextField txtPluralNoun1;
	private JTextField txtPluralNoun2;
	private JTextField txtPluralNoun3;
	private JTextField txtVerb1;
	private JTextField txtVerb2;
	private JTextField txtNumber;
	private JTextField txtGame;
	private JTextField txtBodyPart;
	private JTextField txtPlant;
	private JLabel lblYourMadlib;
	private JButton btnNewButton;
	private JTextArea textAreaOutput;
	
	public MadLibsGame() {
		setTitle("Holly's MadLibs App");
		getContentPane().setLayout(null);
		
		JLabel lblHeading = new JLabel("Holly's MadLibs App");
		lblHeading.setBounds(0, 0, 850, 58);
		lblHeading.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHeading.setFont(new Font("Ravie", Font.PLAIN, 40));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblHeading);
		
		JLabel lblAdj1 = new JLabel("Enter 3 Adjectives:");
		lblAdj1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdj1.setBounds(22, 140, 173, 35);
		lblAdj1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		getContentPane().add(lblAdj1);
		
		txtAdj1 = new JTextField();
		txtAdj1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdj1.setBounds(205, 141, 96, 35);
		getContentPane().add(txtAdj1);
		txtAdj1.setColumns(10);
		
		JComboBox cboxTheme = new JComboBox();
		cboxTheme.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cboxTheme.setBounds(366, 75, 155, 21);
		cboxTheme.addItem("Vacations");
		cboxTheme.addItem("Ancient History");
		getContentPane().add(cboxTheme);
		
		JLabel lblTheme = new JLabel("Select a Theme:");
		lblTheme.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblTheme.setBounds(205, 68, 155, 35);
		getContentPane().add(lblTheme);
		
		txtAdj2 = new JTextField();
		txtAdj2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdj2.setColumns(10);
		txtAdj2.setBounds(311, 141, 96, 35);
		getContentPane().add(txtAdj2);
		
		txtAdj3 = new JTextField();
		txtAdj3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdj3.setColumns(10);
		txtAdj3.setBounds(417, 141, 96, 35);
		getContentPane().add(txtAdj3);
		
		JLabel lblEnterNouns = new JLabel("Enter 3 Nouns:");
		lblEnterNouns.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterNouns.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnterNouns.setBounds(22, 185, 173, 35);
		getContentPane().add(lblEnterNouns);
		
		txtNoun1 = new JTextField();
		txtNoun1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNoun1.setColumns(10);
		txtNoun1.setBounds(205, 186, 96, 35);
		getContentPane().add(txtNoun1);
		
		txtNoun2 = new JTextField();
		txtNoun2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNoun2.setColumns(10);
		txtNoun2.setBounds(311, 186, 96, 35);
		getContentPane().add(txtNoun2);
		
		txtNoun3 = new JTextField();
		txtNoun3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNoun3.setColumns(10);
		txtNoun3.setBounds(417, 186, 96, 35);
		getContentPane().add(txtNoun3);
		
		JLabel lblEnterPlural = new JLabel("Enter 3 Plural Nouns:");
		lblEnterPlural.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterPlural.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnterPlural.setBounds(-8, 230, 207, 35);
		getContentPane().add(lblEnterPlural);
		
		JLabel lblEnter = new JLabel("Enter a plant:");
		lblEnter.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnter.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnter.setBounds(501, 274, 195, 35);
		getContentPane().add(lblEnter);
		
		JLabel lblEnter_1 = new JLabel("Enter 2 Verbs ending in -ING:");
		lblEnter_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnter_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnter_1.setBounds(-8, 275, 279, 35);
		getContentPane().add(lblEnter_1);
		
		JLabel lblEnterABody = new JLabel("Enter a body part:");
		lblEnterABody.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterABody.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnterABody.setBounds(427, 231, 279, 35);
		getContentPane().add(lblEnterABody);
		
		JLabel lblEnterAGame = new JLabel("Enter a number:");
		lblEnterAGame.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterAGame.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnterAGame.setBounds(430, 140, 279, 35);
		getContentPane().add(lblEnterAGame);
		
		JLabel lblEnterAGame_1 = new JLabel("Enter a game:");
		lblEnterAGame_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterAGame_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEnterAGame_1.setBounds(559, 185, 150, 35);
		getContentPane().add(lblEnterAGame_1);
		
		txtPluralNoun1 = new JTextField();
		txtPluralNoun1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPluralNoun1.setColumns(10);
		txtPluralNoun1.setBounds(205, 231, 96, 35);
		getContentPane().add(txtPluralNoun1);
		
		txtPluralNoun2 = new JTextField();
		txtPluralNoun2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPluralNoun2.setColumns(10);
		txtPluralNoun2.setBounds(311, 231, 96, 35);
		getContentPane().add(txtPluralNoun2);
		
		txtPluralNoun3 = new JTextField();
		txtPluralNoun3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPluralNoun3.setColumns(10);
		txtPluralNoun3.setBounds(417, 231, 96, 35);
		getContentPane().add(txtPluralNoun3);
		
		txtVerb1 = new JTextField();
		txtVerb1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtVerb1.setColumns(10);
		txtVerb1.setBounds(281, 275, 96, 35);
		getContentPane().add(txtVerb1);
		
		txtVerb2 = new JTextField();
		txtVerb2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtVerb2.setColumns(10);
		txtVerb2.setBounds(395, 275, 96, 35);
		getContentPane().add(txtVerb2);
		
		txtNumber = new JTextField();
		txtNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNumber.setColumns(10);
		txtNumber.setBounds(719, 140, 96, 35);
		getContentPane().add(txtNumber);
		
		txtGame = new JTextField();
		txtGame.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtGame.setColumns(10);
		txtGame.setBounds(719, 185, 96, 35);
		getContentPane().add(txtGame);
		
		txtBodyPart = new JTextField();
		txtBodyPart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBodyPart.setColumns(10);
		txtBodyPart.setBounds(719, 230, 96, 35);
		getContentPane().add(txtBodyPart);
		
		txtPlant = new JTextField();
		txtPlant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPlant.setColumns(10);
		txtPlant.setBounds(719, 275, 96, 35);
		getContentPane().add(txtPlant);
		
		textAreaOutput = new JTextArea();
		textAreaOutput.setWrapStyleWord(true);
		textAreaOutput.setLineWrap(true);
		textAreaOutput.setFont(new Font("Monospaced", Font.BOLD, 13));
		textAreaOutput.setBounds(22, 400, 793, 159);
		getContentPane().add(textAreaOutput);
		
		lblYourMadlib = new JLabel("Your MadLib:");
		lblYourMadlib.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblYourMadlib.setBounds(22, 365, 155, 35);
		getContentPane().add(lblYourMadlib);
		
		btnNewButton = new JButton("GO!!");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate();
			}
		});
		btnNewButton.setBounds(395, 331, 85, 35);
		getContentPane().add(btnNewButton);
	}

	protected void generate() {
		String output = "A vacation is when you take a trip to some "+ txtAdj1.getText() 
				+ " place with your "+ txtAdj2.getText() +" family.  Usually you go to some place that is near a/an "+ txtNoun1.getText() 
				+ " or up on a/an "+ txtNoun2.getText() +".\r\n"
				+ "A good vacation place is one where you can ride " + txtPluralNoun1.getText() +" or play "+ txtGame.getText() 
				+ " or go hunting for " + txtPluralNoun2.getText() + ".  I like to spend my time " + txtVerb1.getText() 
				+ " or " + txtVerb2.getText() + ".\r\n  Last summer, my little brother fell in a/an "+ txtNoun3.getText() 
				+ " and got poison " + txtPlant.getText() + " all over his " + txtBodyPart.getText() 
				+ ".\r\n   Parents need vacations more than kids because parents are always very " + txtAdj3.getText() 
				+ " and because they have to work " + txtNumber.getText() + " hours every day all year making enough " + txtPluralNoun3.getText() 
				+ " to pay for the vacation.";
		textAreaOutput.setText(output);		
	}

	public static void main(String[] args) {
		MadLibsGame theGame = new MadLibsGame();
		theGame.setSize(new Dimension(950, 600));
		theGame.setVisible(true);
	}
}
