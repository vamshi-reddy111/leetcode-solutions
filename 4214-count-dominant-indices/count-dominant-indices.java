class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int a=0;
        int s=0;
        int[] pre =new int[n];
        for(int i=n-1;i>=0;i--){
            s+=nums[i];
            pre[i]=s;
        }
        
       for (int i = 0; i < n - 1; i++) {
            int sumAfter = pre[i + 1];
            int countAfter = n - i - 1;

            if (nums[i] > sumAfter / countAfter) {
                a++;
            }
        }
    return a;
    }
}