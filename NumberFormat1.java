package FirstSeleniumPackage;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//NumberFormat nf = NumberFormat.getInstance();
		
		String myString = NumberFormat.getPercentInstance().format(0.526);
		
		System.out.println("In percentage,the number is: "+myString);
		
		//to get a currency format : by default its in $ 
		
       String myString1 = NumberFormat.getCurrencyInstance(Locale.CANADA).format(25263);
		
		System.out.println("In currency,the number is: "+myString1);
		
		
	       String myString3 = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(200000);
	       System.out.println("In indian currency,the number is: "+myString3);
	       
	      String sdt= "siddharth";
	      System.out.println(sdt.toUpperCase());
	      
	      String outpt= sdt.substring(0, 1).toUpperCase() + sdt.substring(1);
	      System.out.println(outpt);
	      
	      
	      System.out.println("String1 is: "+myString1);
	      System.out.println("String3 is: "+myString3);
	      
	      int val = myString1.compareTo(myString3);
	      System.out.println(val);
	      
	      
	      
		
		
		
		
		
	}

}
