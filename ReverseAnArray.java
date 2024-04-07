public class ReverseAnArray {

//Using Temp array
//Using Swapping
//Using Collections.reverse() method
//Using StringBuilder.append() method
//The first method is as follows: 

//Take input the size of the array and the elements of the array.
//Consider a function reverse which takes the parameters-the array(say arr) and the size of the array(say n).
//Inside the function, a new array (with the array size of the first array, arr) is initialized. The array arr[] is iterated from the first element, and each element of array arr[] is placed in the new array from the back, i.e., the new array is iterated from its last element.
//In this way, all the elements of the array arr[] are placed reversely in the new array.
//Further, we can iterate through the new array from the beginning and print the elements of the array.


  
    // function that reverses array and stores it  
    // in another array 
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        // printing the reversed array 
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr, arr.length); 
    } 
} 
//Reversed array is: 

//50
//40
//30
//20
//10