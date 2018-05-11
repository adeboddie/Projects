//***********************************************************************************************//
//						Fan.java	  					     					   		     	 //	
//						Oladipupo Ajose. COSC 1337.S01				  					         //
//***********************************************************************************************//
public class Fan {
	public final int SLOW   = 1;
	public final int MEDIUM = 2;
	public final int FAST   = 3;
	
	private int speed     = SLOW;
	private boolean on    = false;
	private double radius = 5;
	private String color  = "white";

	public int getSpeed() 
	{
		return speed;
	}

	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}

	public boolean isOn() 
	{
		return on;
	}	
	
	public void setOn(boolean on) 
	{
		this.on = on;
	}
	
	public String getFanStatus()
	{ 
		if (on == true)
			return "on";
		else
			return "off";
	}
	
	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public Fan ()
	{
		this ( 0, false, 0.0, "" );
		System.out.println( "Fan class - default constructor");
	}
	
	public Fan ( int speed, boolean on, double radius, String color )
	{
		this.speed  = 0;
		this.on     = on;
		this.radius = 0.0;
		this.color  = new String (color);
	}
	
	public boolean equals(Object obj) 
	{
    	if ( this == obj ) return true;
    	if ( obj  == null) return false;    	
		if ( getClass( ) != obj.getClass( ) ) return false;
			
		Fan f = ( Fan ) obj;

		if ( (speed   == f.speed ) &&
			 (on      == f.on) 	   && 
			 (radius  == f.radius)  &&
		     (color. toString().equals ( f.color. toString() ) ) )
		{
			return true;
		}
		else
		{
			return false;
		}
    }
    
	
	public String toString ()
	{	
		String f = " with radius " + radius + 
				" and colour " + color + 
				" is currently " + getFanStatus() + 
				" and is running at a speed of " + speed;
		return f;
	}
	

}
