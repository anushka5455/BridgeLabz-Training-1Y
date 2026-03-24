class TaskExample2 extends Thread
{
	public void run()
	{
		for (int i=1 ; i<=10 ; i++)
		{
			System.out.println("task2 :" +i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("error occured in task1... ");
			}
		}
	}
}
