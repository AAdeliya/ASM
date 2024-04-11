public class ProductOfArrayExceptSelf {
    //given an integer array ums, return an array answer [i] is equal 
    //to the product of all the elements of nuums except nums[i]

    //input: nums=[1,2,3,4]
    //Output: [23,12,8,6]


    //So, the first and fomost, the simplest method that comed to mind is, I can loop
    //thought the complete array using a pointer, say l, for every index i, and multiply all the 
    //elements at index j except when i==j.
    //This would ensure that I skip the element at index i from being multiplied.
    //The time complexity for this silotion would be O(n^2)

    public int[] ProductOfArrayExceptSelf(int [] nums){

    
    int n = nums.length;
        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        
        return ans;
    }
}


