package CPSC;

public class StartDecorateCommand implements CakeCommand{
	
	DecorateCake decorate;
	
	public StartDecorateCommand(DecorateCake decorate) {
		super();
		this.decorate = decorate;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//System.out.println("Theme Decoration Started as per the Order Instructions");
		decorate.startDecorate();
		
	}

}
