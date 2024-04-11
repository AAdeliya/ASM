public class Solution {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int [] nums){
        //input nums = { 4, 1, 2, 1, 2}
        //output 4
        int a = 0; //result varible , assigned to zero, This variable will be used to store the result.
        for(int i:nums){ //iterate within all numbers
            a= a ^i; //XOR it (exclusive - only one of them shuld be true)
        }
        return a; //return exact that number 

    }

    //int a = 0;: Initialize an integer variable a to 0. This variable will be used to store the result.

//for (i : nums) { ... }: This is an enhanced for loop (also known as a "for-each" loop) in Java. It iterates over each element i in the nums array.

//a = a ^ i;: This line performs a bitwise XOR operation between the current value of a and the current element i in the array. The result of the XOR operation is then stored back in a.

//The XOR operation (^) has the property that if two bits are different, the result is 1; if two bits are the same, the result is 0. By performing XOR on all elements in the array, elements that appear twice will cancel each other out, leaving only the element that appears once.

//return a;: After processing all elements in the array, the method returns the value of a, which represents the single number that appears only once in the array nums.

    
    
}
