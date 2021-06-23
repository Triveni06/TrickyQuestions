package highestmarksstudent;

public class Student {

	private String name;
	private int rollno;
	private int age;
	private int marks;
	public Student(String name, int rollno, int age, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + ", marks=" + marks + "]";
	}
	
}
