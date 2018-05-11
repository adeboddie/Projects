//---------------------------------------------------------------//
//					HotDogStandtest.java						 //
//					Oladipupo Ajose								 //
//---------------------------------------------------------------//
public class HotDogStandTest {

	public static void main(String[] args) 
	{
			HotDogStand plano  = new HotDogStand (" ", 0);
			HotDogStand wylie  = new HotDogStand (" ", 0);
			HotDogStand dallas = new HotDogStand (" ", 0);
			HotDogStand plano2 = new HotDogStand (" ", 0);
			
			plano2.getStandID();
			plano2.setStandID("plano001");
			for (int i=0; i<=7; i++)
			{
				plano2.justSold();
			}
			System.out.println ("Plano2 = " + plano2);
			
			plano.getStandID();
			plano.setStandID("plano001");
			for (int i=0; i<=5; i++)
			{
				plano.justSold();
			}
			System.out.println ("Plano  = " + plano);
			
			wylie.getStandID();
			wylie.setStandID("wylie001");
			
			for (int i=0; i<=8; i++)
			{
				wylie.justSold();
			}
			System.out.println ("Wylie  = " + wylie);
			
			dallas.getStandID();
			dallas.setStandID("dallas001");
			
			for (int i=0; i<=10; i++)
			{
				dallas.justSold();
			}
			System.out.println("Dallas = " + dallas);
			System.gc();
			
			System.out.println("\nTotal Hotdogs sold across all stands = " + HotDogStand.getTotalHDSold());
			
			//Testing the equals method.
			System.out.println("\nIt is " + plano.equals(plano2)+ " that Hotdog stand in plano and plano2 are the same stands " );
			System.out.println("It is " + plano.equals(wylie)+ " that Hotdog stand in plano and plano2 are the same stands " );
	
	}

}
