class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums[i]) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}


// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int num : nums)
//         {
//             hm.put(num,hm.getOrDefault(num,0)+1);
//         }
//         ArrayList<Integer> list = new ArrayList<>(nums.length);
//         for(Map.Entry<Integer,Integer> entry : hm.entrySet())
//         {
//             if(entry.getValue()==2)
//             {
//                 list.add(entry.getKey());
//             }
//         }
//         return list;
//     }
// }
