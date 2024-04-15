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



//public class ReverseArray {
    //public static void main(String[] args) {
        // Initialize the array
//         int[] array = {1, 2, 3, 4, 5};
        
//         // Reverse the array
//         reverseArray(array);
        
//         // Print the reversed array
//         System.out.print("Reversed array: ");
//         for (int num : array) {
//             System.out.print(num + " ");
//         }
//     }
    
//     public static void reverseArray(int[] array) {
//         // Iterate through half of the array
//         for (int i = 0; i < array.length / 2; i++) {
//             // Swap the elements at index i and array.length - 1 - i
//             int temp = array[i];
//             array[i] = array[array.length - 1 - i];
//             array[array.length - 1 - i] = temp;
//         }
//     }





//in Python
//# Define the original list
// original_list = [1, 2, 3, 4, 5]

// # Reverse the list using slicing
// reversed_list = original_list[::-1]

// # Print the reversed list
// print("Reversed list:", reversed_list)
// }



//By specifying [::-1], you're telling Python to create a new 
//list that starts from the end of the original list and moves towards 
//the beginning with a step size of -1, 
//effectively reversing the order of the elements.