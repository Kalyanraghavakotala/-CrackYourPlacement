class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        // System.out.println(a);
        long max=Integer.MAX_VALUE;
        int i=0,j=m-1;
        while(j<n){
            
            long k=a.get(j),l=a.get(i);
            // System.out.println(k+" "+l);
            if((k-l)<max){
                max=k-l;
            }
            j++;
            i++;
        }
        
        return max;
    }
}
