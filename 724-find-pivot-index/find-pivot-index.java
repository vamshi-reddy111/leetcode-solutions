class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] lsum=new int[n];
        int[] rsum=new int[n];
        int l=0;
        for(int i=0;i<n;i++){
            l+=nums[i];
            lsum[i]=l;
        }
        int r=0;
        for(int i=n-1;i>=0;i--){
            r+=nums[i];
            rsum[i]=r;
        }

        for(int k = 0; k < n; k++) {
        int left = 0;
        int right = 0;
        if(k > 0) {
            left = lsum[k - 1];
        }

        if(k < n - 1) {
            right = rsum[k + 1];
        }

        if(left == right) {
            return k;
        }
    }
         return -1;
    }
}