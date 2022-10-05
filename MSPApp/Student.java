// Abstract class Student
// Partial class - can't create object
// can have abstract and non abstract methods
// can have static and non static fields
// while extending to the sub class - must override all the abstract methods


abstract class Student{
	private int rollNumber;
	private String name;
	private String department;
	private int mark1;
	private int mark2;
	private int mark3;

	

	protected void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;
	}
	protected int getRollNumber(){
		return this.rollNumber ;
	}

	protected void setName(String name){
		this.name = name;
	}
	protected String getName(){
		return this.name ;
	}

	protected void setDepartment(String department){
		this.department = department;
	}
	protected String getDepartment(){
		return this.department ;
	}

	protected void setMark1(int mark1){
		this.mark1 = mark1;
	}
	protected int getMark1(){
		return this.mark1 ;
	}

	protected void setMark2(int mark2){
		this.mark2 = mark2;
	}
	protected int getMark2(){
		return this.mark2 ;
	}

	protected void setMark3(int mark3){
		this.mark3 = mark3;
	}
	protected int getMark3(){
		return this.mark3 ;
	}

	protected int getTotal(){
		return this.mark1 + this.mark2 + this.mark3 ;
	}

	

	protected Student(int rollNumber, String name, String department, int mark1, int mark2, int mark3){
		this.rollNumber = rollNumber;
		this.name = name;
		this.department = department;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	// abstract method 
	// method without definition

	protected abstract String getResult();




	public String getData(){

		String data = null;

		data =  "Roll Number : " + getRollNumber() + "\n";
		data += "Name 		 : " + getName() + "\n";
		data += "Department  : " + getDepartment() + "\n";
		data += "Mark1       : " + getMark1() + "\n";
		data += "Mark2  	 : " + getMark2() + "\n";
		data += "Mark3       : " + getMark3() + "\n";
		data += "Total       : " + getTotal() + "\n";
		data += "Result      : " + getResult() + "\n";

		return data;

	} 


}