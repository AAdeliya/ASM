public class MoveZeroes {
    //Move Zeroes
    //input nums= [0, 1,0,3,12]
    //output: [1,3,12,0,0]
    public static void main(String[] args) {
        
    }
    public void moveZeroes(int [] nums){
        int j=0;
        for(int i=0; i<nums.length; j++){
            if (nums[i]==0) continue;
            nums[j]= nums[i];
            j++;
        }
        while (j<nums.length){
            nums[j]=0;
            j++;
        }
            
        }
        public void moveZeroes2(int[] nums) {
            int left = 0;
             //This line initializes an integer variable
            // left to 0. The left variable is used to track the 
            //position where 
            //the next non-zero element should be placed in the array.
    
            for (int right = 0; right < nums.length; right++) {
                //This line starts a for loop with an initialization statement that initializes the right variable to 0. 
                //The loop continues as long as right is less than the length of the nums array. 
                //The right variable is used as a pointer to iterate through the array.
                if (nums[right] != 0) {
                    //Inside the loop, this if statement checks if the element at the current right position in the array nums is not equal to 0. 
                    //If the current element is non-zero, the code inside the if block is executed.
                    int temp = nums[right];
                    //Inside the if block, the code swaps the non-zero element at position right with the element at position left.
                    // It then increments the left pointer to prepare for the next non-zero element to be placed in the array.
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                }
            }        
        }
    
    }
    

