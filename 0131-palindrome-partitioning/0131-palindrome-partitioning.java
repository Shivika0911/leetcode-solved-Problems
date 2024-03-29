class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        finalPartition(0,s,ans,res);
        return ans;

    }
    public void finalPartition(int indx, String s , List<List<String>> ans,List<String> res){
        if(indx == s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i =indx;i<s.length();++i){
            if(isPalindrome(s,indx,i)){
                res.add(s.substring(indx,i+1));
                finalPartition(i+1,s,ans,res);
                res.remove(res.size()-1);

            }
        }
    }

    public boolean isPalindrome(String s, int start , int end){
        while(start<=end){
        if(s.charAt(start++) != s.charAt(end--)){
            return false;
        }
        }

        return true;
    }
}