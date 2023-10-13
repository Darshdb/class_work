//Q2-Create package MyArray to accept 10 values from user import created package to find particular element from the array using binary search algorithm


import myarray.AcceptArray; 										// Importing the AcceptArray class from the 'myarray' package
import java.util.Scanner;

public class BinarySearch											 // Class to perform binary search using the AcceptArray package

{
    public static void main(String args[]) 								//main method created
	{
        int[] arr = AcceptArray.acceptArray(); 							// Call acceptArray() to get an array from user
        int target; 													// The target element to search for
        int lb, ub, mid;												 // Variables for binary search
        Scanner sc = new Scanner(System.in);
		
        for (int i = 0; i < arr.length; i++)    								// Sorting elements in ascending order using Bubble Sort
		{
            for (int j = i + 1; j < arr.length; j++) 
			{
                if (arr[i] > arr[j]) 
				{					
                    int temp = arr[i];   
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		System.out.println("---------------------------");
		System.out.println("Sorted Array elements are: ");
		 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"   ");
		}

       																	 // Binary Search
        System.out.println("-------------------------------------------------");
        System.out.println("Enter any number for Search element from Array: ");
        target = sc.nextInt();
        lb = 0;
        ub = 9;
        int flag = 0;														 // To track whether the target element is found or not
        while (lb <= ub) 
		{
            mid = (lb + ub) / 2; // to find middle element
            if (target == arr[mid]) 
			{
                flag = 1;
                System.out.println(target + " is present in Array at the index " + mid);
                break; 														// Target found, no need to continue searching
            } 
			else if (target > arr[mid]) 
			{
                lb = mid + 1;
            } 
			else 
			{
                ub = mid - 1;
            }
        }

       																	s // Display the search result
        if (flag == 0) 
		{
            System.out.println(target + " is not present in Array.");
        }
    }
}
