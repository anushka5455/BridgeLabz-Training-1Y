import java.util.Scanner;
class 2darraysum
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter the size of row");
		int row = sc.nextInt();
		
		System.out.println ("Enter the size of column");
		int column = sc.nextInt();
		
		int sum = 0;
		int arr[][] = new int[row][column];
		
		System.out.println("Enter the elements of 2d array");
		for (int i = 0; i<row ; i++){
			for (int j = 0; j<column ; j++){
		arr[i][j] = sc.nextInt();
		sum = sum + arr[i][j];
			}
		}
		System.out.println("the sum of the given array is :"+sum);
	}
}
		