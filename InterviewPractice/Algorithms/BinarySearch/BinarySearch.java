import javax.swing.SortingFocusTraversalPolicy;

class BinarySearch {
    public static int binSearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start < end) {
            mid = (end + start) / 2;
            if (arr[mid] == val)
                return mid;
            if (arr[mid] < val)
                start = mid + 1;
            if (arr[mid] > val)
                end = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binSearch(arr, 9));
    }
}