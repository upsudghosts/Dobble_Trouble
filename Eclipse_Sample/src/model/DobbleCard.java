package model;

import java.util.ArrayList;
import java.util.Random;

public class DobbleCard {
	
	private ArrayList<DobbleSymbol> card = new ArrayList<>();
	private int player;
	
	public DobbleCard(int player) {
		this.player = player;
		initCard();
	}
	
	public void initCard() {
		Random r = new Random();
		boolean alreadyPresent = false;
		
		int symbol = r.nextInt(58);
		card.add(new DobbleSymbol(symbol));
		
		//creates a card with 8 different symbols
		while(card.size()<8) {
			symbol = r.nextInt(58);
			
			for(DobbleSymbol s : card) {
				if(symbol == s.symbolToInt()) alreadyPresent = true;
			}
			
			if(!alreadyPresent) card.add(new DobbleSymbol(symbol));
			alreadyPresent = false;
		}
	}
	
	public ArrayList<DobbleSymbol> getCard(){
		return card;
	}
}
