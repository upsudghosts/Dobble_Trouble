package view;



import controller.ActionL;

public class Main {
	public static void main(String[] args){
		
		Menu m = new Menu("Dobble");
		DobbleTrouble dt = new DobbleTrouble("Dobble");
		ActionL AL = new ActionL(m, dt);
		m.addAL(AL);
		m.setVisible(true);
		
	}
}
