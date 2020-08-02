import java.util.List;
import java.util.ArrayList;
public class School{
	private List<Teacher> teachers;
	private List<Student> students;
	private static int money=0;
	public School(List<Teacher> teachers,List<Student> students){
		this.teachers=teachers;
		this.students=students;
	}
	public School(){}
	public List<Teacher> getTeacher(){
		return teachers;
	}
	public void setTeacher(List<Teacher> teachers){
		this.teachers=teachers;
	}
	public List<Student> getStudents(){
		return students;
	}
	public void setStudent(List<Student> teachers){
		this.students=students;
	}
	public String toString(){
		return "Students:"+students+" Teachers:"+teachers;

	}
	/*public void studentsList(){
		students=new ArrayList<>();
		Student student= new Student(21172,"Placideh","Networking");
		students.add(student);
		student.payFees(89898);
		System.out.println(students);
	}
	public void teachersList(){
		teachers= new ArrayList<>();
		Teacher teacher=new Teacher(434343,"Muganga",332344.34444);
		teachers.add(teacher);
		System.out.println(teachers);
	}*/
	public int  getMoneyEarned(){
		
		return money;
	}
	public static void setMoneyEarned(int moneyEarned){
		money+=moneyEarned;
	}
	public static void getMomeyRemained(double salary){
		money-=salary;
	}
	
}