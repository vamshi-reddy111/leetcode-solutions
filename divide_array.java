class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int t=0;
        for(int i=1;i<n;i=i+2){
            if(nums[i] == nums[i-1]){
                t++;
            }
        }
        return (t == n/2);
    }
}
