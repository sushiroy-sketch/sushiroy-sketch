package TwoSum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

        public static void main (String[]args){
            int[] nums ={3,2,4};
            int target = 6;
            int[]res;
            res=twoSum(nums,target);
            System.out.println(Arrays.toString(res));
        }

        public static int [] twoSum(int[] nums, int target){
            Map<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if(numMap.containsKey(complement)){
                    return new int[] {numMap.get(complement),i};
                }
                numMap.put(nums[i],i);
            }
            return null;
        }

}
