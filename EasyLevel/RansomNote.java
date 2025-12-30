// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(char c : ransomNote.toCharArray())
//         {
//             hm.put(c,hm.getOrDefault(c,0)+1);
//         }
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char c : magazine.toCharArray())
//         {
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         for (char c : hm.keySet()) {
//             if (map.getOrDefault(c, 0) < hm.get(c)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] freq = new int[26];
        for(char ch: magazine.toCharArray()){
            freq[ch -'a']++;
        }
        for(char ch: ransomNote.toCharArray()){
            freq[ch -'a']--;
            if(freq[ch-'a']<0){
                return false;   
            }
        }
        return true;
    }
}
