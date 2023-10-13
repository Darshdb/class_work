//to string to array

class ToString{
int empcode;
String name;
String city;
Student(int empcode, String name, String city){
this.empcode=empcode;
this.name=name;
this.city=city;
}
public String toString();
return empcode+" "+name+" "+city;
}
public static void main(String args[]){
ToString e1=new ToString(350,"Rohan","Kolkata");
ToString e2=new ToString(351,"Priya","Noida");
System.out.println(e1);
System.out.println(e2);
}
}
