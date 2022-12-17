// Asked on: 17-12-2022 (DD-MM-YYYY)
// Language: Java

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int v1 = Integer.parseInt(st.pop());
                int v2 = Integer.parseInt(st.pop());

                st.push(Integer.toString(v1+v2));
            }
            else if(tokens[i].equals("-")){
                int v1 = Integer.parseInt(st.pop());
                int v2 = Integer.parseInt(st.pop());

                st.push(Integer.toString(v2-v1));
            }
            else if(tokens[i].equals("*")){
                int v1 = Integer.parseInt(st.pop());
                int v2 = Integer.parseInt(st.pop());

                st.push(Integer.toString(v1*v2));
            }
            else if(tokens[i].equals("/")){
                int v1 = Integer.parseInt(st.pop());
                int v2 = Integer.parseInt(st.pop());
                //System.out.println(v1/v2);
                st.push(Integer.toString(v2/v1));
            }
            else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.pop());
    }
}
