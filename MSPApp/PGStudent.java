// PGStudent 'is a' Student
// PGStudent - sub class
// PG_PASS_MARK -- sub class property
// publications -- sub class property

class PGStudent extends Student{

	private static int PG_PASS_MARK;
	private int publications;

	public PGStudent(int rollNumber, String name, String department, int mark1, int mark2, int mark3, int publications){
		// can be used to invoke the base class constructor
		// must be the very first statement in the sub class constructor
		super(rollNumber, name, department, mark1, mark2, mark3);
		this.publications = publications;
	}

	public static void setPG_PASS_MARK(int pgPassMark){
		PG_PASS_MARK = pgPassMark;
	}
	public static int getPG_PASS_MARK(){
		return PG_PASS_MARK ;
	}

	public void setPublications(int publications){
		this.publications = publications;
	}
	public int getPublications(){
		return this.publications ;
	}

	protected String getResult(){
		if(getMark1() < getPG_PASS_MARK() || getMark2() < getPG_PASS_MARK() || getMark3() < getPG_PASS_MARK()){
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
		data += "PASS_MARK    : " + getPG_PASS_MARK() + "\n";
		data += "Publications : " + getPublications() + "\n";

		return data;

	} 

}