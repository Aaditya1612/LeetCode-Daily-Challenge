// Asked on 11-12-2022 (DD-MM-YYYY)
// Language: Java

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i: nums){
            set.add(i);
        }
        
        return set.size();
    }
}
