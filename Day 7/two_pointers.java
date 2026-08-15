import java.util.*;
class Main {
    public static void main(String[] args) {
      int arr[]={2,4,5,6,7,0};
      int n=arr.length;
      int sl=2;
      int sum=0;
      int l=0;
      int temp=0;
      for(int r=0;r<n;r++){
        temp+=arr[r] ;
        if(r-l+1 == sl){
            temp=temp-arr[l];
            l++;
        }
        if(r-l+1 == sl){
            sum=Math.max(sum,temp);
        }
      }
      System.out.println(sum);
      
    }
}