// Asked on 21-112022
// Language: Java

class Solution {
    class Pair {
        int x, y, step;
        
        Pair(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
    int[][] visited;
    
    public int nearestExit(char[][] maze, int[] E) {
        Queue<Pair> q = new LinkedList<>();
        this.visited = new int[maze.length][maze[0].length];
        int[] delCol = {-1, 0, 1, 0};
        int[] delRow = {0, -1, 0, 1};
        
        q.add(new Pair(E[0], E[1], 0));
        visited[E[0]][E[1]] = 1;
        
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            if((curr.y == 0 || curr.x == 0 || curr.x == maze.length - 1 ||
                curr.y == maze[0].length - 1) && !(curr.x == E[0] && curr.y == E[1])) {
                return curr.step;
            }
            
            for(int i=0; i < 4; i++) {
                int currRow = curr.x + delRow[i];
                int currCol = curr.y + delCol[i];
                
                if(currCol >= 0 && currCol < maze[0].length && 
                   currRow >= 0 && currRow < maze.length && 
                   visited[currRow][currCol] == 0 && maze[currRow][currCol] == '.') {
                    
                    visited[currRow][currCol] = 1;
                    q.add(new Pair(currRow, currCol, curr.step + 1));
                }
            } 
        }
        
        return -1;
    }
}
