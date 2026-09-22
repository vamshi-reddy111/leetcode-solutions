class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {

        HashSet<String> banned = new HashSet<>();

        for (String word : bannedWords) {
            banned.add(word);
        }

        int count = 0;

        for (String word : message) {
            if (banned.contains(word)) {
                count++;

                if (count >= 2) {
                    return true;
                }
            }
        }

        return false;
    }
}