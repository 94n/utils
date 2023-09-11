package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

    private static int c = 0;

    private static int[] arr;

    void mergeIt(int arr[], int left, int middle, int right) {
        int low = middle - left + 1;                    //size of the left subarray
        int high = right - middle;                      //size of the right subarray

        int L[] = new int[low];                             //create the left and right subarray
        int R[] = new int[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++)                               //copy elements into left subarray
        {
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++)                              //copy elements into right subarray
        {
            R[j] = arr[middle + 1 + j];
        }


        int k = left;                                           //get starting index for sort
        i = 0;                                             //reset loop variables before performing merge
        j = 0;

        c++;
        while (i < low && j < high)                     //merge the left and right subarrays
        {
            c++;
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //c++;
        while (i < low)                             //merge the remaining elements from the left subarray
        {
            //c++;
            arr[k] = L[i];
            i++;
            k++;
        }
//c++;
        while (j < high)                           //merge the remaining elements from right subarray
        {
            //c++;
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    void mergeSort(int arr[], int left, int right)       //helper function that creates the sub cases for sorting
    {
        int middle;
        if (left < right) {                             //sort only if the left index is lesser than the right index (meaning that sorting is done)
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);                    //left subarray
            mergeSort(arr, middle + 1, right);               //right subarray

            mergeIt(arr, left, middle, right);                //merge the two subarrays
        }
    }

    void display(int arr[])                 //display the array
    {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void heapSort(int arr[]) {
        int temp;

        for (int i = arr.length / 2 - 1; i >= 0; i--)                //build the heap
        {
            heapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--)                            //extract elements from the heap
        {
            temp = arr[0];                                                  //move current root to end (since it is the largest)
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);                                             //recall heapify to rebuild heap for the remaining elements
        }
    }

    void heapify(int arr[], int n, int i) {
        int MAX = i; // Initialize largest as root
        int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
        int right = 2 * i + 2; //index of the right child of ith node  = 2*i + 2
        int temp;
        c++;
        if (left < n && arr[left] > arr[MAX])            //check if the left child of the root is larger than the root
        {
            MAX = left;
        }
        c++;
        if (right < n && arr[right] > arr[MAX])            //check if the right child of the root is larger than the root
        {
            MAX = right;
        }

        if (MAX != i) {                                               //repeat the procedure for finding the largest element in the heap
            temp = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = temp;
            heapify(arr, n, MAX);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static void insertionSort(int arr[], int n) {
        if (n <= 1)                             //passes are done
        {
            return;
        }
        insertionSort(arr, n - 1);        //one element sorted, sort the remaining array
        int last = arr[n - 1];                        //last element of the array
        int j = n - 2;                                //correct index of last element of the array
        //c++;
        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        {
            c++;
            arr[j + 1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j + 1] = last;                            //set the last element at its correct index
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    void selectionSort(int arr[]) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                c++;
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static void bubbleSort(int arr[], int n) {
        if (n == 1)                     //passes are done
        {
            return;
        }

        for (int i = 0; i < n - 1; i++)       //iteration through unsorted elements
        {
            c++;
            if (arr[i] > arr[i + 1])      //check if the elements are in order
            {                           //if not, swap them
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);           //one pass done, proceed to the next
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            c++;
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) {
        /*List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i< 100; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for(int i = 0; i< 100; i++) {
            System.out.print(numbers.get(i) + ",");
        }*/
        initArray();
        Sorting ob = new Sorting();
        c = 0;
        ob.mergeSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("mergeSort Comparisons:" + c);

        ob.display(arr);
        c = 0;
        initArray();
        ob.heapSort(arr);
        System.out.println();
        System.out.println("heapSort Comparisons:" + c);

        ob.display(arr);
        c = 0;
        initArray();
        insertionSort(arr, arr.length);
        System.out.println();
        System.out.println("insertionSort Comparisons:" + c);

        ob.display(arr);
        c = 0;
        initArray();
        ob.selectionSort(arr);
        System.out.println();
        System.out.println("selectionSort Comparisons:" + c);

        ob.display(arr);
        c = 0;
        initArray();
        bubbleSort(arr, arr.length);
        System.out.println();
        System.out.println("bubbleSort Comparisons:" + c);

        ob.display(arr);
        c = 0;
        initArray();
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("quickSort Comparisons:" + c);
        ob.display(arr);
    }

    private static void initArray() {
        arr = new int[]{52, 10, 19, 16, 6, 8, 70, 67, 4, 11, 83, 33, 0, 48, 7, 89, 12, 57, 55, 21, 3, 17, 51, 28, 41, 2, 27, 98, 81, 96, 82, 65, 32, 97, 75, 0, 87, 22, 78, 24, 9, 99, 18, 26, 45, 69, 86, 99, 50, 90, 1, 59, 20, 66, 30, 60, 5, 64, 15, 94, 92, 37, 73, 68, 80, 34, 25, 56, 58, 54, 91, 35, 76, 72, 44, 29, 61, 49, 0, 93, 42, 63, 79, 85, 88, 77, 31, 53, 23, 74, 84, 40, 46, 71, 13, 38, 39, 14, 43, 47};
    }

}
