/*1)Creating a linked list using the LinkedList class add programming languages
2)Adding elements to the list in multiple ways i.e. direct add and adding elements to specific index 
Accessing elements of linked list using get() and set()
How to remove the elements of the linked list*/

import java.util.*;
public class ListLanguage{
public static void main(String[]args)
{
	ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
	list.add("Java");
	list.add("Python");
	list.add("Asp.net");
	list.add("C");
	list.add("Cpp");
	//printing the arraylist object
System.out.println(list);
	//to access particular value
	String str=list.get(1);
	System.out.println("Element at index 1:"+str);
	//modify arraylist
	list.set(2,"Sql");
	System.out.println("Modified ArrayList:"+list);
	//remove particular element
	String str1=list.remove(2);
	System.out.println("Updated ArrayList:"+list);
	System.out.println("Remove element:"+str1);
	
}
}
	