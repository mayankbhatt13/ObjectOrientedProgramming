import java.util.ArrayList;
import java.util.List;

class College{
	String name;
	private List<Teacher> teacher;
	//Constructor
	public College(String name, List<Teacher> teacher) {
		this.name = name;
		this.teacher = teacher;
	}
	public List<Teacher> getTeachers(){
		return teacher;
	}
}
class Teacher{
	String name;
	String subject;
	public Teacher(String name, String sub) {
		this.name = name;
		this.subject = sub;
	} 
	@Override
	public String toString() {
		return "[Teacher :-"+name+", Subject :- "+subject +"]";
	}
}
public class aggregationDemo {
	public static void main(String[] args) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("Mayank", "Java"));
		teachers.add(new Teacher("Rahul", "Dotnet"));
		teachers.add(new Teacher("Ayush", "Phython"));
		/*We have the object of teacher class to college class, this type of association is Aggregation or classes
		having HAS-A relationships.*/
		College cObj = new College("MyCollege", teachers);
		for(Teacher t:teachers) {
			System.out.println(t.toString());
		}
	}
}
