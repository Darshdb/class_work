//Q43-WAP to find Second largest number in an array

class SecondLargest

{
 public static void main(String[] args)
  {
    int [] arr= new int[]{58,34,76,39,30};
    System.out.println("Second largest number in array is ");
      
    for (int i =0;i<5;i++)
        {
          for (int j= i+1;j<5;j++)
           {
            int  temp = 0;
             if(arr[i]>arr[j])
              {
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
         
         }
       System.out.println(arr[3]);
     }
 }