import java.util.*;
public class ArrayList{
public static void main(String[]args)
{
	ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
	list.add("Mango");
	list.add("Apple");
	list.add("Banana");
	list.add("Orange");
	list.add("Grapes");
	//printing the arraylist object
System.out.println(list);
	//to access particular value
	String str=list.get(1);
	System.out.println("Element at index 1:"+str);
	//modify arraylist
	list.set(2,"plum");
	System.out.println("Modified ArrayList:"+list);
	//remove particular element
	String str1=list.remove(2);
	System.out.println("Updated ArrayList:"+list);
	System.out.println("Remove element:"+str1);
	
}
}
	