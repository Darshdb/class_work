//Q18-WAP to generate series of squares from 1 to 50 using for loop.

class ForSquare
{
	public static void main(String[]args)
	{
		int i,square;
		for(i=1;i<=50;i++)
		{
			square=i*i;
			System.out.println("Square of :" +i+ " "+ "is=" +square);
		}
}
}