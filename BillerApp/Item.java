/*
class Item
	to keep the details of every item in the bill like
		item no, item name, price , qty and subTotal
	getData() - to fetch the details of a single item in the bill 
*/

public class Item{
	private int productId;
	private String productName;
	private double price;
	private int nos;
	private double total;

	public Item(int productId, String productName, double price, int nos ){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.nos = nos;
		this.total = price * nos;

	}

	public void setProductId(int productId){
		this.productId = productId;
	}
	public int getProductId(){
		return this.productId ;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getProductName(){
		return this.productName ;
	}

	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price ;
	}

	public void setNos(int nos){
		this.nos = nos;
	}
	public int getNos(){
		return this.nos ;
	}

	public double getTotal(){
		return this.total ;
	}

	public String getData(){

		String data = null;

		data =  getProductId() + " | " ;
		data += getProductName() + "| " ;
		data += getPrice() + " | " ;
		data += getNos() + " | " ;
		data += getTotal();

		return data;

	} 

}
