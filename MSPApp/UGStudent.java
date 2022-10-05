
// UGStudent 'is a' Student
// UGStudent - sub class
// UG_PASS_MARK - sub class property

class UGStudent extends Student{

	// overriding the abstract methods

	private static int UG_PASS_MARK;

	public UGStudent(int rollNumber, String name, String department, int mark1, int mark2, int mark3){
		// can be used to invoke the base class constructor
		// must be the very first statement in the sub class constructor
		super(rollNumber, name, department, mark1, mark2, mark3);
	}

	public  static void setUG_PASS_MARK(int passMark){
		UG_PASS_MARK = passMark;
	}
	public static int getUG_PASS_MARK(){
		return UG_PASS_MARK ;
	}

	protected String getResult(){
		if(getMark1() < getUG_PASS_MARK() || getMark2() < getUG_PASS_MARK() || getMark3() < getUG_PASS_MARK()){
			return "FAIL";
		}else{
			return "PASS";
		}
	}


	// toString method is belongs to Object class
	// Object class is the root class of java
	// all built in and user defined classes are by default inherited from Object class
	// here overriding the toString method
	// it will be invoked when we pass the Address class object into the System.println()
	// or when concat with any other values

	// method overriding
	// same method name with same parameter  in base class and derived class

	public String toString(){

		String data = getData();
		data += "PASS_MARK    : " + getUG_PASS_MARK() + "\n";
		return data;

	} 

}