class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character,Integer> hm1 = new TreeMap<>();
        TreeMap<Character,Integer> hm2 = new TreeMap<>();
        for(Character c : s.toCharArray())
        {
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }        
        for(Character c : t.toCharArray())
        {
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        return hm1.equals(hm2);
    }
}
