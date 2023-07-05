package leetocodeAndgfg;

public class mergesort
{


        private static void sort(int[] arr, int start, int end) {
            if (start<end) {
                int mid = (start + end) / 2;
                sort(arr, start, mid);
                sort(arr, mid + 1, end);
                  merge(arr, start, mid, end);
            }
        }

        private static void merge(int[] arr, int start, int mid, int end) {
            int[] temp = new int[end - start +1];
            int i = start, j = mid + 1, k = 0;
            while (i <= mid && j <= end) {
                if (arr[i] < arr[j]) {
                    temp[k]= arr[i];
                    i++;
                    k++;
                } else {
                    temp[k++] = arr[j++];
                }
            }
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
            while (j <= end) {
                temp[k++] = arr[j++];
            }
            for (i = start; i <= end; i++) {
                arr[i] = temp[i - start];
            }

        }

        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 4, 1, 6, 9};
            sort(arr,0,arr.length-1);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

//public class QuickSort {
//
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partition(arr, low, high);
//            quickSort(arr, low, pivotIndex - 1);
//            quickSort(arr, pivotIndex + 1, high);
//        }
//    }
//
//    public static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//        return i + 1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 9, 1, 5, 6};
//        quickSort(arr, 0, arr.length - 1);
//      //  System.out.println(Arrays.toString(arr)); // [1, 2, 5, 5, 6, 9]
//    }
//}

