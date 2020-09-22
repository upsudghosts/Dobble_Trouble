package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.DobbleSymbol;

public class CardL implements ActionListener{
	ArrayList<DobbleSymbol> playerCard;
	ArrayList<DobbleSymbol> deckCard;
	
	public CardL(ArrayList<DobbleSymbol> pc, ArrayList<DobbleSymbol> dc) {
		this.playerCard = pc;
		this.deckCard = dc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(DobbleSymbol ds : playerCard) {
			if(e.getSource() == ds.symbolToButton()) {
				boolean b = checkRules(ds.symbolToInt());
				System.out.println("A good move was performed: " + b);
			}
		}
	}
	
	public boolean checkRules(int symbolSelected) {
		boolean goodMove = false;
		
		for(DobbleSymbol symbol: deckCard) {
			if(symbol.symbolToInt() == symbolSelected) goodMove = true;
		}
		return goodMove;
	}
	
}
