public class PrintMyName {
    // 1. Loading 2. Linking 3. Execution
    // static - when class loaded , 
    //static will be loaded in memory
    // Print my name 5 times
   static void show(int n){
    // Base Case or Termination Case
    if(n==0){
        return ; // exit from the function 
        // and jump to the previous call
    }
    // Stack Build
    //show(n-1);
    // Stack Fall
        System.out.println("Amit "+n); // Logic
        show(n-1); // Repeat (Recursion )
        System.out.println("Srivastava "+n);
    }
    public static void main(String[] args) {
        int n = 5;
        show(n);
    }
}
