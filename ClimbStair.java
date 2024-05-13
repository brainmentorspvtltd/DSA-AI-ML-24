public class ClimbStair {
    static int climbStairs(int num){
        // Base Case
        if(num<=1){
            return 1;
        }
        // Small Problem 
        int oneStep = climbStairs(num-1);
        int twoStep = climbStairs(num-2);
        return oneStep + twoStep;
    } 
    public static void main(String[] args) {
        int r = climbStairs(3);
        System.out.println(r);
    }
}
