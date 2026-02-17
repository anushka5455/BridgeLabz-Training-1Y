class constructor_chaining
{
	int price,engine_no;
	String model_name ;
	public constructor_chaining(int price, String model_name)
	{
		this(1234,"honda");
		this.price = price;
		this.model_name = model_name;	
	}
	public constructor_chaining(int engine_no , String name)
	{
		this.engine_no = engine_no;
		this.name = name;
	}
	void display()
	{
		System.out.println("price:"+price);
		System.out.println("model_name:"+model_name);
		System.out.println("name:"+name);
		System.out.println("engine_no:"+engine_no);
	}
	public static void main (String args[])
	{
		constructor_demo obj = new constructor_demo(200000,"zz");
		ob.display();
	}
}
	
	