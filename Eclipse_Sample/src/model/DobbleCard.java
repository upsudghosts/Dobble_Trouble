package model;

import java.util.ArrayList;
import java.util.Random;

public class DobbleCard {
	
	public ArrayList<Integer> card = new ArrayList<>();
	public int player;
	
	public DobbleCard(int player) {
		this.player = player;
		initCard();
	}
	
	public void initCard() {
		Random r = new Random();
		boolean alreadyPresent = false;
		
		int symbol = r.nextInt(58);
		card.add(symbol);
		
		//creates a card with 8 different symbols
		while(card.size()<8) {
			symbol = r.nextInt(58);
			
			for(int s : card) {
				if(symbol == s) alreadyPresent = true;
			}
			
			if(!alreadyPresent) card.add(symbol);
			alreadyPresent = false;
		}
	}
}
