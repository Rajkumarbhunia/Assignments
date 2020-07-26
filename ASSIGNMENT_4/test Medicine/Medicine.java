package assignment_31;

public abstract class Medicine {
	double price;
	String expiryDate;
	public String getDetails()
	{
		return("Price:"+price+"\nExpiry Date:"+expiryDate);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public abstract void displayLabel();
	
}
