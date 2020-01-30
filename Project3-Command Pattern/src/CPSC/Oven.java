package CPSC;

public class Oven {


	//Prepared Batter should be poured into the Cake mold and place it in Oven
	
	
	int Temp =300;	
	public void setTemp(int Temp) 
	{  	
		this.setTemp(300);
	} 
	public int getTemp()
	{
		return Temp;
	}
	
	
	String Func= "Bake";	
	public void setFunc(String Func) 		    
	{  
		this.setFunc("Bake");	        
	}
	public String getFunc(String Func)
	{
		return Func;
	}
	
	double Time = 45.00;
	public void setTimer(Double Float) 
	{ 
		this.setTimer(45.00);
	} 
	public Double getTimer()
	{
		return Time;
	}

	void Ovenon() 
	{ 
		System.out.println("Oven Settings are ready to Bake the Cake"); 
		System.out.println("Oven Temperature in Degree Centigrade:" +Temp );
		System.out.println("Oven Function Mode:" + Func );
		System.out.println("Oven Timer in minutes:" + Time );
		
	}

	void Ovenoff() 
	{ 
		System.out.println("Oven Timer Beeped: Baked Cake is Ready "); 
	} 


} 






