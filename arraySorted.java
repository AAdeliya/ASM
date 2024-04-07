// Recursive approach to check if an
//1: If size of array is zero or one, return true.
//2: Check last two elements of array, if they are
//sorted, perform a recursive call with n-1
//else, return false.
//If all the elements will be found sorted, n will
//eventually fall to one, satisfying Step 1.
// Array is sorted or not
class GFG {
 
    // Function that returns true if array is
    // sorted in non-decreasing order.
    static boolean arraySortedOrNot(int arr[], int n)
    {
 
        // Array has one or no element
        if (n == 0 || n == 1)
            return true;
 
        for (int i = 1; i < n; i++)
 
            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;
 
        // No unsorted pair found
        return true;
    }
 
    // driver code
    public static void main(String[] args)
    {
 
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
 
        if (arraySortedOrNot(arr, n))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }

    public static boolean isSorted(int[] a) 
{
    int i;
    for(i = 0; i < a.length; i ++);{
        if (a[i] < a[i+1]) {
            return true;
        } else {
            return false;   
        }
    }
}
//public static void main(String[] args)
{
    int ar[] = {3,5,6,7};
    System.out.println(isSorted(ar));   
}
}
 