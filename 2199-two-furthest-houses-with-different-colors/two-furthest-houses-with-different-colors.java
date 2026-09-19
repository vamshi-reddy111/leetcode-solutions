class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(colors[j] >colors[i] && Math.abs(i-j)>k){
                    k=Math.abs(i-j);
                }
            }
        }
        return k;
    }
}