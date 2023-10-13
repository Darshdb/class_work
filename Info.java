class Info
{
String name;
String address;
int age;
void tellName(){ };
void tellAddress(){ };
void tellAge(){ };
public static void main(String agrs[])
{
Info obj = new Info();
obj.name= "George";
obj.address = "Los Angels, USA";
obj.age = 23;
System.out.println("Name of the boy is: "+obj.name);
System.out.println("Address of the boy is: "+obj.address);
System.out.println("Age of the boy is: "+obj.age);
}
}
