package highestmarksstudent;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student("tom",1,15,90);
		Student s2=new Student("peter",2,20,80);
		Student s3=new Student("david",3,30,95);
		Student s4=new Student("james",4,35,100);
		Student s5=new Student("john",5,40,99);
		List<Student>studentlist=new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		for(Student s:studentlist)
		{
			System.out.println(s);
		}
		//using streams
		System.out.println("---------------");
		studentlist.stream().forEach(e->System.out.println(e));
		//marks greater than 80
		studentlist.stream().filter(e->e.getMarks()>80)
		.forEach(e->System.out.println(e.getName()+ ":"+e.getMarks()));
		//highest marks 
		int highestmarks=studentlist.stream().map(e->e.getMarks()).max(Integer::compare).get();
		studentlist.stream().filter(e->e.getMarks()==highestmarks).forEach(e->System.out.println(e));
	}

}
