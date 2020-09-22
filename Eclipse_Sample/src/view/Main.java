package view;



import controller.MenuL;

public class Main {
	public static void main(String[] args){
		
		Menu m = new Menu("Dobble");
		DobbleTrouble dt = new DobbleTrouble("Dobble");
		MenuL AL = new MenuL(m, dt);
		m.addAL(AL);
		m.setVisible(true);
		
	}
}
