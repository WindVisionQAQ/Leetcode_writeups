class Solution {
    public int maxSubArray(int[] nums) {
 		int MaxSum = Integer.MIN_VALUE;
 		int temp = 0;
 		for (int i=0;i<nums.length;i++)
 		{
 			temp += nums[i];
 			if(temp>MaxSum) MaxSum = temp;
 			if(temp<0) temp = 0;
 		}
 		return MaxSum;
    
}