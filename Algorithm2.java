public class Algorithm2 {
    public void getK(int[] arr, int k) {
        int kVal = quickSelect(arr, 0, arr.length-1, k);
    }

    public int quickSelect(int[] arr, int low, int high, int k) {
        if(low==high) {
            return arr[low];
        }
        int pivotIndex = partition(arr, low, high);
        if (pivotIndex == k)            // found it
            return arr[pivotIndex];
        else if (pivotIndex > k)        // too high, look low
            return quickSelect(arr, low, pivotIndex-1, k);
        else
            return quickSelect(arr, pivotIndex+1, high-1, k);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotVal = arr[high], pivotIndex = low;
        swap(arr, pivotIndex, high); // move pivot to end
        for(int i = low; i <= high; i++) {
            if(arr[i] < pivotVal) {
                swap(arr, pivotIndex, i);
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
