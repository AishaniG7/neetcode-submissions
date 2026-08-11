class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int count = 0; 

        HashSet<Character> letters = new HashSet<>(); 

        for (int r = 0; r < s.length(); r++) {
            while (letters.contains(s.charAt(r))) {
                letters.remove(s.charAt(l)); 
                l++; 
            }

            letters.add(s.charAt(r)); 
            count = Math.max(count, r - l + 1); 
        }

        return count; 
        
    }
}
