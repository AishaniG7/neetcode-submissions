class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>(); 

        if (s.length() != t.length()) {
            return false; 
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int n = map.get(s.charAt(i)) + 1; 
                map.put(s.charAt(i), n); 
            } else {
                map.put(s.charAt(i), 1); 
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (map.containsKey(t.charAt(j))) {
                int n = map.get(t.charAt(j)) -1; 
                map.put(t.charAt(j), n);
            }
        }

        for (int val: map.values()) {
            if (val != 0) {
                return false; 
            }
        }

        return true; 

    }
}
