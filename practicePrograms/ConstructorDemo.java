class ConstructorDemo
{
	int id;
	String name ;
	int age ;
	//default constructor
	public ConstructorDemo()
	{
	System.out.println("constructor program");	
	} 
	//parameterised construct
	public ConstructorDemo(int id , String name , int age)
	{
	this.id = id;
	this.name = name;
	this.age = age ;
	}
	void display()
	{
		System.out.println("ID:" +id);
System.out.println("NAME:" +name);	
System.out.println("AGE:" +age);			
	}
	public static void main (String args[])
	{
		ConstructorDemo cd = new ConstructorDemo(1,"anushka",17);
			System.out.println(cd);	
			cd.display();
	}
}