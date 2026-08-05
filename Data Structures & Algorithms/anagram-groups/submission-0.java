class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>(); 
        HashMap<HashMap, List<String>> map = new HashMap<>(); 

        for (int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> frequency = new HashMap<>(); 
            for (int j = 0; j < strs[i].length(); j++) {
                String word = strs[i];
                if (frequency.containsKey(word.charAt(j))) {
                    int n = frequency.get(word.charAt(j)) + 1; 
                    frequency.put(word.charAt(j), n);
                } else {
                    frequency.put(word.charAt(j), 1);
                }
            }
            
            List<String> newList = new ArrayList<>();
            newList.add(strs[i]);


            if (map.containsKey(frequency)) {
                List<String> temp = map.get(frequency);
                temp.add(strs[i]);
                map.put(frequency, temp);
            } else {
                map.put(frequency, newList);
            }

        }
        
        for (List<String> x : map.values()) {
            list.add(x); 
        }
        return list; 

    }
}
