/*Create a method to find the average of all the elements in a LinkedList of integers.
 *Test your method with a sample LinkedList.*/

import java.util.*;
public class ListIntAverage{
public static void main(String[]args)
{

	LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

	Iterator<Integer> itr=list.iterator();
	double sum=0;
	int count=0;
	double avg;
	
	while(itr.hasNext())
	{
		int element=itr.next();
		sum=sum+element;
		count++;
	}
	if(count>0)
	{
		avg=sum/count;
		System.out.println("Average of linked list:"+avg);
	}
	else
	{
		System.out.println("linked list is empty");
	}
}
}