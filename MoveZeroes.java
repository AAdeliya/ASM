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
    
}
