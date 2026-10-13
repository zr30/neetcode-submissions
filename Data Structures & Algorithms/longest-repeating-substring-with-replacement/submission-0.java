class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        int left = 0;
        int longest = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add letter to HashMap
            char letter = s.charAt(right);

            charCount.put(
                letter,
                charCount.getOrDefault(letter, 0) + 1
            );

            // Keep track of max frequency
            int letterCount = charCount.get(letter);
            maxFreq = Math.max(maxFreq, letterCount);

            // Shrink window
            while ((right - left + 1) - maxFreq > k) {
                char leftLetter = s.charAt(left);

                charCount.put(
                    leftLetter,
                    charCount.get(leftLetter) - 1
                );

                left++;
            }

            // Update longest
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}