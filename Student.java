public class Student{
	private int id;
	private String name;
	private String faculty;
	private  int fees=0;
	public Student(int id,String name,String faculty){
		this.id=id;
		this.name=name;
		this.faculty=faculty;
	}
	
	public String toString(){
		return "id:"+id+" Name:"+name+" faculty:"+faculty;
	}
	public  void payFees(int fee){
		 
		 School.setMoneyEarned(fee);
		
	}



}