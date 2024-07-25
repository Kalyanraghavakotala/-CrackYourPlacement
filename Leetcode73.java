class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rs = new HashSet<>();
        
        HashSet<Integer> cs = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0) {
                    rs.add(i);
                    cs.add(j);
                }
            }
        }

        // System.out.println(rs+  " " +cs);
        for(int ele:rs){
            
            for(int i=0;i<m;i++) 
            {
                System.out.println(ele + " "+ i);
                // matrix[ele][i]=0;
                Arrays.fill(matrix[ele],0);
            }
        }
        for(int ele:cs){
            for(int i=0;i<m;i++) matrix[i][ele]=0;
        }

    }
}
