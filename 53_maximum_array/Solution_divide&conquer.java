class Solution {
    public int maxSubArray(int[] nums) {
    	return solution(0,nums.length-1,nums);
    }
    public int solution(int left, int right, int[] nums)
    {
    	if(left>=right) return nums[left];
    	int mid = (left + right) / 2;
        int temp_max = nums[mid];
    	int temp = nums[mid];
    	// 中间最大子序列
    	for(int i=mid-1;i>=left;i--)
    	{
    		 temp+=nums[i];
            if(temp>=temp_max) temp_max = temp;
    	}
        temp = temp_max;
    	for(int i=mid+1;i<=right;i++)
    	{   
            temp+=nums[i];
            if(temp>=temp_max) temp_max = temp;
    	}
    	// 左边最大子序列
    	int max_left = solution(left,mid-1,nums);
    	// 右边最大子序列
    	int max_right = solution(mid+1,right,nums);
    	return Math.max(Math.max(max_left,max_right),temp_max);
    }
}