//Bankcustomer class with acno,atype,amt fields using constructor overloading
import java.util.Scanner;
class BankCustomer
{
  float amt;
  String atype,acno;
  
public BankCustomer()
  {
    this.acno = acno;
    this.atype= atype;
    this.amt = amt;
  }

 void display()
  {
    System.out.println("Account number: "+acno);
    System.out.println("Account type: "+atype);
    System.out.println("Bank balance: "+amt);
  }
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter a account number:");
   String acno=sc.nextLine();
   System.out.println("Enter a account type:");
   String atype=sc.nextLine();
   System.out.println("Enter a balance:");
   float amt=sc.nextFloat();
  BankCustomer b = new BankCustomer();
  b.display();
}
}