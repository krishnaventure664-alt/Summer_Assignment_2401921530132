// import java.util.*;
// public class Two_Sum {

//     public static int[] two_sum(int nums[],int target){
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }
import java.util.*;
public class Two_Sum {
    public static int[] twoSum(int nums[],int target){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int req = target-nums[i];

            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }

            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}