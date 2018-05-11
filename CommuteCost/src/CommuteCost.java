//**********************************************************************//									
//							CommunteCost.java							//
//																		//
//					Oladipupo Ajose. COSC 1337.S01						//
//**********************************************************************//

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CommuteCost 
{

	public static void main(String[] args) 
	{
		double distance = Double.parseDouble(JOptionPane.showInputDialog("Input the distance travelled in miles: "));							
		double gallons = Double.parseDouble(JOptionPane.showInputDialog("Input number of gallons purchased: "));					
		//For accuracy, it is assumed that the car fuel tank is constantly full before departure and refilled on arrival.
		//Hence, the actual quantity of fuel consumed is the quantity purchased.
		double price = Double.parseDouble(JOptionPane.showInputDialog("Input price of fuel per gallon: "));
		
		double costPerCommute = (distance/gallons) * price;
		
		//Formatting: All formatting does not impact accuracy of calculations.
		//Currencies formatted in Number formatter with the method US currency instance
		//Other quantities like distance and gallons are formatted to 2 decimal places.
		DecimalFormat numberFormatter = new DecimalFormat(".##"); 		
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		JOptionPane.showMessageDialog(null, "During your trip,\n You covered " + numberFormatter.format(distance) 
				+ " miles\n And used up " + numberFormatter.format(gallons) 
				+ " gallons at " + moneyFormatter.format(price) + " per gallon\n"
				+ "The cost of your communte is: " + moneyFormatter.format(costPerCommute)); 

	}

}
