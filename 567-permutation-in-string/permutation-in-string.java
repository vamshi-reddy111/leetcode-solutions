class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) {
            return false;
        }

        for (int i = 0; i <= n2 - n1; i++) {

            String sub = s2.substring(i, i + n1);

            if (check(s1, sub)) {
                return true;
            }
        }

        return false;
    }

    public boolean check(String s1, String sub) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[sub.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}