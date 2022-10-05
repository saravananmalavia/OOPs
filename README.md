# OOPs
OOPS with real time use cases

BillerApp 
__________

The prime objective is to explain the real time usage and implementation of interface and inheritance.
Application is used to generate bill and process payment for a STORE.
This is developed to demonstrate the use of inheritance and interface.
It is a console based java application.

which has the following features.

1. Generate bill
2. Process payment
3. to view the cash / bank balance of STORE
3. scope to get the items from the UI and add to the cart (given as assignment)
4. scope to receive the payment details  from the UI  (given as assignment)


class BillerApp 
		-- Console Application to generate bill and payment

class Item
	to keep the details of every item in the bill like
		item no, item name, price , qty and subTotal
	getData() - to fetch the details of a single item in the bill 

class Bill
	to keep the details like Bill No, Date, Customer Name, purchased items and Bill amount

	generateBill() -- used to generate the Bill data 
				   -- it uses the getData() of Item class to get the details of items in the cart
 
Interface PaymentGateway
	
	abstract method processPayment(PaymentGateway paymentGateway, double amount)
		-- to process various type of payment

class Payment
	to keep the STORE cash / CARD (bank) balance
		-- receivePayment(PaymentGateway paymentGateway, double amount)
		-- to procss the different payments cash / card / upi
		-- PaymentGateway may be CashPayment, CardPayment or UPIPayment 

class extends Payment and implements PaymentGateway
	  CashPayment - to process the cash payment  
	  CardPayment - to process the card payment  
	  UpiPayment  - to process the upi payment  

class Helper
	it is a utility class
		provides static functions to
			-- clear screen
			-- wait for enter
			-- get an integer from console
			-- get a string from console


Concept  Used
--------------

1. class & objects
2. encapsulation
3. this keyword
4. constructor
5. private & public access modifier
6. array of objects
7. interface & method overriding
8. dynamic method dispatching
7. static fileds and functions

Prepared By

Saravanan M
+91 9 44 34 14 916
