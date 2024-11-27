public class bs {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Example usage of binary search
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(sortedArray, target);
        System.out.println("Index of " + target + ": " + result);
    }

    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid; // Target found
            }

            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
    