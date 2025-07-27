public class QuickSort{
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than or equal to pivot
                i++; // Increment index of smaller element
                int temp = arr[i]; // Swap elements
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; // Increment index of smaller element
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }
    public static void quicksort(int arr[], int low, int high){
        if (low < high) {
            int pidx = partition(arr, low, high); // Partition the array and get the pivot index

            quicksort(arr, low, pidx -1);
            quicksort(arr, pidx + 1, high); // Recursively sort the left and right subarrays
        }
    }
    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 5, 2, 8 }; // Example array to be sorted
        int n = arr.length; // Length of the array

        quicksort(arr, 0, n - 1); // Call the quicksort function to sort the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the sorted array
        }
        System.out.println(); // Print a new line for better readability
    }
} 
