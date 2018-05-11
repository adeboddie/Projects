//---------------------------------------------------------------//
//					HotDogStand.java							 //
//					Oladipupo Ajose								 //
//---------------------------------------------------------------//
public class HotDogStand 
{
	private String StandID;
    private int HDSold;
    private static int TotalHDSold;
    private boolean disposeCalled;
    
	public String getStandID() 
	{
		return StandID;
	}

	public void setStandID(String standID) 
	{
		StandID = standID;
	}

	public int getHDSold() 
	{
		return HDSold;
	}

	public void setHDSold(int hDSold) 
	{
		HDSold = hDSold;
	}

	public static int getTotalHDSold() 
	{
		return TotalHDSold;
	}
	
	/**
	 * 
	 */
	public HotDogStand ()
	{
		this ("", 0);
		System.out.println ("HotDogStand Class - default constructor");
	}
	
	/**
	 * @param StandID - Hotdog Stand ID
	 * @param HDSold - Quantity of Hotdog sold in each stands
	 * @param TotalHDSold - Total quantity of Hotdog sold in all stands
	 */
	
	
	public HotDogStand ( HotDogStand original )
	{
		if ( original == null )
			throw new NullPointerException();
		else
		{		
			StandID = new String (original.StandID.toString() );
			HDSold = original.HDSold;
			disposeCalled = false;
			System.out.println( "HotDogStand class - copy constructor");
		}		
	}
	
	public HotDogStand (String id, int sold )
	{
		StandID = new String (id);
		this.HDSold = sold;
		disposeCalled = false;
		TotalHDSold += sold;
		System.out.println ("HotDogStand - overloaded constructor");
	}
	
	static 
	{
		TotalHDSold = 0;
	}
	
	public void justSold()
	{
		HDSold ++;
		TotalHDSold ++;
	}
    
	public String toString ()
	{
		String x = StandID + " has sold " + HDSold + " Hotdogs today";
		return x;
	}
	
	public boolean equals(Object obj)
	{
		if ( this == obj ) return true;

		if ( ( obj != null ) && ( getClass( ) == obj.getClass( ) ) )
		{
			HotDogStand HDStd  = ( HotDogStand ) obj;

			if ( ( StandID.toString().equals ( HDStd.StandID.toString() ) ) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public void finalize ( )
	{
		if ( !disposeCalled )
		{
			// Do my cleanup
			TotalHDSold--;
		}
		System.out.println  ( "Person class - finalize method" );
	}
	
	public void dispose ( )
	{
		disposeCalled = true;
		TotalHDSold--;
		System.out.println  ( "Person class - dispose method" );
	}
	
}
