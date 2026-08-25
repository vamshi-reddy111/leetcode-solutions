class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      int n=arr.length;
      HashMap<Integer,Integer> hs=new HashMap<>();
      for(int i=0;i<n;i++){
        hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
      } 
      HashSet<Integer> hv=new HashSet<>();
      for(int p:hs.values()){

        if(!hv.contains(p)){
            hv.add(p);
        
        }
        else{
            return false;
        }
      }
      return true;
    }
}
