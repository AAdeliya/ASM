public class Solution {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int [] nums){
        //input nums = { 4, 1, 2, 1, 2}
        //output 4
        int a = 0; //result varible , assigned to zero
        for(int i:nums){ //iterate within all numbers
            a= a ^i; //XOR it (exclusive - only one of them shuld be true)
        }
        return a; //return exact that number 

    }
    
}
