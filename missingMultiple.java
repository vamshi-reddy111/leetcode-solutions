class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i=k;i<Integer.MAX_VALUE;i+=k){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
