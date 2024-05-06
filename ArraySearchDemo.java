public class ArraySearchDemo {

    static int[] helper(int arr[], int index, int searchElement, int count){
        // Base Case
        if(index == arr.length){
            int result [] = new int[count];
            return result;
        }
        // Element Exist
        if(arr[index] == searchElement){
            count = count + 1;
        }
        // Small Problem
        int result[] = helper(arr, index + 1, searchElement, count);
        if(arr[index] == searchElement){
            result[count-1] = index;
        }
        return result;
    }
    static int[] search(int arr[], int index, int searchElement){
        return helper(arr, index, searchElement, 0);
    }

    public static void main(String[] args) {
       int arr[] = {10,20,50,30,40,50,100,50}; 
       int searchElement=50; 
       int result[]  = search(arr, 0, searchElement);
       for(int r :result){
        System.out.println(r);
       }
    }
}
