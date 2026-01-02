// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         for(int i=0; i<numbers.length; i++)
//         {
//             if(numbers[i]+ numbers[i+1] == target)
//             {
//                 return new int[] {i+1,i+2};
//             }
//             for(int j=i+1; j<numbers.length; j++)
//             {
//                 if(numbers[i] + numbers[j] ==target)
//                 {
//                     return new int[] {i+1,j+1};
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> s = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            s.put(nums[i],i);
        }

        for(int i=0 ; i<nums.length ; i++){
            int val = target-nums[i];
            System.out.println(val);
            if(s.containsKey(val) && i != s.get(val)){
                    arr[0] = i+1;
                    arr[1] = s.get(val)+1;
                    break;
            }
        }

        return arr;
    }
}
