package CPSC;

public class OrderCake {

	public static void main(String[] args) {
		BakerCommand baker = new BakerCommand("Batter");
		 baker.startPrep();
		 BakerCommand oven = new BakerCommand("Oven");
		 oven.startPrep();
		 BakerCommand decorate = new BakerCommand("DecorateCake");
		 decorate.startPrep();	 
		 
	}

}
