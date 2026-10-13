class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid repeating the same first number.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];

            while (j < k) {
                int sum = nums[j] + nums[k];

                if (sum == target) {
                    output.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Avoid repeating the same triplet.
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < target) {
                    j++; // Need a larger sum.
                } else {
                    k--; // Need a smaller sum.
                }
            }
        }

        return output;
    }
}