public class MergeSort{
    //nlogn
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // Create a temporary array to hold the merged elements
        int idx1 = si; // Starting index for the left subarray
        int idx2 = mid + 1; // Starting index for the right subarray
        int x = 0; // Index for the merged array
        // O(n)
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++]; // Add smaller element to merged array
            } else {
                merged[x++] = arr[idx2++]; // Add smaller element to merged array
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++]; // Copy remaining elements from left subarray
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++]; // Copy remaining elements from right subarray
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i]; // Copy sorted elements back to original array
        }
    }
    public static void divide(int arr[],int si, int ei){//si is starting index and ei is ending index
        if (si >= ei) {
            return; // Base case: if the subarray has one or no elements, it's already sorted
        }
        int mid = (si + ei) / 2;
        divide (arr,si,mid);
        divide( arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 }; // Example array to be sorted
        int n = arr.length; // Length of the array
        divide(arr, 0, n - 1); // Call the divide function to sort the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the sorted array
        }
        System.out.println(); // Print a new line for better readability
    }
} 
