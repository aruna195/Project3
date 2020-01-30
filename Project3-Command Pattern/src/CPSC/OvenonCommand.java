package CPSC;

public class OvenonCommand implements CakeCommand{
	 Oven  oven;
	 public OvenonCommand(Oven oven) {
		 super();
		 this.oven = oven;
		 	 
	 }


@Override
public void execute() {
	// TODO Auto-generated method stub
	System.out.println("Oven is on");
	oven.Ovenon();
}

}