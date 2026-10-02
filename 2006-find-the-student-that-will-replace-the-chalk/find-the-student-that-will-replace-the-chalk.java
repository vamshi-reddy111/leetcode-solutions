class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        long s=0;
        for(int x : chalk){
            s+=x;
        }
        k%=s;
        for(int i=0;i<n;i++){
            if(k<chalk[i]){
                return i;
            }
            k-=chalk[i];
        }
        return 0;
    }
}