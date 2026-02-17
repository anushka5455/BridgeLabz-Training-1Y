class constructor_demo
{
	int age , id;
	String name;
	
	public constructor_demo()
	{
		System.out.println("DEFAULT CUNSTRUCTOR");
	}
	public constructor_demo(int id , int age , String name)
	{
		this.id = id;
		this.age = age;
		this.name = name;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("age:"+age);
		System.out.println("name:"+name);
	}
	public static void main (String args[])
	{
		constructor_demo obj = new constructor_demo();
		constructor_demo ob = new constructor_demo(1,20,"anushka");
		ob.display();
	}
}