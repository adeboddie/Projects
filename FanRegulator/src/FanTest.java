//***********************************************************************************************//
//						FanTest.java	  					     					   		     //
//						Oladipupo Ajose. COSC 1337.S01				  					         //
//***********************************************************************************************//

public class FanTest 
{
	public static void main(String[] args) 
	{
		Fan f1 = new Fan ();
		Fan f2 = new Fan ();
		Fan f3 = new Fan ();
		
		f1.setSpeed(3);
		f1.setOn(true);
		f1.setRadius(10.0);
		f1.setColor("yellow");
		
		f2.setSpeed(2);
		f2.setOn(false);
		f2.setRadius(10.0);
		f2.setColor("yellow");
		
		f3.setSpeed(3);
		f3.setOn(true);
		f3.setRadius(10.0);
		f3.setColor("yellow");
		
		System.out.println ("\nFan 1 " + f1 );
		System.out.println ("Fan 2 "   + f2 );
		System.out.println ("Fan 3 "   + f3 );
		
		//Testing the equals method
		System.out.println("\nThe statement Fan f1 and f3 are identical is " 
                + f1.equals(f3));
		System.out.println("The statement Fan f1 and f2 are identical is " 
                + f1.equals(f2));
		
	}

}
