class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String k=s.substring(i,j+1);
                if(check(k,0,k.length()-1)){
                    c++;
                }
            }
        }
        return c;
    }
     public boolean check(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}