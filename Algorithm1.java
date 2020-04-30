public class Algorithm1 {

    public void getK(int[] arr, int k) {
        if (k > arr.length || k < 0)
            System.out.println("Error, Invalid K.");
        mergeSort(arr, arr.length-1);
        kVal(arr, k);
    }

    public void mergeSort(int[] arr, int LENGTH) {
        int mid = (LENGTH-1)/2;
        if(LENGTH < 2)
            return;

        int[] lArr = divideLeft(arr, 0, mid);
        mergeSort(lArr, lArr.length);
        int[] rArr = divideRight(arr, mid, arr.length-1);
        mergeSort(rArr, rArr.length);

        merge(arr, lArr, rArr);
    }

    public int[] divideLeft(int[] source, int left, int mid) {
        int leftEND = mid - left + 1;
        int[] destination = new int[leftEND];
        for(int i=0; i<leftEND; i++) {
            destination[i] = source[i];
        }
        return destination;
    }

    public int[] divideRight(int[] source, int mid, int right) {
        int rightSTART = (source.length-1)/2 + 1; // starting index to start copying
        int[] destination = new int[source.length - mid - 1];
        int k = 0;
        if(rightSTART == 1) {
            destination[k] = source[rightSTART];
            return destination;
        } else {
            for(int i=rightSTART; i<source.length; i++)
                destination[k++] = source[i];
        }
        return destination;
    }

    public int[] merge(int[] destination, int[] lArr, int[] rArr) {
        // let i denote index managing left array
        // let j denote index managing right array
        // let k denote index managing destination array
        int i=0, j=0, k=0;
        int lSIZE = lArr.length;
        int rSIZE = rArr.length;
        // determine which value is smaller, place into destination array
        while(i < lSIZE && j < rSIZE) {
            if(lArr[i] < rArr[j])
                destination[k++]=lArr[i++];
            else
                destination[k++]=rArr[j++];
        }
//         place remaining values
        while(i < lSIZE)
            destination[k++]=lArr[i++];
        while(j < rSIZE)
            destination[k++]=rArr[j++];
        return destination;
    }

    public void kVal(int[] arr, int k) {
        int s = arr[k];
    }

    public void printArr(int[] arr) {
    //    System.out.println();
        for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
    }
}
