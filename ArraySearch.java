public class ArraySearch {

    static boolean isFound(int arr[], int index, int search){
        // 2. Base Case
        if(arr.length == index){
             return false;
        }
        // Element Search
        if(arr[index] == search){
            return true;
        }
        // 1. Small Problem
        return isFound(arr, index + 1, search);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int search= 50;
        System.out.println(isFound(arr, 0, search)
        ?"Found":"Not Found");
        
    }
}
