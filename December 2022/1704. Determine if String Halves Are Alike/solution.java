// Asked on 01-12-2022
// Language: Java

import java.lang.*;
class Solution {
    public boolean halvesAreAlike(String s) {
        int count_a = 0;
        int count_b = 0;
        
        int len = s.length();
        
        for(int i=0; i<len/2; i++){
            char curr = Character.toUpperCase(s.charAt(i));
            if(curr == 'A' || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U'){
                count_a++;
            }
        }
        
        for(int i=len/2; i<len; i++){
            char curr = Character.toUpperCase(s.charAt(i));
            if(curr == 'A' || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U'){
                count_b++;
            }
        }
        
        return (count_a == count_b);
    }
}
