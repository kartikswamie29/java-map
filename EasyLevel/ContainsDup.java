// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int num : nums)
//         {
//             hm.put(num,hm.getOrDefault(num,0)+1);
//         }
//         for(int freq : hm.values())
//         {
//             if(freq>1)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean containsDuplicate(int[] nums) {
          Set<Integer> intSet = new HashSet<>();
          for (int num : nums) {
            if (intSet.contains(num))
            return true;

            intSet.add (num);
          }
          return false;
        
    }
}
