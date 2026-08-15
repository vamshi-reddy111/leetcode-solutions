import java.util.*;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int n =arr.length;
         int l=0;

         int s=0;
         int temp=0;

         for(int r=0;r<n;r++){
            temp+=arr[r];
            if(r-l+1>k){
                temp-=arr[l];
                l++;
            }
            if(r-l+1 == k && temp/k >= threshold){
                s++;
            }


         }
         return s;
    }
}  