// class Solution {
//     public int firstUniqChar(String s) {
//         LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
//         for(Character c : s.toCharArray())
//         {
//             hm.put(c,hm.getOrDefault(c,0)+1);
//         }
//         for(int i=0; i<s.length(); i++)
//         {
//             if(hm.get(s.charAt(i))==1)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
