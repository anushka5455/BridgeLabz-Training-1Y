class harshit
{
	void smart()
	{
		System.out.println("parent class");
	}
}
class harsh extends harshit
{
	void kid()
	{
	System.out.println("bachu class");	
	}
}
class main
{
public static void main (String args[])
{
	harsh obj = new harsh();
	obj.smart();
	obj.kid();
}
}
