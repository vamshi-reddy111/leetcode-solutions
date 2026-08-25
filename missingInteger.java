class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1] == 1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int k:nums){
            hs.add(k);
        }
        
            int temp=sum;
            while(hs.contains(temp)){
                temp=temp+1;
            }
           
        
        return temp;
    }
}
