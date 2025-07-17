public class Insertion_Sorting{
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5, 2, 8, 1, 3};

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
                
     }
     printarray(arr);
    }
}
       
        
    
