class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ls=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            ls.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(ls.contains(nums2[j])){
                ls2.add(nums2[j]);
                ls.remove(Integer.valueOf(nums2[j]));

            }
        }
        int[] arr = new int[ls2.size()];

        for (int i = 0; i < ls2.size(); i++) {
            arr[i] = ls2.get(i);
        }

        return arr;

    }
}