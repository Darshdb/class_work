/*.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.*/


import java.util.*;
public class ArrayListInt{
public static void main(String[]args)
{
	ArrayList<Integer> list=new ArrayList<Integer>(); //Creating arraylist
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	//printing the arraylist object
System.out.println(list);
	//to access particular value
	int str=list.get(1);
	System.out.println("Element at index 1:"+str);
	//modify arraylist
	list.set(2,10);
	System.out.println("Modified ArrayList:"+list);
	//remove particular element
	int str1=list.remove(2);
	System.out.println("Updated ArrayList:"+list);
	System.out.println("Remove element:"+str1);
	
}
}
	