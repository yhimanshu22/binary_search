public class Upperbound {
    public static int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Move the left pointer if mid is less than or equal to target
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // This will be the index of the first element greater than target
    }

    public static void main(String[] args) {
        // Example usage of upperBound method
        int[] nums = { 1, 2, 4, 5, 6 };
        int target = 4;
        int result = upperBound(nums, target);
        System.out.println("Upper bound index: " + result);
    }
}
