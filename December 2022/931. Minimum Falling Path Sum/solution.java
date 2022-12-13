// Asked on: 13-12-2022
// Language: Java

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int ans = Integer.MAX_VALUE;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<c; i++){
            ans = Math.min(ans, helper(0, i, map, matrix));
        }

        return ans;
    }

    public static int helper(int i, int j, HashMap<String, Integer> map, int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        if(i==r){
            return 0;
        }
        if(j<0 || j>=c){
            return Integer.MAX_VALUE;
        }

        String key = i+"aaditya"+j;

        if(map.containsKey(key)){
            return map.get(key);
        }

        int rec1 = helper(i+1, j-1, map, matrix);
        int rec2 = helper(i+1, j, map, matrix);
        int rec3 = helper(i+1, j+1, map, matrix);

        map.put(key, matrix[i][j]+Math.min(rec1, Math.min(rec2, rec3)));
        return matrix[i][j]+Math.min(rec1, Math.min(rec2, rec3));

    }
}
