package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.CardL;
import model.DobbleCard;
import model.DobbleSymbol;
public class DobbleTrouble extends JFrame {
	public JPanel playerWindow;
	public JPanel deckWindow;
	public DobbleCard currPC;
	public DobbleCard currDC;
	
	public DobbleTrouble(String s) {
		super(s);
		initUI();
	}
	
	public void initUI() {
		this.getContentPane().setLayout(new BorderLayout());
		playerWindow = new JPanel();
		deckWindow = new JPanel();
		JPanel gameWindow = new JPanel();
		
		initPlayerWindow();
		initDeckWindow();
		initButtonListeners();
		
		gameWindow.setLayout(new BoxLayout(gameWindow, BoxLayout.PAGE_AXIS));
		deckWindow.setBackground(Color.LIGHT_GRAY);
		gameWindow.add(deckWindow);
		gameWindow.add(playerWindow);
		
		this.getContentPane().add(gameWindow);
		this.setPreferredSize(new Dimension(960, 960));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
	}
	
	public void initPlayerWindow() {
		playerWindow.setLayout(new GridLayout(2, 4));
		DobbleCard dc = new DobbleCard(0);
		this.currPC = dc;
		for(DobbleSymbol ds : dc.getCard()) {
			playerWindow.add(ds.symbolToButton());
		}
		
		
	}
	
	public void initDeckWindow() {
		deckWindow.setLayout(new GridLayout(2, 4));
		DobbleCard dc = new DobbleCard(1);
		this.currDC = dc;
		for(DobbleSymbol ds : dc.getCard()) {
			deckWindow.add(ds.symbolToLabel());
		}
		
	}
	
	public void initButtonListeners() {
		CardL cListener = new CardL(currPC.getCard(), currDC.getCard());
		for(DobbleSymbol ds : currPC.getCard()) {
			ds.symbolToButton().addActionListener(cListener);
		}
		
	}
	
}
