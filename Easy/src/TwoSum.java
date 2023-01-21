import java.util.HashMap;

public class TwoSum {
    public static void main (String args[]) {
        Solution1 sol = new Solution1();
        sol.twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}

//1.Two Sum
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}