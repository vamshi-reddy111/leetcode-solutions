class Solution {
    public int largestAltitude(int[] gain) {
        int s=0;
        int max=0;
        int[] pr=new int[gain.length+1];
        pr[0]=0;
        for(int i=1;i<gain.length+1;i++){
            s+=gain[i-1];
            pr[i]=s;
        }
        Arrays.sort(pr);
        return pr[gain.length];
    }
}