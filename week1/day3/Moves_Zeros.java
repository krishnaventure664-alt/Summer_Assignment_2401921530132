package week1.day3;

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int start =-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                start = i;
                break;
            }
        }
         if (start == -1) {
            // No zero in array
            System.out.println(Arrays.toString(nums));
            return;
        }
        
        
        for(int j=start+1;j<n;j++){
            if(nums[j] != 0){
                int temp = nums[start];
                nums[start] = nums[j];
                nums[j] = temp;
                start++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}