import java.util.Scanner;
class switch_exampler
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the bleh");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			System.out.println("helooo");
			break;
			case 2:
			System.out.println("heloooo worlddd");
			break;
			case 3:
			System.out.println("byeeeee");
			break;
			default:
			System.out.println("haaaaaaiiiiiiiiii");
			break;
		}
		sc.close();
	}
}
