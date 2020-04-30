import java.util.Arrays;


public class Algorithm4 {
    public void getK(int[] arr, int k) {
        runMM(arr, 0, arr.length-1, k);
    }

    private int runMM(int[] arr, int low, int high, int k) {
        if (k > 0 && k <= high - low + 1) {
            // number of elements in array
            int n = high - low + 1;
            int i;
            int[] median = new int[(n + 4) / 5];

            for (i = 0; i < median.length - 1; i++)
                median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + 4), 5);

            if (n % 5 == 0)
                median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + 4), 5);
            else
                median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + (n % 5)), n % 5);
            i++;

            int medOfMed = i == 1 ? median[i - 1] : runMM(median, 0, i - 1, i / 2);
            int partition = partition(arr, low, high, medOfMed);
            if (partition - low == k - 1)
                return arr[partition];
            if (partition - low > k - 1)
                return runMM(arr, low, partition - 1, k);
            return runMM(arr, partition + 1, high, k - (partition + 1) + low);
        }
        return -1;
    }

    private int getMedian(int arr[], int n) {
        Arrays.sort(arr);
        return arr[n / 2];
    }

    private int partition(int[] arr, int low, int high, int pivot) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pivot) {
                swap(arr, i, high);
                break;
            }
        }
        int index = low - 1;
        int i = low;
        while (i < high) {
            if (arr[i] < pivot) {
                index++;
                swap(arr, i, index);
            }
            i++;
        }
        index++;
        swap(arr, index, high);
        return index;
    }

    private void swap(int[] arr, int a, int b) {
        if (arr[a] == arr[b]) {
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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
