class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String f = strs[0];
        String l = strs[strs.length - 1];

        StringBuilder sb = new StringBuilder();

        int n = Math.min(f.length(), l.length());

        for (int i = 0; i < n; i++) {
            if (f.charAt(i) == l.charAt(i)) {
                sb.append(f.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}