package CPSC;

public class CompleteCakeCommand implements CakeCommand{

	DecorateCake decorate;

	public CompleteCakeCommand(DecorateCake decorate) {

		this.decorate = decorate;
	}

@Override
	public void execute() {
				
		decorate.completeCake();

	}

}
