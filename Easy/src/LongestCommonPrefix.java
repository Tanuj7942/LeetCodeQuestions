public class LongestCommonPrefix {
    public static void main(String args[]) {
        Solution14 sol = new Solution14();
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}

// 14. Longest Common Prefix
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int count = 0;
        for (int i=0; i<strs.length;i++) {
            if(i==strs.length-1) {
                ans=ans+strs[i].charAt(count);
                i=0;
                count++;
                continue;
            }
            if(strs[i].charAt(count) != strs[i+1].charAt(count)) {
                break;
            }
        }
        return ans;
    }
}