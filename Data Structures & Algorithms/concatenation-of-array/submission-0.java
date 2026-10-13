class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans= new int[nums.length*2];
        int start=0;
        int end=nums.length;
        while(start<=nums.length-1){
            ans[start]=nums[start];
            ans[end]=nums[start];
            start++;
            end++;
        }
        return ans; 
    }
}