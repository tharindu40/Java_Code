public class SelectionSort {
    static void sSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        sSort(arr);
        System.out.println("Sorted array: ");
        int n=arr.length;
        printArray(arr,n);
    }
    
}
