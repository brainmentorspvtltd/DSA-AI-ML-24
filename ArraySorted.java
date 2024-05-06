public class ArraySorted {
    static boolean isSorted(int arr[] , int index){
        // Base Case
        if(index == arr.length-1){
            return true; // Sorted
        }
        if(arr[index]>arr[index+1]){
            return false; // Not Sorted
        }
        // Small Problem
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,130,40,50};
        System.out.println(isSorted(arr, 0)?"Sorted":"Not Sorted");
        
    }
}
