/*
BillerApp 
__________

The prime objective is to explain the real time usage and implementation of interface and inheritance
Application is used to generate bill and process payment for a STORE
This is developed to demonstrate the use of inheritance and interface
It is a console based java application.

which has the following features.

1. Generate bill
2. Process payment
3. to view the cash / bank balance of STORE
3. scope to get the items from the UI and add to the cart (given as assignment)
4. scope to receive the payment details  from the UI  (given as assignment)


*/


public class BillerApp  {

	public static void main(String args[]){

	
		Item items1[] = new Item[5]; 
		items1[0] = new Item(101,"Pears      ",45.50,5);
		items1[1] = new Item(102,"Colgate    ",35.50,4);
		items1[2] = new Item(103,"Note Book  ",60.00,2);
		items1[3] = new Item(104,"Pen        ",15.00,5);
		items1[4] = new Item(105,"Boost      ",95.50,7);


		Item items2[] = new Item[5]; // for demo only using fixed size array
		items2[0] = new Item(101,"Medimix    ",45.50,5);
		items2[1] = new Item(102,"Closeup    ",35.50,8);
		items2[2] = new Item(103,"Note Book  ",60.00,4);
		items2[3] = new Item(104,"Pencil     ",15.00,3);
		items2[4] = new Item(105,"Hotlicks   ",95.50,1);

		// double totalAmount = 0;
		// System.out.println("______________________________________");
		// for(Item item : items){
		// 	System.out.println(item.getData());
		// 	totalAmount += item.getTotal();
		// }
		// System.out.println("______________________________________");
		// System.out.println("Grand Total : " + totalAmount);

		Helper.clear(); // to clear the screen

		/*
			Bill - class
			used to generate Bill with details
			Bill No, Bill Date, Customer Name,
			Item No | Item Name | price | qty | subTotal
			Grand Total

			assignment write code to get the customer details
			and the cart inputs from the UI
		*/

		Bill bill1 = new Bill(items1, "Saravanan");
		System.out.print(bill1.generateBill());

		System.out.println("Initial Store cash balance : " + Payment.getCashBalance());

		Helper.doWait(); // just wait until press any key


		/*
			Payment - class
				used to process the Payment 
				it supports cash, card and upi payment

				-- required payment type and amount 

			assignment write code to get payment details from the UI
		*/
	
		Payment.receivePayment(new CashPayment(), bill1.getTotalAmount());

		System.out.println("Store cash balance after first bill : " + Payment.getCashBalance());

		Helper.doWait(); // just wait until press any key
		

		Bill bill2 = new Bill(items2, "Kannan");
		System.out.print(bill2.generateBill());

		Helper.doWait(); // just wait until press any key

		Payment.receivePayment(new CashPayment(), bill2.getTotalAmount());
		System.out.println("Store cash balance after second bill : " + Payment.getCashBalance());

		Helper.doWait(); // just wait until press any key
	


		Bill bill3 = new Bill(items1, "Sudha");
		System.out.print(bill3.generateBill());

		System.out.println("Initial Store CARD (bank) balance : " + Payment.getCardBalance());

		Helper.doWait(); // just wait until press any key
		
		

		Payment.receivePayment(new CardPayment(), bill3.getTotalAmount());
		System.out.println("CARD balance (bank) after third bill : " + Payment.getCardBalance());

		Helper.doWait(); // just wait until press any key

	}

}