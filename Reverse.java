public class Reverse {

    static String reverse(String str){
        // Base Case 
        if(str.length()==0){
            return "";
        }
        // Small Problem
        String smallString = str.substring(1);
        String result = reverse(smallString);
        return result + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("amit"));
        
    }
}
