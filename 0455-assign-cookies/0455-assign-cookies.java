class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int sIdx = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int content = 0;
        for (int i = 0; i < g.length; i++) {
            while(sIdx < s.length) {
                if(g[i] <= s[sIdx]) {
                    content += 1;
                    sIdx += 1;
                    break;
                }

                sIdx += 1;
            }
        }

        return content;
    }
}