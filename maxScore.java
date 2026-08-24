class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int max_score=sum;
        for(int i=0;i<k;i++){
            sum=sum-cardPoints[k-1-i];
            sum=sum+cardPoints[n-1-i ];
            max_score=Math.max(max_score,sum);
        }
        return max_score;
    }
}
