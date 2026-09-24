class Solution {
    public int smallestIndex(int[] nums) {
        int temp;
           for(int i=0;i<nums.length;i++){
            temp=nums[i];
            int s=0;
            if(temp==0){
                s=0;
            } else{
            while(temp!=0){
                s+=temp%10;
                temp/=10;
            
            }
            }
                 if(s==i){
                    return i;
                    
                }
            

        }
        return -1;
    }
}