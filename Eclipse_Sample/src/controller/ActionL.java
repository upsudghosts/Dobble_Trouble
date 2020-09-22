package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DobbleTrouble;
import view.Menu;

public class ActionL implements ActionListener {
	Menu m;
	DobbleTrouble dt;
	
	public ActionL(Menu m, DobbleTrouble dt) {
		this.m = m;
		this.dt = dt;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == m.play) playA();
		if(e.getSource() == m.settings) settingsA();
		if(e.getSource() == m.help) helpA();
		if(e.getSource() == m.quit) quitA();
		
	}
	
	public void playA() {
		m.setVisible(false);
		dt.setVisible(true);
	}
	
	public void settingsA() {
		System.out.println("settings");
	}
	
	public void helpA() {
		System.out.println("help");
	}
	
	public void quitA() {
		System.out.println("quit");
	}

}
