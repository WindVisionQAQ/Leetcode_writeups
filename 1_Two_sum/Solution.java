class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<nums.length;i++)
        {
        	if (!map.containsKey(target-nums[i])) map.put(nums[i],i);
        	else break; 
        }
        int[] res = new int[2];
        res[0] = map.get(target-nums[i]);
        res[1] = i;
        return res;
    }
}