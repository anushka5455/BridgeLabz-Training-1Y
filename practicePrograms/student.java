import java.util.Scanner;
class student
{
	String name;
	int age;
	int id;
	void displayDetails()
	{
String status = "active";
System.out.println("ID is "+id);
System.out.println("NAME is "+name);
System.out.println("AGE is "+age);
System.out.println("STATUS is "+status);


	}
	public static void main(String args[])
	{
		student s1 = new student();
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the id of the student");
		s1.id = sc.nextInt();
		System.out.println("enter the name of the student");
		sc.nextLine();
		s1.name = sc.nextLine();
		System.out.println("enter the age of the student");
		s1.age = sc.nextInt();
		s1.displayDetails();
	}
}
