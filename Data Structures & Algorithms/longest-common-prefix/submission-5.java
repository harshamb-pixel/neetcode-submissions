class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String res ="";
        int n=s.length();
        if(n <=0){
            return "";
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            boolean isFound = true;
            for(int j=0;j<strs.length;j++){
                if(i >= strs[j].length() || ch != strs[j].charAt(i) ){
                    isFound = false;
                    break;
                }
            }
            if(!isFound){
                break;
            }
            res += ch;
        }
        return res;
    }
}