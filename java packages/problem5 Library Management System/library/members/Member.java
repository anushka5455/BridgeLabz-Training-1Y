package library.members;

public class Member {
    String name;

    public Member(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Member: " + name);
    }
}