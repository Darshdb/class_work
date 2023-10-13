public class MethodOverload{
	int add(int num1,int num2)
	{
		return num1+num2;
	}
	double add(int num1,double num2,int num3)
	{
	return num1+num2+num3;
	}
	int add(int num1,int num2,int num3,int num4)
	{
	return num1+num2+num3+num4;
	}
	public static void main(String[]args)
	{
		MethodOverload obj=new MethodOverload();
		System.out.println("sum of two numbers:"+obj.add(10,20));
		System.out.println("sum of two numbers:"+obj.add(10,2.5,9));
		System.out.println("sum of two numbers:"+obj.add(10,20,30,40));
}
}