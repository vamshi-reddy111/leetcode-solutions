class Solution {
    public int maximum69Number (int num) {
       
        String s=String.valueOf(num);
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '6'){
                s=s.substring(0,i)+"9"+s.substring(i+1,n);
                break;
            }
        }
        return Integer.valueOf(s);
    }
}