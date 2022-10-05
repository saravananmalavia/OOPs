

/* Address - class used to store the details of a single address
   All data members must declared as private to hide the access from out side the class	
*/


// package is used to organise the related class files  
package escube.address;
public class Address{

	// hiding the access of data members from outside the class
	// using private access modifier -- can be accessed only with in the class
	// data members 

	private int id;
	private String name;
	private String email;
	private String mobileNumber;
	private String address;
	private int pincode;
	
	// non parametric constructor;
	// used to create empty object 
	// data members will be initialized with default values (int 0 | String null)
	// constructors will be invoked when an object is created

	public Address(){
		
	}

	// parametric constructor
	// can be used to create address object with data

	public Address(int id, String name, String email, String mobileNumber, String address, int pincode){

		// this keyword refers the current object
		// current object is nothing but by in which it is created
		// or by in which the method is called
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.pincode = pincode;
	}

	// data encapsulation 
	// private access members can be accessed only thru this member functions
	// setter and getter method
	// class with getter and setter methods is called bean class / POJO class

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id ;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name ;
	}


	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email ;
	}


	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber(){
		return this.mobileNumber ;
	}

	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address ;
	}

	public void setPincode(int pincode){
		this.pincode = pincode;
	}
	public int getPincode(){
		return this.pincode ;
	}

	// toString method is belongs to Object class
	// Object class is the root class of java
	// all built in and user defined classes are by default inherited from Object class
	// here overriding the toString method
	// it will be invoked when we pass the Address class object into the System.println()
	// or when concat with any other values

	// method overidding
	// same method name with same parameter  in base class and derived class


	public String toString(){

		String data = null;

		data = "Address Id     : " + getId() + " \n";
		data += "Name 		: " + getName() + " \n";
		data += "E-mail        : " + getEmail() + " \n";
		data += "Mobile Number : " + getMobileNumber() + " \n";
		data += "Address       : " + getAddress() + " \n";
		data += "Pincode       : " + getPincode() + " \n";

		return data;

	} 
	
}
