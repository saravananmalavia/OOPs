
/*AddressBook class is used to store N number of books

features 

1. to add new address int the address book
2. to remove an address from the address book using address id
3. search an address by name.
4. update the address
5. list all addresses in the address book

created memberfunctions for each features (task)

int insertAddress(Address address)
boolean updateAddress(Address address)
Address[] listAddress()
boolean removeAddress(int id)
Address getAddress(String name)


*/


// package is used to organise the related class files  
package escube.address;
import escube.address.Address;

class AddressBook{

	private static Address addresses[]; // array of objects declartion
	private static int size;

	public  AddressBook(){
		
	}

	public  AddressBook(int size){
		this.size = size;
		addresses = new Address[size]; // array of objects creation

	}


	// insert the address into AddressBook 
	public static int insertAddress(Address address){
		
		for(int i=0; i<size; i++ ){
			if(addresses[i] == null){
				addresses[i] = address;
				address.setId(i+1);
				return address.getId();
			}
		}

		return 0;
		

	}

	// update the address in the AddressBook 
	public static boolean updateAddress(Address address){
		System.out.println(address);
		for(int i=0; i<size; i++ ){
			if(addresses[i] != null){
				if(addresses[i].getId() == address.getId()){
					System.out.println(addresses[i]);
					addresses[i] = address;
					System.out.println(addresses[i]);
					return true;
				}
				
			}
		}

		return false;
	}

	// fetch all the addresses from the AddressBook
	public static Address[] listAddress(){
				return addresses;
	}

	// assign null value to the array of AddressBook if address exists
	public static boolean removeAddress(int id){

		boolean result = false;
		if(id <= size &&  id >0){
			if( addresses[id-1] != null){
				addresses[id-1] = null;
				result = true;
			}
		}

		return result;

	}

	// to fetch an address against the name field in the address

	public static Address getAddress(String name){
		for(Address address : addresses){
			if(address != null){
					if(address.getName().equals(name)){
					return addresses[address.getId()-1];
				}
			}

		}
		return null;
		
	}
	
}