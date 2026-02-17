// Parent Class
class super_keyword_example {

int x = 10; // parent variable

// Parent constructor
super_keyword_example() {
System.out.println("super_keyword_example Constructor Called");
}

void show() {
System.out.println("super_keyword_example Method Called");
}
}
// Child Class
class Employee extends super_keyword_example {

int x = 20; // child variable

Employee() {

// Calling parent constructor
super();

System.out.println("Parent variable x = " + super.x);

super.show();

System.out.println("Employee Constructor Called");
}

public static void main(String[] args) {
Employee e = new Employee();
}
}