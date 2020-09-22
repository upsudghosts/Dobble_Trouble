package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DobbleTrouble extends JFrame {
	public DobbleTrouble(String s) {
		super(s);
		initUI();
		
	}
	
	public void initUI() {
		this.getContentPane().setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(1280, 720));
		this.pack();
	}
}
