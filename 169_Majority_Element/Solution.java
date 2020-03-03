class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> a = new HashMap<>();
        for (int e: nums)
        {
            a.put(e,a.getOrDefault(e, 0)+1);
            if (a.get(e)> (nums.length/2)){res=e;break;}
        }
        return res;
    }
}