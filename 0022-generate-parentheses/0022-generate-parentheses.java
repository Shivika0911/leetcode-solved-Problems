class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generate("(",1,0,result,n);
        return result;
    }
    void generate(String current,int open,int close,List<String> result,int n){
        if(current.length()==n*2){
            result.add(current);
            return;
        }
        if(open<n) generate(current+"(",open+1,close,result,n);
        if(close<open) generate(current+")",open,close+1,result,n);
    }
}