// Asked on: 03-12-2022
// Language: Java


class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashMap<Character, Integer> sorted_map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(Integer i: list){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue()==i){
                    sorted_map.put(entry.getKey(), i);
                }
            }
        }
        
        for(Map.Entry<Character, Integer> entry: sorted_map.entrySet()){
            for(int i=0; i<entry.getValue(); i++)
                sb.append(entry.getKey());
        }
        
        return sb.toString();
    }
}
