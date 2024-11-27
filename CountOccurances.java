public class CountOccurances {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 9 };
        int target = 8;
        int result = countOccurances(arr, target);
        System.out.println("Count of " + target + " is " + result);
    }

    public static int countOccurances(int[] arr, int target) {
        int first = Lowerbound.lowerBound(arr, target);
        int last = Upperbound.upperBound(arr, target);
        return last - first;
    }
}