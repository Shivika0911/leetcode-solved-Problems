class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for(String st:wordDict)
            set.add(st);
        Map<String,Boolean> map = new HashMap<>();
        return helper(s,set,map);
    }

    public boolean helper(String s, Set<String> set,Map<String,Boolean> map){
        boolean ans = false;
        if(map.containsKey(s))
            return map.get(s);
        for(int i=0;i<s.length();i++){
            if(set.contains(s.substring(0,i+1))){
                ans = ans ||  (i+1==s.length())?true:helper(s.substring(i+1,s.length()),set,map);
            }
        }
        map.put(s,ans);
        return ans;
    }
}