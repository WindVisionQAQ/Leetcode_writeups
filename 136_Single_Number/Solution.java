class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int e:nums) res = res ^ e;
        return res;
    }
}