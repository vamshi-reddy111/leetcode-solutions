class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<101;i++){
            int temp=i;
            int p=1;
            while(temp != 0){
                int k=temp%10;
                p*=k;
                temp=temp/10;
            }
            if(p % t == 0){
                return i;
            }
        }
        return 0;
    }
}
