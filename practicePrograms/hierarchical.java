class games
{
	void genre()
	{
		System.out.println("parent class");
	}
}
class candy_crush extends games
{
	void candy()
	{
	System.out.println("child 1");
}
}
class subway_surfers extends games
{
	void subway()
	{
		System.out.println("child 2");
	}
}
class hierarchical
{
	public static void main (String args[])
	{
		candy_crush obj = new candy_crush();
		obj.genre();
		obj.candy();
		obj.subway();
		
	subway_surfers ob = new subway_surfers();
	ob.genre();
		ob.candy();
		ob.subway();
	}
}
