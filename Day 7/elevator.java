class Solution {
    public int elevatorRequests(int n, int[] requests) {
        
        int c=requests[0];
        for(int i=1;i<requests.length;i++){
             c += Math.abs(requests[i] - requests[i - 1]);

        }
        return c;
    }
}