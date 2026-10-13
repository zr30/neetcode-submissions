class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);

        //sort second
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        String sorted2= new String(char2);

        return sorted1.equals(sorted2);


    }
}
