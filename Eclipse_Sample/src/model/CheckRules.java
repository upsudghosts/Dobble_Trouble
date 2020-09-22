package model;

import java.util.ArrayList;

public class CheckRules {

	private ArrayList<Integer> otherCard = new ArrayList<>();
	private int symbolSelected;
	
	public boolean CheckRules(int s, ArrayList<Integer> card) {
		boolean goodMove = false;
		this.otherCard = card;
		this.symbolSelected = s;
		
		for(int symbol: otherCard) {
			if(symbol == symbolSelected) goodMove = true;
		}
		
		return goodMove;
	}
}
