class Solution {

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length);
    }

    public int[] mergeSort(int[] nums, int low, int high) {

        if (high - low <= 1) {
            return nums;
        }

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid, high);

        merge(nums, low, mid, high);

        return nums;
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low];

        int i = low;
        int j = mid;
        int k = 0;

        while (i < mid && j < high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i < mid) {
            temp[k++] = nums[i++];
        }

        while (j < high) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}