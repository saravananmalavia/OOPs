
/*

AddressBookApp class 

used to create a menu based app to manage the Address in a Address Book

*/

package escube.address;
import escube.address.AddressBook;
import escube.address.Address;
import escube.address.util.Helper;

public class AddressBookApp{

	public static void main(String args[]){


		// declaring AddressBook class object 
		AddressBook addressBook; 
		int option;


		// code to initialize the Address Book with some default addresses
		// if you don't want to have default addresses comment the default address block 
		// default address block begin

		// size - denotes the size of the address book
		// AddressBook object created using parametric constructor (size)
		int size = 6;
		addressBook = new AddressBook(size);


		// code to initialize the Address Book with some default addresses


		// 5 addresses added to the AddressBook using insertAddress() method whcih accept Address objects
		// 5 different anonymous objects has been passed to the insertAddress() method
		// creating an object without object name is called anonymous object

		addressBook.insertAddress(new Address(1, "Saravanan", "sarav@gamil.com", "+91 99443414916" , "Trivandrum", 695021));
		addressBook.insertAddress(new Address(2, "Rahul", "rahul@gamil.com", "+91 9441345123" , "Trivandrum", 695021));
		addressBook.insertAddress(new Address(3, "Silverstar", "silver@gamil.com", "+91 99443414123" , "Trivandrum", 695021));
		addressBook.insertAddress(new Address(4, "Alex", "sarav@gamil.com", "+91 99443123916" , "Trivandrum", 695021));
		addressBook.insertAddress(new Address(5, "Nishal", "nishal@gamil.com", "+91 99123414916" , "Trivandrum", 695021));

		// default address block end
		// if you don't want to have dynamic addresse Book comment the default address block 
		// and un comment the dynamic address block begin

		// to clear the console screen
		Helper.clear();

		// block for dynamic size Address Book
		//  dynamic address block begin
		// 

		// System.out.println("*******   Address Book App   *******");
		// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// System.out.print("Enter the size of the Address Book : ");
		// int size = Helper.getI();
		// addressBook = new AddressBook(size);
		// System.out.print("Successfully Address Book created");
		// System.out.println();

		//  dynamic address block end


		// Menu block - begin
		/*
			do while loop is used since no of iteration not known
			and need to print the menu atleast once without checking any condition
			switch case is used for doing various operations depends on option entered

		*/

		do{
			// menu options created using System.out.println

			System.out.println("***** Address Book App *****");
			System.out.println("****************************");
			System.out.println("1. Add new Address 			");
			System.out.println("2. Remove Address 	 		");
			System.out.println("3. Search Address			");
			System.out.println("4. Update Address			");
			System.out.println("5. List all  Address		");
			System.out.println("6. Clear the screen			");
			System.out.println("7. Exit 					");
			System.out.println("****************************");
			System.out.print  ("Enter the option 1-7	");

			option = Helper.getI(); // code to get the option from the user

			// depends on the option entered - code in the corresponding case block will be executed
			// switch can be used if multiple options are there instead using else if ladder
			// swich case can check only equal (< > >= etc conditions can't used with case)

			switch(option){
				
				case 1 : 
					System.out.println("Add New Address 	 ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~ ");

					Address newAddress =  getAddressDetails(option);

					int result = addressBook.insertAddress(newAddress);
					if(result > 0){
						System.out.println("Address added Successfully with id " + result);
					}else{
						System.out.println("Address mot added ... No space in the book");
					}
					Helper.nextOption();
					
					// execution will be stoped and excute the next statement after switch block
					// if break is not used here then continue the execution until find a break

					break ; 

				case 2 : 
					System.out.println("Remove Address 	     ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~ ");
					System.out.print("Enter id of the Address to be removed : ");
					int id = Helper.getI();

					if(addressBook.removeAddress(id)){
						System.out.println("Address removed Successfully...");
					}else{
						System.out.println("Address mot removed ...No such id exist");
					}
					Helper.nextOption();
					break ; 

				case 3 : 
					System.out.println("Search Address 	     ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~ ");
					System.out.print("Enter Name    : ");
					String name = Helper.getS();
					Address searchAddress = addressBook.getAddress(name);
					if(searchAddress != null)
						System.out.println(searchAddress);
					else
						System.out.println("No Address Found'");
						
					Helper.nextOption();

					break ; 

				case 4 : 
					System.out.println("Update Address 	     ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~ ");

					Address updateAddress =  getAddressDetails(option);

					if(addressBook.updateAddress(updateAddress)){
						System.out.println("Address updated Successfully...");
					}else{
						System.out.println("Address not updated ...");
					}
					Helper.nextOption();
					break ; 

				case 5 : 
					System.out.println("List All Address 	  ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~ ");

					Address []addresses = addressBook.listAddress();

					for(Address objAddress : addresses){
						if(objAddress != null)
						System.out.println(objAddress);
					}
					Helper.nextOption();
					break ; 

				case 6 : 
					Helper.clear();
					
					break ; 

				case 7 : 
					System.out.println("Thanks for using Address Book App");
					System.out.println("Have a Good Time ...");
					System.exit(0);
					break ; 



				default : 
					System.out.println("Wrong option");
					System.out.println("Kindly try with correct option ...");
					Helper.nextOption();
					break ; 
			}
			

		}while(option !=7);

		// Menu block - end
		

	}

		private static Address getAddressDetails(int option){

					int id = 0;
					// optin 4 -- update
					if(option == 4){
						System.out.print("Enter id      : ");
						id = Helper.getI();
					
					}

					System.out.print("Enter Name    : ");
					String name = Helper.getS();
					//System.out.println();

					System.out.print("Enter Email   : ");
					String email = Helper.getS();
					//System.out.println();


					System.out.print("Enter Mobile  : ");
					String mobileNumber = Helper.getS();
					//System.out.println();

					System.out.print("Enter Address  : ");
					String address = Helper.getS();
					//System.out.println();

					System.out.print("Enter Pincode  : ");
					int pincode = Helper.getI();
					//System.out.println();

				return (new Address(id,name,email,mobileNumber,address,pincode));
		}

}

