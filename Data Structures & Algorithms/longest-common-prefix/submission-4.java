class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isFound = true;

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    isFound = false;
                    break;
                }
            }

            if (!isFound) {
                break;
            }

            res += ch;
        }

        return res;
    }
}