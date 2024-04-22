public class CountEvenOdd {

    static int[] countEvenOdd(int n){
        // Base Case
        if(n==0){
            int result [] = new int[2];
            return result;
        }
        int r [] =countEvenOdd(n-1);
        if(n%2==0){
            r[0]++;
        }
        else{
            r[1]++;
        }
        return r;
    }

    static void countEvenOdd(int n,int result[]){
       // Base Case
       if(n==0){
        System.out.println("Even Count "+result[0]);
        System.out.println("Odd Count "+result[1]);
        return ;
       }
       if(n%2==0){
        result[0]++;
       }
       else {
        result[1]++;
       }
        // Small Problem + Put in Recursion
        countEvenOdd(n-1, result);
    }
    public static void main(String[] args) {
        // result[0] = evenCount
        // result[1] = oddCount
        // int result [] = new int[2];
        // countEvenOdd(25, result);

        int r[] = countEvenOdd(25);
        System.out.println(r[0]+" "+r[1]);
        // result[0] = 0 , result[1] = 0
    }
}
