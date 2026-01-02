class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i: nums)
        {
            set.add(i);
        }
        int count=0;
        int maxCount=0;
        for(int val : set)
        {
            if(set.contains(val+1))
            {
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else
            {
                count=0;
            }
        }
        return maxCount+1;
    }
}
