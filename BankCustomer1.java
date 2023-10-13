//Bankcustomer class with acno,atype,amt fields using constructor overloading?

public class BankCustomer1 {
    private int acno;
    private String atype;
    private double amt;

  
    public BankCustomer1(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    
    public BankCustomer1(int acno, String atype) {
        this(acno, atype, 0.0);
    }

    
    public void displayDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: " + amt);
    }

    public static void main(String[] args) {
       
        BankCustomer1 bk1 = new BankCustomer1(1001, "Savings", 5000.0);
        BankCustomer1 bk2 = new BankCustomer1(1002, "Current");

        
        System.out.println("Customer 1 Details:");
        bk1.displayDetails();
        
        System.out.println("Customer 2 Details:");
        bk2.displayDetails();
    }
}
