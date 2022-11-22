// Asked on 22-11-2022
// Language: Java

class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=2; i<=n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++){
                int r = i - j*j;
                if(arr[r]<min){
                    min = arr[r];
                }
            }
            arr[i] = min+1;
        }
        return arr[n];
    }
    
}
