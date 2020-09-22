package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ActionL;

public class DobbleTrouble extends JFrame {
	public DobbleTrouble(String s) {
		super(s);
		initUI();
		
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
		
		JButton play = new JButton("Play");
		play.addActionListener(e -> ActionL.playA());
		JButton settings = new JButton("Settings");
		settings.addActionListener(e -> ActionL.settingsA());
		JButton help = new JButton("Help");
		help.addActionListener(e -> ActionL.helpA());
		JButton quit = new JButton("Quit");
		quit.addActionListener(e -> ActionL.quitA());
	
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
	
}
