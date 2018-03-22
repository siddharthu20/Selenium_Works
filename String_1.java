package FirstSeleniumPackage;

import java.util.regex.Pattern;

public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="ava";
		
		/*for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			
		}*/
		
		//int a = s.length();
		//System.out.println(a);
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.println("for reverse: "+s.charAt(j));
			
		}
		
		//using reverse method
		
		String strrev = new StringBuilder(s).reverse().toString();
		
	System.out.println("Using inbuild string reverse method: "+strrev);
	
	
	String flag ="";
	
	if(strrev.equalsIgnoreCase(s))
		flag = "paklindrome";
	else
		flag="not a palindrome";
	
	System.out.println(flag);
	
	
	
	
	String s_new = "this@i_smy&day";
	
	String delimiters = "\\d[A-Za-z !,?._'@]+, ";
  
	String[] tokensVal = s_new.split(delimiters);
     
     for(String token : tokensVal) {
      System.out.print(token);
   }
     
     
     
     String pat = "sdfasdfasdf";
     
     Pattern pat1 = Pattern.compile(pat);
     
     System.out.println("\nthe pattern is  : "+pat1);
     
     
     
     
    
     
     
     
     
     
     
}
	
}

