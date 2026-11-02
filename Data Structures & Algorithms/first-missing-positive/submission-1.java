class Solution {
    public int firstMissingPositive(int[] nums) {
        // int missing = 1;
        // Arrays.sort(nums);
        // for (int num : nums) {
        //     if (num == missing) {
        //         missing++;
        //     }
        // }
        // return missing;

        // optimal using HashSet
        HashSet<Integer> set = new HashSet<>();
        int missing = 1;
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(missing)) {
            missing++;
        }
        return missing;
    }
}