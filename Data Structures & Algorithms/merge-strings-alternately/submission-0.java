class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int l = 0, r = 0;
        while (l < n && r < m) {
            sb.append(word1.charAt(l));
            l++;
            sb.append(word2.charAt(r));
            r++;
        }
        while (l < n) {
            sb.append(word1.charAt(l));
            l++;
        }
        while (r < m) {
            sb.append(word2.charAt(r));
            r++;
        }
        return  sb.toString();
    }
}