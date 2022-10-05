/*
Program to demonstrate the real time usage of abstract class

class MarksheetPreparationApp 

MSP - MarksheetPreparationApp 
	- is a Application which is used to prepare the mark sheet of both UG and PG Student
	- Student - Base class
	- UGStudent is a sub class of Student
	- PGStudent is a sub class of Student
*/

class MSPApp{

	public static void main(String args[]){

		// Base class object can hold the instance of its subclasses
		// sub class data members and member functions can be accessed by this object

		Student student1 = new UGStudent(101,"Alex","CSE",40,60,50);
		Student student2 = new UGStudent(101,"ROBIN","CSE",35,26,67);
		Student student3 = new UGStudent(103,"Richard","CSE",50,38,70);
		Student student4 = new PGStudent(201,"Rose","MCA",45,60,80,2);
		Student student5 = new PGStudent(201,"Orain","MCA",50,89,70,3);

		// static methods can be invoked using class name instead of object name

		UGStudent.setUG_PASS_MARK(40);
		PGStudent.setPG_PASS_MARK(70);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);

	}

}





