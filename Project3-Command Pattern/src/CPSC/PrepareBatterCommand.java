package CPSC;

public class PrepareBatterCommand implements CakeCommand{
	
	Batter batter;
	public PrepareBatterCommand(Batter batter) {
		super();
		this.batter = batter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println( "Cake Ingredients are ready ");
		batter.prepare();
		
	}

}



