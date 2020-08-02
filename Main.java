import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
		Student student = new Student(21172,"Placid Hakiz","Networking");
		Student student2=new Student(21165,"Annaise Milka","Business");
	
		List<Student> studentLists=new ArrayList<>();
		studentLists.add(student);
		studentLists.add(student2);
		

		student.payFees(5000);
		student2.payFees(1500);
		System.out.println("'Students Field'");
		System.out.println("=========================================");

		System.out.println(student.toString());
		System.out.println(student2.toString());
		System.out.println("=========================================");

		System.out.println();
		
		Teacher teacher=new Teacher(23422,"Muganga j.Pierre",1000);
		Teacher teacher2=new Teacher(34222,"Jennifer Batamuliza",100);
		
		

		teacher.setSalary(300);
		teacher2.setSalary(500);
		List<Teacher> teacherLists= new ArrayList<>();
		teacherLists.add(teacher);
		teacherLists.add(teacher2);
		/*System.out.println("'Teacher Field'");
		System.out.println("=========================================");
		System.out.println(teacher.toString());
		System.out.println(teacher2.toString());
		System.out.println("=========================================");
		System.out.println();
		System.out.println();
*/

		School school=new School(teacherLists,studentLists);
		// System.out.println(school.getTeacher());
		// System.out.println(school.getStudents());
		System.out.println(school);

		/*school.studentsList();
		
		school.teachersList();*/
		System.out.println("'Money In The School'");
		System.out.println("=============================================");
		System.out.println("Money Paid to School:"+school.getMoneyEarned());
		System.out.println("=============================================");
		

	}
}