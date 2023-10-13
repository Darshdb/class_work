//Q.1)WAP to accept array elements(input of 10 numbers) from user.and apply binary search to search parrticular element from that list.

import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers in ascending order:");
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        
        int index = binarySearch(numbers, target);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Element not found
    }
}
