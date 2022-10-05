/*

Demo program to explain the real usage of interface in real time applications

An ErrorLogger is used to log error messages
in Database, File or display it in the console.

interface - ErrorLogger (abstract method - writeLog())

class DBLogger, FileLogger and ConsoleLogger 
which implements the ErrorLogger interface

class ErrorLogger
provides the feature to log the Error

Application  - ErrorLoggerApp
which uses the Error Handler class to log the errors in different ways

*/

public class ErrorLoggerApp{

	public static void main(String args[]){


			  // block to generate Divide by Zero Exception
		
			   try{

			   	int a = 10;
			   	int b = a -10;
			   	int c = a/b; // to generate exception
			   	System.out.println(c);

			   }catch(Exception e){
			   		String errorMessage1  = "Erorr : Divide by Zero \n";
			   		 	   errorMessage1 += "******************************* \n";
					       errorMessage1 += "Method Name : doSomething File Name : Something.java \n";
					       errorMessage1 += "Date : 05 OCT 2022 Time : 09:10AM User : Admin IP: 192.168.1.1 "; 

					// calling logError function to log the error in  the Database
					// it is a static function so that it can be called by Class Name
					// without creating object
					ErrorHandler.logError(new DBLogger(), errorMessage1);
			   }

			   // block to generate Array Index out of bound Exception

			   try{

			   		int marks[] = {75,85,95,100,56};
			   		System.out.println(marks[5]); // to generate exception


			   }catch(Exception e){
			   		String errorMessage1  = "Erorr : Array Index out of bound \n";
			   		 	   errorMessage1 += "******************************* \n";
					       errorMessage1 += "Method Name : doSomething File Name : Something.java \n";
					       errorMessage1 += "Date : 05 OCT 2022 Time : 09:10AM User : Admin IP: 192.168.1.1 "; 

					// calling logError function to log the error in  the Database
					// it is a static function so that it can be called by Class Name
					// without creating object

					ErrorHandler.logError(new FileLogger(), errorMessage1);
			   }

			   // block to generate Null pointer Exception

			   try{
			   		Helper helper = null;
			   		helper.doGreet("Paul Singh"); // to generate exception


			   }catch(Exception e){
			   		String errorMessage1  = "Erorr : Null pointer Exception \n";
			   		 	   errorMessage1 += "******************************* \n";
					       errorMessage1 += "Method Name : doSomething File Name : Something.java \n";
					       errorMessage1 += "Date : 05 OCT 2022 Time : 09:10AM User : Admin IP: 192.168.1.1 "; 

					// calling logError function to log the error in  the Database
					// it is a static function so that it can be called by Class Name
					// without creating object

					ErrorHandler.logError(new ConsoleLogger(), errorMessage1);
			   }

	}
	
}

/*

Interface is just like class - Interface can have only abstract methods (without implementation)
All the abstract methods must be overridden when implemented in a class
if we use an interface it will be useful to introduce new features.
(flexible code change)
Low coupling -  least possible dependencies.
The coupling is about how changing one thing requires change in another.

// all fields are by default static final const in java

*/

interface ErrorLogger{
	public void writeLog(String errorDetails);
}

// class provides the function to write the Error logs in Database

class DBLogger implements ErrorLogger{
	public void writeLog(String errorDetails){
		// output statement used here only for demo purpose
		System.out.println("******************************* \n");
		System.out.println("Code to write the error in db : \n" + errorDetails);
	}
}

// class provides the function to write the Error logs in Console

class ConsoleLogger implements ErrorLogger{
	public void writeLog(String errorDetails){
		// output statement used here only for demo purpose
		System.out.println("******************************* \n");
		System.out.println("Error : \n" + errorDetails);
	}
}

// class provides the function to write the Error logs in FileLogger

class FileLogger implements ErrorLogger{
	public void writeLog(String errorDetails){
		// output statement used here only for demo purpose
		System.out.println("******************************* \n");
		System.out.println("Code to write the error in file : \n" + errorDetails);
	}
}

// class provides the function to handle the Error

class ErrorHandler{
	// static function so it can be called using class name (without creating object)
	// dynamic method dispatching 
	// runtime polymorphism
	// late binding

	// method will accept object of a class which implements the ErrorLogger interface
	// so in the runtime only it can decide which class method should be invoked
	// it is depends on the object passed
	// can be the object of FileLogger or ConsoleLogger or DBLogger

	public static void logError(ErrorLogger errorLogger, String errorDetails){
		errorLogger.writeLog(errorDetails);
	}
}

// Helper - utility class to generate greetings 

class Helper{
	public String doGreet(String name){
		return "Hi " + name + " Good Morning !";
	}
}



