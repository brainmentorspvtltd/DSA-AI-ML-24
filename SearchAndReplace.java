public class SearchAndReplace {
    static String searchAndReplace(String str, char search
    , char replace){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        String result = searchAndReplace
        (str.substring(1), search, replace);
        if(str.charAt(0) == search){
            return replace + result;
        }
        else{
            return str.charAt(0)+ result;
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        char search = 'l';
        char replace = 'x';
        System.out.println(searchAndReplace
        (str, search, replace));
    }
}
