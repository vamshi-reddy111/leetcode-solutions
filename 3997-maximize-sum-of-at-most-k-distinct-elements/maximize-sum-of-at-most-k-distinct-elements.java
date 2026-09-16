class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!ls.contains(nums[i]) && ls.size()<k){
                ls.add(nums[i]);
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}