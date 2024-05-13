public class MultiBranch {

    static void fun(int n){
        if(n<=0){
            return ;
        }
        System.out.println("Stack Build "+n);
        fun(n-1);
        System.out.println("n-1 Stack In Between "+n);
        fun(n-2);
        System.out.println("n-2 Stack Fall "+n);
        fun(n-3);
        System.out.println("n-3 Fall "+n );
    }
   public static void main(String[] args) {
        fun(5);
   } 
}
