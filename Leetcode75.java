class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) nums[low++]=0;

            if(nums[i] == 2) high--; 

        }
        int i;
        for(i=low;i<high+1;i++){
            nums[i]=1;
        }
        high+=1;
        while(high < n) nums[high++] =2;
    }
}
