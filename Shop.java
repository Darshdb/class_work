//Q37-Create a class Customer where class varibles are (Custname,ProductName,ProductQuantity,TotalAmount )use appropriate getter setters for the same.



class Customer
{
    private String customerName,productName;
    private int productQuantity, TotalAmount;
    
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public int getproductQuantity()
    {
        return this.productQuantity;
    }
    public int getTotalAmount()
    {
        return this.TotalAmount;
    }
    
    public void getInfo()
    {
        System.out.println("Name : " +customerName);
        System.out.println("Product : " +productName + "  Quantity : "+productQuantity+ "  Price : "+65);
        System.out.println("Total : " +TotalAmount);

    }
    
    
    
    
    public void setdata(String name, String product, int quantity, int amount)
    {
        this.customerName = name;
        this.productName = product;
        this.productQuantity = quantity;
        this.TotalAmount = quantity+amount;
        
    }
    
   
}
public class Shop {

    
    public static void main(String[] args) {
        
        Customer obj = new Customer();
        
        obj.setdata("Darshan", "Snacks", 30, 5);
        obj.getInfo();
        
    }
    
}
