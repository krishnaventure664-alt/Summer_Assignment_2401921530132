package week1.day2;
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start =0;
        int tempstart=0;
        int end=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max = sum;
                start = tempstart;
                end = i;
            }
            if(sum<0){
                sum=0;
                tempstart = i+1;
            }
        }
        return max;
    }
}