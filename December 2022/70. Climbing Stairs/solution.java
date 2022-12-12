// Asked on 12-12-2022 (DD-MM-YYYY)
// Language: Java

class Solution {
    public int climbStairs(int n) {
        if(n<=0){
            return n;
        }

        int[] add = new int[n+1];

        add[0]=add[1]=1;

        for(int i=2; i<n+1; i++){
            add[i] = add[i-1]+add[i-2];
        }

        return add[n];
    }
}
