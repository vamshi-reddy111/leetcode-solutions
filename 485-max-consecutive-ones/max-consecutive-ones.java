class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int m=0;
        int c=0;
        for(int i=0;i<n;i++){
            
            if(nums[i] == 1){
                c++;
               
            }
            else{
                c=0;
            }
             m=Math.max(m,c);
        }
        return m;
    }
}