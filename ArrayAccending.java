//WAP to sort an array in ascending order

public class ArrayAccending
{
	public static void main(String[]args)
	{
		int[] a=new int[] {58,59,90,51,30};
		System.out.println("Array after sorting:");
		for(int i=0;i<5;i++)
		{
		
		for(int j=i+1;j<5;j++)
		{
			int tmp=0;
			if(a[i]>a[j])
			{
				tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
	}
System.out.println(a[i]);
}
}
}