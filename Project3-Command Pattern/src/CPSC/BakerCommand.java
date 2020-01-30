package CPSC;

public class BakerCommand {

	String commandType;

	BakerCommand(String commandType){
		this.commandType = commandType;	

	}

	public void startPrep() {

		if( this.commandType.equals("Batter"))
		{
			Batter batter = new Batter();
			BatterMixCommand battercmd = new BatterMixCommand(batter);
			battercmd.execute();
		}
		else if (this.commandType.equals("Oven"))
		{
			Oven oven = new Oven();
			OvenonCommand ovencmd = new OvenonCommand(oven);
			ovencmd.execute();
			OvenoffCommand ovencmd1 = new OvenoffCommand(oven);
			ovencmd1.execute();
			
    	} 
		else if (this.commandType.equals("DecorateCake"))
		{
			DecorateCake decorate = new DecorateCake();
			StartDecorateCommand cakecmd =new StartDecorateCommand(decorate);
			cakecmd.execute();
			CompleteCakeCommand cakecmd1 = new CompleteCakeCommand(decorate);
			cakecmd1.execute();

		} 



	} 

}
