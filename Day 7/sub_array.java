import java.util.*;
class Main {
    public static void main(String[] args) {
      int arr[]={2,4,5,6,7,9};
      int n=arr.length;
      int sl=2;
      int sum=0;
      for(int i=0;i<n-(sl-1);i++){
        int j=i+sl-1;
        int temp=0;
        for(int k=i;k<=j;k++){
            temp+=arr[k];
        }
        sum=Math.max(sum,temp);
      }  
      System.out.println(sum);
    }
}