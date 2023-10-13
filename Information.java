import java.util.Scanner;

public class Information {
    String name;
    String address;
    int age;

    public void tellName()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:-");
        name = sc.nextLine();

    }
    public void tellAddress()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Address:-");
        address = sc.nextLine();

    }
    public void tellAge()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:-");
        age = sc.nextInt();
    }

    public static void main(String[] args)
    {
        Information obj=new Information();
        obj.name="George";
        obj.address="Los Angels, USA";
        obj.age= 23;
        System.out.println("Name of the boy is: "+obj.name);
        System.out.println("address of the boy is: "+obj.address);
        System.out.println("age of the boy is: "+obj.age);
    }
}