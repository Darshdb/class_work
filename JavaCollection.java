import java.util.*;
public class JavaCollection{
public static void main(String[]args)
{
	LinkedList<String> el=new LinkedList<String>();
	el.add("Ajay");
	el.add("Vijay");
	el.add("Sanjay");
	el.add("Dhiraj");
	Iterator<String> itr=el.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}