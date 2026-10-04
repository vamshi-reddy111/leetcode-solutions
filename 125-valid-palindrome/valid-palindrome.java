class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        return check(s,0,s.length()-1);
    }
    public boolean check(String s,int l,int r){
            if(l >=r ){
                return true;
            }
            if(s.charAt(l) != s.charAt(r)){
                return false;
        }
        return check(s,l+1,r-1);
    }
}