class TaskExample1 extends Thread
{
	public void run()
	{
		for (int i=1 ; i<=5 ; i++)
		{
			System.out.println("task1 :" +i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("error occured in task1... ");
			
		}
	}
	public static void main (String args[])
	{
		TaskExample1 t1 = new TaskExample1();
		TaskExample2 t2 = new TaskExample2();
		t1.start();
		t2.start();
	}
}
