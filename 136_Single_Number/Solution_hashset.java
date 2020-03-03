class Solution_hashset {
    public int singleNumber(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for (int e:nums)
        {
            if (a.contains(e)) a.remove(e);
            else a.add(e);
        }
        Iterator<Integer> it = a.iterator();
        return (int)it.next();
    }
}