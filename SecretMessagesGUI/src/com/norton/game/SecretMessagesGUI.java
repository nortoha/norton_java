package com.norton.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SecretMessagesGUI extends JFrame {
	
	private JTextField txtKey;
	private JTextArea txtIn;
	private JTextArea txtOut;
	private JSlider slider;
	
	public SecretMessagesGUI() {
		
		setTitle("Holly's Secret Messages App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtIn = new JTextArea();
		txtIn.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtIn.setLineWrap(true);
		txtIn.setBounds(10, 37, 566, 131);
		getContentPane().add(txtIn);
		
		txtOut = new JTextArea();
		txtOut.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtOut.setLineWrap(true);
		txtOut.setBounds(10, 220, 566, 141);
		getContentPane().add(txtOut);
		
		txtKey = new JTextField();
		txtKey.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtKey.setBounds(263, 180, 45, 24);
		getContentPane().add(txtKey);
		txtKey.setColumns(10);
		
		JLabel txtKeyLabel = new JLabel("Key:");
		txtKeyLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtKeyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKeyLabel.setBounds(208, 180, 45, 19);
		getContentPane().add(txtKeyLabel);
		
		JButton btnButton = new JButton("Encode/Decode");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String message = txtIn.getText();
					int key = Integer.parseInt(txtKey.getText());
					String output = encode(message, key);
					txtOut.setText(output);
				} catch(Exception exc) {
					JOptionPane.showMessageDialog(null, "Please enter a whole number value for the encryption key.");
					txtKey.requestFocus();
					txtKey.selectAll();
				}
			}
		});
		btnButton.setBackground(new Color(192, 192, 192));
		btnButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnButton.setBounds(318, 178, 177, 26);
		getContentPane().add(btnButton);
		
		slider = new JSlider();
		slider.setValue(3);
		slider.setMajorTickSpacing(13);
		slider.setMinorTickSpacing(1);
		slider.setMinimum(-26);
		slider.setMaximum(26);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(10, 178, 188, 44);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txtKey.setText("" + slider.getValue());
				String message = txtIn.getText();
				int key = slider.getValue();
				String output = encode(message, key);
				txtOut.setText(output);
			}
		});
		getContentPane().add(slider);
		
	}

	public String encode(String message, int keyVal) {
		String output = "";
		
		char key = (char) keyVal;
		
		for(int i=0; i<message.length(); i++) {
			char input = message.charAt(i);
			
			if(input >= 'A' && input <= 'Z') {
				input += key;
				
				if(input > 'Z') {
					input -= 26;
				} 
				if(input < 'A') {
					input += 26;
				}
			} else if(input >= 'a' && input <= 'z'){
				input += key;
				
				if(input > 'z') {
					input -= 26;
				}
				if(input < 'a') {
					input += 26;
				}
			} else if(input >= '0' && input <= '9') {
				input += (keyVal % 10);
				
				if(input > '9') {
					input -= 10;
				}
				if(input < '0') {
					input += 10;
				}
			}
			output += input;
		}
		return output;
	}
	
	public static void main(String[] args) {
		SecretMessagesGUI theApp = new SecretMessagesGUI();
		theApp.setSize(new java.awt.Dimension(600, 400));
		theApp.setVisible(true);
	}
}
