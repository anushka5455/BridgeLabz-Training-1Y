class stringapi
{
public static void main (String args[])
{
	String str = "hello world !!"; 
	
	//length
	System.out.println(str.length());
	
	//touppercase
	System.out.println(str.toUpperCase());
	
	//tolowercase
	System.out.println(str.toLowerCase());
	
	// charat
	System.out.println(str.charAt(4));
	
	// substring
	System.out.println(str.substring(7));   // world!!
	System.out.println(str.substring(0,5));   //hello
	
	//contains
	System.out.println(str.contains("hello")); //true
	
	//equals
	System.out.println(str.equals("hello world !!"));  //true
}
}
