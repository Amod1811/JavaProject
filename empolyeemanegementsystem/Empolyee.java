package empolyeemanegementsystem;

public class Empolyee {
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;
	public Empolyee(int id, String name, int age, String department, String designation, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.designation = designation;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", designation=" + designation + ", sal=" + sal + "]";
	}
	
	

}
