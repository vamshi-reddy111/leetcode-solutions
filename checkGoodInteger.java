class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqrsum=0;
        while(n != 0){
            int k=n%10;
            sum+=k;
            sqrsum+=k*k;
            n=n/10;
        }
        return (sqrsum - sum >= 50);
    }
}
