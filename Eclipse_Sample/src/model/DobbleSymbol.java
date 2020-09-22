package model;

import javax.swing.JButton;
import javax.swing.JLabel;

public class DobbleSymbol {
	private JButton symbButton;
	private int s;
	
	public DobbleSymbol(int s) {
		this.s = s;
		symbButton = new JButton(Integer.toString(s));
		symbButton.addActionListener(e -> System.out.println("button pressed " + s));
	}
	
	public int symbolToInt() {
		return s;
	}
	
	public JButton symbolToButton() {
		return symbButton;
	}
	
	public JLabel symbolToLabel() {
		return new JLabel(Integer.toString(s));
	}
}
