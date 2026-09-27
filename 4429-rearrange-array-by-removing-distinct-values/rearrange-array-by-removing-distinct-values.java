class Solution {
    public int[] rearrangeArray(int[] nums) {
      LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
      int n=nums.length;
      Arrays.sort(nums);
      int[] ans=new int[n];
      for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      int id=0;

      while(id<n){
        for(int x:map.keySet()){
            if(map.get(x)>0){
                ans[id++]=x;
                map.put(x,map.get(x)-1);
            }
        }
      }
    return ans;
    }
}