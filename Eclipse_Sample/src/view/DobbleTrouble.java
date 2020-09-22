package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DobbleTrouble extends JFrame {
	
	
	public DobbleTrouble(String s) {
		super(s);
		initUI();
	}
	
	public void initUI() {
		this.getContentPane().setLayout(new BorderLayout());
		JPanel playerWindow = new JPanel();
		JPanel deckWindow = new JPanel();
		JPanel gameWindow = new JPanel();
		
		gameWindow.setLayout(new BoxLayout(gameWindow, BoxLayout.PAGE_AXIS));
		playerWindow.setBackground(Color.BLACK);
		deckWindow.setBackground(Color.RED);
		gameWindow.add(deckWindow);
		gameWindow.add(playerWindow);
		
		this.getContentPane().add(gameWindow);
		this.setPreferredSize(new Dimension(960, 960));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
	}
}
