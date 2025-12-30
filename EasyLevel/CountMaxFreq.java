// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int num : nums)
//         {
//             hm.put(num,hm.getOrDefault(num,0)+1);
//         }
//         int maxfreq=0;
//         for(int freq : hm.values())
//         {
//             maxfreq =Math.max(maxfreq,freq);
//         }
//         int result =0;
//         for(int freq : hm.values())
//         {
//             if(freq ==maxfreq)
//             {
//                 result +=freq;
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int max=0;
       for(int i:nums){
        if(freq[i]>max){
            max=freq[i];
        }
       }
       int sum=0;
      for(int i:freq){
        if(i==max){
            sum+=i;
        }
      }
      return sum;
    }
}
