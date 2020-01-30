package CPSC;

public class OvenoffCommand implements CakeCommand {
	
	Oven oven;
	public OvenoffCommand(Oven oven)
	{
		super();
		this.oven =oven;
	}
@Override

	public void execute() {
			
		this.oven.Ovenoff();
		
	}
	}



