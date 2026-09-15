import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int k=Math.abs(arr[i]-arr[i-1]);
            if(k<min){
                min=k;   
            }
        }
        for(int i=1;i<arr.length;i++){
            int k=Math.abs(arr[i]-arr[i-1]);
            if(k == min){
                ArrayList<Integer> lst=new ArrayList<>();
                lst.add(arr[i-1]);
                lst.add(arr[i]);
                 ls.add(lst);
            }
           
        }

       return ls; 
        
    }
}