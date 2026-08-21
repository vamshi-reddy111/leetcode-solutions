class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();
        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> ls =
                new ArrayList<>(h.entrySet());

        ls.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue();
            }
            return b.getKey() - a.getKey();
        });

        int[] ans = new int[nums.length];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : ls) {

            int num = entry.getKey();
            int freq = entry.getValue();

            for (int j = 0; j < freq; j++) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}
