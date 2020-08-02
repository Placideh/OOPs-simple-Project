public class Teacher{
	private int id;
	private String name;
	private double salary;
	public Teacher(int id ,String name ,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void setSalary(double salary){
		this.salary+=salary;
		School.getMomeyRemained(this.salary);
	}
	@Override
	public String toString(){
		return "id:"+id+" Name:"+name+" Salary:"+salary;
	}

}