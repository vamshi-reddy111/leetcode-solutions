class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            int d=max-nums[i];
            ans+=d;
        }
        return ans;
    }
}