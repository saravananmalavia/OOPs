ErrorLogger Utility App 
_______________________

ErrorLogger is used to log the error messages in Database, File or display it in the console.

which has the following features.

1. log the errors in the console
2. log the errors in the Database
3. log the errors in the File

Interface 

ErrorLogger (abstract method - writeLog())

class which implements the ErrorLogger interface

DBLogger - to log the errors in the db
FileLogger - to log the errors in the file
ConsoleLogger - to log the errors in the console

ErrorLogger

provides the feature to log the Error

ErrorLoggerApp

which uses the Error Handler class to log the errors in different ways

Concept  Used
--------------

1. interface
2. dynamic method dispatching (
3. runtime polymorphism (late binding)
4. exception handling
5. static functions

Prepared By

Saravanan M
+91 9 44 34 14 916