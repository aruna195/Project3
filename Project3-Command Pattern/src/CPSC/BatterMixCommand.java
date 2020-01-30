package CPSC;


public class BatterMixCommand implements CakeCommand{
	
	
	Batter batter;
	
	public BatterMixCommand(Batter batter) {
		super();
		this.batter = batter;
	}
	
	
	
	public void execute() {
		
		 this.batter.mixComplete();
		
		
	}

}





