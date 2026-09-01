class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<2){
            return 0;
        }
        int diff=0;
        for(int i=1;i<n;i++){
            int k=nums[i]-nums[i-1];
            if(k >diff){
                diff=k;
            }
        }
        return diff;
    }
}