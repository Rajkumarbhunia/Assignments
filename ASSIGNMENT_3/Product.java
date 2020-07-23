/*#### 3. Create a class named Product with the following private instance variables
    productCode of type String
    productName of type String
    productPrice of type double
    categoryCode of type char (E-electronics, A-apparels, T-toys) 
      - Include a private static variable prodCounter of type int initialized to 100.
  - Create getters and setters for all variables
  - Create a private method generateProductCode which will return the product code as String. 
    - Product code is derived by concatenating categoryCode and incremented product counter.
  - Include a parameterized constructor with 3 parameters  ( productName, productPrice, categoryCode). 
    - prodCode should be assigned in constructor by using generateProductCode method. Initialize all the member variables.
  - Include an overloaded parameterized constructor with  2 parameter( productName, productPrice). 
    - prodCode should be assigned in constructor by using generateProductCode method. Category code should be assigned to ‘E’. Initialize all the member variables.
  - Include a method getProductDetails to format the product details. 
  - This method should return a String containing the product details  in the below format

        Product Code :  101, 
        Name : Laptop, 
        price : 45000.00, 
        Category : E

**Create class TestProduct with a main method to test above class**
- Create an object using the parameterized constructor with 3 parameters
- Get the product details by invoking getProductDetails and display the details
- Create another object using the parameterized constructor with 2 parameters
- Get the product details by invoking getProductDetails and display the details*/

package assignment_3;

public class Product {

	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;
	private static int prodCounter = 100;

	public Product(String productName, double productPrice, char categoryCode) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		this.productCode = generateProductCode();
	}

	public Product(String productName, double productPrice) {
		this.productCode = generateProductCode();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	private String generateProductCode()
	{
		this.productCode=categoryCode+Integer.toString(++prodCounter);
		return productCode;
	}

	public String getProductDetails() {
		return ("Product Code: " + productCode + ",\nName: " + productName + ",\nPrice:" + productPrice + ",\nCategory:"
				+ categoryCode);
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public char getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}

	public static int getProdCounter() {
		return prodCounter;
	}

	public static void setProdCounter(int prodCounter) {
		Product.prodCounter = prodCounter;
	}

	public static void main(String[] args) {
		Product pr = new Product("Laptop", 45000, 'E');
		System.out.println(pr.getProductDetails());

	}
}
