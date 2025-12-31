class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey(); 
            }
        }
        return -1;
    }
}


// class Solution {
//     public int singleNumber(int[] nums) {
//         int n=nums.length-1;
//         if(nums.length==1) return nums[0];
//         Arrays.sort(nums);
//         if(nums[0] != nums[1])
//         {
//             return nums[0];
//         }
//         for(int i=1; i<nums.length-1; i++)
//         {
//             if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
//             {
//                 return nums[i];
//             }
//         }
//         if(nums[n] != nums[n-1]) return nums[n]; 
//         return -1;
//     }
// }


