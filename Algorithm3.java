public class Algorithm3 {
    public void getK(int[] arr, int k) {
        int kVal = quickSelect(arr, 0, arr.length-1, k);
    }

    public int quickSelect(int[] arr, int low, int high, int k) {
        while (low <= high) {
            // first quickSort to get pivot index
            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == k)            // found it
                return arr[pivotIndex];
            else if (pivotIndex > k)        // too high, look low
                high = pivotIndex-1;
            else                            // too low, look high
                low = pivotIndex+1;
        }
        return arr[k-1];
    }

    public int partition(int[] arr, int low, int high) {
        int pivotVal = arr[high], pivotIndex = low;
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivotVal) {
                swap(arr, j, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, high, pivotIndex); // Move pivot to its final place
        return pivotIndex;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i] + " ]\n");
                break;
            }
            if (i == 0) {
                System.out.print("[ " + arr[i] + ", ");
            }
            else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
