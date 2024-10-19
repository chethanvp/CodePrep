// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work
import java.util.*;
public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        // selectionSortWithMin(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // mergeSortInPlace(arr, 0, arr.length-1);
        // mergeSortExtraSpace(arr, 0, arr.length-1);
        // bubbleSortRecursive(arr, arr.length-1, 0);
        // insertionSortRecursive(arr, 0);
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid = start + (end-start)/2;
        int i=start;
        int j=end;
        int pivot = arr[mid];
        while(i < j) {
            while(arr[i] <= pivot) {
                i++;
            }

            while(arr[j] > pivot) {
                j--;
            }

            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        quickSort(arr, start, mid-1);
        quickSort(arr, mid+1, end);
    } 

    private static void insertionSortRecursive(int[] arr, int n) {
        if(n == arr.length) return;
        int i=n;
        while(i > 0 && arr[i-1] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }
        insertionSortRecursive(arr, n+1);
        
    }
    
    private static void bubbleSortRecursive(int[] arr, int r, int c) {
        System.out.println(Arrays.toString(arr));
        if(r == 0) return;
        if(c < r) {
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSortRecursive(arr, r, c+1);
        }
        else
            bubbleSortRecursive(arr, r-1,0);
    }

    private static void mergeSortExtraSpace(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid = start + (end-start)/2;
        mergeSortExtraSpace(arr, start, mid);
        mergeSortExtraSpace(arr, mid+1, end);

        mergeExtraSpace(arr, start, mid, end);
    }

    private static void mergeExtraSpace(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int k=0;
        int[] temp = new int[end-start+1];

        while(i <= mid && j<=end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<=end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        k=0;
        System.out.println(start + " , " + mid +  " , " + end + " , temp : " + Arrays.toString(temp));
        for(int m = start; m<=end; m++) {
            System.out.println("m : " + m + " , "  + start + " , " + end);
            arr[m] = temp[k++];
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid = start + (end-start)/2;
        // System.out.println(start + " , " + mid +  " , " + end);
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid+1, end);

        mergeInPlace(arr, start, mid, end);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int i=start;
        int j=mid+1;
        System.out.println(Arrays.toString(arr));
        while(i <= mid && j <=end) {
            // System.out.println(start + " , " + mid +  " , " + end);
            if(arr[i] > arr[j]) {
                int temp = arr[j];
                for(int k = j; k>i; k--) {
                    arr[k] = arr[k-1]; 
                }
                arr[i] = temp;
                // System.out.println("shift : " + Arrays.toString(arr));
                i++;
                mid++;
            }
            else {
                j++;
            }
        }
        
    }

    private static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1]  = temp;
                }
            }
        }
    }
    
    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j < arr.length-1-i; j++) {

                if(arr[j] > arr[j+1]) {
                System.out.println(Arrays.toString(arr));
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1]  = temp;
                }
            }
        }
    }
    
    private static void selectionSortWithMin(int[] arr) {

        for(int i=0; i<arr.length; i++) {
        System.out.println(Arrays.toString(arr));

            int minIndex = findMinIndex(arr, i);
            System.out.println(minIndex + " , " + arr[minIndex]);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
    }
        
    private static void selectionSortWithMax(int[] arr) {

        for(int i=0; i<arr.length; i++) {
        System.out.println(Arrays.toString(arr));

            int maxIndex = findMaxIndex(arr, arr.length-1-i);
            System.out.println(maxIndex + " , " + arr[maxIndex]);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            
        }
    }

    private static int findMinIndex(int[] arr, int start) {
        int minIndex = start;
        for(int i=start; i<arr.length; i++) {
            if(arr[i] < arr[minIndex]) minIndex = i;
        }

        return minIndex;
    }
    
    private static int findMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for(int i=0; i<=end; i++) {
            if(arr[i] > arr[maxIndex]) maxIndex = i;
        }

        return maxIndex;
    }
}
