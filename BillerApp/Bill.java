/*

class Bill
to keep the details like Bill No, Date, Customer Name, purchased items and Bill amount

generateBill()
	 -- used to generate the Bill data 
	 -- it uses the getData() of Item class to get the details of items in the cart

*/


public class Bill{

	static int lastBillId;
	private int billId;
	private String billDate; // for demo only declared as String
	private Item items[];
	private double totalAmount;
	private String  customerName;
	
	public Bill(Item items[],String  customerName){

		this.billId = ++lastBillId;
		this.items = items;
		this.customerName = customerName;
		this.billDate = Helper.getNow();
	}

	public int getBillId(){
		return this.billId;
	}
	public String getBillDate(){
		return this.billDate;
	}
	public double getTotalAmount(){
		return this.totalAmount;
	}
	public String getCustomerName(){
		return this.customerName;
	}
	
	public String generateBill(){

		String billData = null;
		this.totalAmount = 0;

		billData = "______________________________________\n";
		billData += "	   ONE STOP STORE 		 		 \n";
		billData += "______________________________________\n";
		billData += "Bill No : " + getBillId() + " Date : " + getBillDate() + "\n";
		billData += "Customer Name : " + getCustomerName() + "\n";
		billData += "______________________________________\n";

		for(Item item : this.items){
			billData += item.getData() + "\n";
			this.totalAmount += item.getTotal();
		}
		billData += "______________________________________\n";
		billData += "Grand Total : " + this.totalAmount + "\n";
	
		return billData;

	}
}

