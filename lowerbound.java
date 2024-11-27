public class Lowerbound {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = lowerBound(array, target);
        System.out.println("Lower bound of " + target + " is " + result);
    }

    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}