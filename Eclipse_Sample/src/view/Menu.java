package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MenuL;

public class Menu extends JFrame {
	
	
	public JButton play;
	public JButton settings;
	public JButton help;
	public JButton quit;
	
	
	public Menu(String s) {
		super(s);
		initUI();
	}
	
	public void addAL(MenuL AL) {
		play.addActionListener(AL);
		settings.addActionListener(AL);
		help.addActionListener(AL);
		quit.addActionListener(AL);
	}
	
	private void initUI() {
		this.getContentPane().setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		
		buttonPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//c.gridwidth = GridBagConstraints.REMAINDER;
		//c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(10,0,0,0);
		
		play = new JButton("Play");
		settings = new JButton("Settings");
		help = new JButton("Help"); 
		quit = new JButton("Quit");
		
	
		buttonPanel.add(play, c);
		c.gridy = 1;
		buttonPanel.add(settings, c);
		c.gridy = 2;
		buttonPanel.add(help, c);
		c.gridy = 3;
		buttonPanel.add(quit, c);
		
		this.getContentPane().add(buttonPanel, BorderLayout.CENTER);
		this.setPreferredSize(new Dimension(1280, 720));
		this.pack();
	}
	
	/*
	public static void gameStart() {
		this.getContentPane().removeAll();
		JLabel dobble = new JLabel("Dobble Troublelelelelel");
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(dobble, BorderLayout.NORTH);
		
	}*/
	
}
