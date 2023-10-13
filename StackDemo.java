import java.util.*;
class StackDemo
{
public static void main(String[]args)
{
	Stack<String> stack=new Stack<String>();
	stack.push("Ashish");
	stack.push("sumit");
	stack.push("Amit");
	stack.push("Anish");
	stack.push("Garima");
	stack.pop();
	Iterator<String> itr=stack.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}