import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class ExArray {
    public static void main(String[] args) {


        /*  1.Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to  2
Test Data:
array = 50, -20, 0, 30, 40, 60, 10
Sample Output: false   */

        /* int[] arr = new int[]{50, -20, 0, 30, 40, 60, 10};
         if (arr[0] != arr[arr.length-1]) {
            System.out.println(false);}  */


//// طريقه اخرى
//        int[] arr = new int[]{50, -20, 0, 30, 40, 60, 10};
//        boolean compare=(arr[0] == arr[arr.length-1] );
//        System.out.println(compare);





        /*2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
Original Array: [1, 4, 17, 7, 25, 3, 100]
 Expected Output:
The average of the said array is: 22.0 The numbers in the said array that are
greater than the average are: 25 100      */

    /*   int[] arr = new int[]{1, 4, 17, 7, 25, 3, 100 };
         int sum=0 ;
         double avar=0;
    for (int value : arr) {
        sum = sum +value;  }

    avar = sum / arr.length;
    System.out.println("The average is: " + avar);
    System.out.print("Numbers greater than the average: ");
    for (int value: arr ){
        if (value > avar){
            System.out.print(value+" "); } }   */












        /* 3.Write a Java program to get the larger value between first and last
element of an array of integers.
Original Array:
[20, 30, 40]
Sample Output:
Larger value between first and last element: 40          */

/*
        int[] arr = new int[]{ 20, 30, 40};
            if ( arr[0] >arr[arr.length-1] ){
                System.out.println(" Larger value between first and last element: "+arr[0]); }
          else  { System.out.println(" Larger value between first and last element :"+arr[arr.length-1] ); } */







 /* 4.Write a Java program to swap the first and last elements of an array and
create a new array.
Original Array:
[20, 30, 40]
Sample Output:
New array after swapping the first and last elements: [40, 30, 20]    */

    /*   int[] arr=new int[]{20, 30, 40};
          int swap=arr[0];
          arr[0]= arr[arr.length-1 ];
          arr[arr.length-1 ] =swap;
        System.out.println("after swapping : "+Arrays.toString(arr));  */








      /*  5. Write a program that places the odd elements of an array before the even elements.
        Original Array: [2,3,40,1,5,9,4,10,7]
        Sample Output:  [3,1,5,9,7,2,40,4,10]         */

     /*  ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> order = new ArrayList<>();
        ArrayList <Integer>  arr=new ArrayList<>(Arrays.asList(2, 3, 40, 1, 5, 9, 4, 10, 7));

        System.out.println(" the original"+arr);
          for ( int value : arr ){
              if (value % 2 ==0 ){
                  even.add(value);
              } else {
                odd.add(value); }
          }
          order.addAll(odd);
          order.addAll(even);
        System.out.println("after order"+order);    */








        /*6. Write a program that test the equality of two arrays.
[2,3,6,6,4] [2,3,6,6,4]
Sample Output:
true */

    /*    int[] arr1=new int[]{2,3,6,6,4};
        int[] arr2=new int[]{2,3,6,6,4};
        boolean e=true;
        for (int i = 0; i < arr1.length ; i++) {
               if(arr1[i] != arr2[i]){
                e=false;}
        }
        System.out.println(e);      */















    }


    }
