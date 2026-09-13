class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int n=nums.length;
       if( n== 1){
        return false;
       }
       HashMap<Integer,Integer> mp=new HashMap<>();
 
       for(int i=0;i<n;i++){
        if(mp.containsKey(nums[i])){
            int t=mp.get(nums[i]);
            if(Math.abs(i-t)<=k){
                return true;
            }

        }
        mp.put(nums[i],i);

       }
       return false;
         
    }
}