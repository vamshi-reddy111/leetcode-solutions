class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i) -'a']++;
        }
        int maxv=0;
        int maxc=0;
        for(int i=0;i<freq.length;i++){
            char c =(char)(i +'a');
            if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ) {
               maxv= Math.max(freq[i],maxv);
            }
            else{
                maxc= Math.max(freq[i],maxc);
            }
        }
        return maxc+maxv;
    }
}
