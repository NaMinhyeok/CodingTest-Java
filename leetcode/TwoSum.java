package leetcode;

/*
* Problem Url : https://leetcode.com/problems/two-sum/
* */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        int i = 1;
        throw new IllegalArgumentException();
    }
}
