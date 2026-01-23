class VariableExample // class keyword with class name
{
	int id = 10; //-----Instance variable
	String name = "shreya the greatttttttttt";//instance variable
	int rollno ;
	
	Static int age = 20; // static variable
void display() // method
{
	String status = "active"; // local variable
	System.out.println("status: "+status); //printing statement
}
public static void main (String args[]) // main function
{
VariableExample var = new VariableExample(); // object creation
var.display();// method call , non static method so we have to create object
var.rollno = 20;// instance variable needs access of object

System.out.println("age"+age); //static variable access without any object

}
}
