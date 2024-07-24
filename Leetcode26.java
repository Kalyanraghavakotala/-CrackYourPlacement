class Solution {
    public int removeDuplicates(int[] l) {
        int x = 1;
        for (int i = 0; i < l.length - 1; i++) {
            if (l[i] != l[i + 1]) {
            
                l[x] = l[i + 1];
                x++;
            }
        }
        return x;
    }
}
