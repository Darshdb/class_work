/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmethod;
import java.util.Scanner;
/**
 *
 * @author ashum
 */
public class Studentmethod {

    String name;
    String select;
    char division;
    int age;
    int rollno;
    Scanner sc = new Scanner(System.in);
        
    public void info()
    {
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Select the course that you want to enroll for : ");
        select = sc.nextLine();
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Enter your rollnumber : ");
        rollno = sc.nextInt();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll Number : "+rollno);
    }
    
    public void allottedClass()
    {
        
        if(select.equals("Science"))
        {
            System.out.println("You have been assigned to A division");
        }
        else if(select.equals("Commerce"))
        {
            System.out.println("You have been assigned to B division");
        }
        else
        {
            System.out.println("You have been assigned to C division");
        } 
    }
    
    public void selectCourse()
    {
        switch (select)
                {
            case "Science":
                System.out.println("You have enrolled in "+select);
                break; 
                
            case "Commerce":
                System.out.println("You have enrolled in "+select);
                break;   
                
            case "Arts":
                System.out.println("You have enrolled in "+select);
                break;    
                
            default :
                System.out.println("Please select a valid course");
                
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Studentmethod obj = new Studentmethod();
        
        obj.info();
        obj.allottedClass();
        obj.selectCourse();

    }
    
}