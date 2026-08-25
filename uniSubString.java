class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int maxl=0;
        HashSet<Character> hs=new HashSet<>();
        for(int j=i;j<n;j++){
            char c=s.charAt(j);
            while(hs.contains(c)){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(c);
            maxl=Math.max(maxl,j-i+1);

        }
        return maxl;
    }
}
