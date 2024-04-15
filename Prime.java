public class Prime {
    public static void main(String[] args) {
        int num = 17;
        int count = 0;
        // 1 to 13 divide by all
        // loop 1 to 13
    //     for(int val = 1; val<=num; val++){
    //         if(num%val==0){
    //             count++; // Count Fully divide
    //         }
    // }
//     for(int val = 2; val<num; val++){
//         if(num%val==0){
//             System.out.println("Not a Prime Number");
//             return ;
//            // count++; // Count Fully divide
//         }
// }
// System.out.println("Prime Number");
   // System.out.println(count==2?"Prime ":"Not Prime");
    // for(int i =2 ; i<Math.sqrt(num); i++){
        for(int i =2 ; i*i<num; i++){
        if(num % i ==0){
            System.out.println("Not Prime...");
            return; // exit from the function
        }
    }
    System.out.println("Prime Number");
    }
}
