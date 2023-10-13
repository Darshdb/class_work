import java.util.Scanner;

class Oop1
{
	double num1,num2,ans;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
	}
	public void addNum()
	{
		ans=num1+num2;
		System.out.println("The addition of two numbers is"+ans);
	}
	public void subNum()
	{
		ans=num1-num2;
		System.out.println("The subtraction of two numbers is"+ans);
	}
	public void mulNum()
	{
		ans=num1*num2;
		System.out.println("The multiplication of two numbers is"+ans);
	}
	public void divNum()
	{
		ans=num1/num2;
		System.out.println("The division of two numbers is"+ans);
	}
}
	public class Main
	{
		public static void main(String[]args)
		{
			Oop1 obj=new Oop1();
			obj.input();
			obj.addNum();
			obj.subNum();
			obj.mulNum();
			obj.divNum();
}
}