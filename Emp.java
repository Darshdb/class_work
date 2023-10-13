/*Create a package Empdetails.Create a class Emp which has fields as Empid,Empname,Empdesignation ,Accept details from user and display the same*/

package Empdetails;
public class Emp
{
     public int emp_id;
     public String  emp_name,emp_designation;
     public Emp(int eid,String ename,String edesignation)
     {
          eid=emp_id;
          ename=emp_name;
	  edesignation=emp_designation;
         
     }
     public void display()
     {
          System.out.println("Employee id: "+emp_id);
          System.out.println("Employee name:"+emp_name);
          System.out.println("Employee designation:"+emp_designation);
         
     }
}