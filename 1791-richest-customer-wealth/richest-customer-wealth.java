class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int c = accounts[0].length;
        int r = accounts.length;
        for(int i=0;i<r;i++){
            int k=0;
            for(int j=0;j<c;j++){
                k+=accounts[i][j];
                if(sum<k){
                    sum=k;
                }
            }
        }
    return sum;
    }
}