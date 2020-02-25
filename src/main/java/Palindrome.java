public class Palindrome {

    public static int calculPalindrome(String phrase ){
        String[] tableauMots;
        int res = 0;
        tableauMots = phrase.split(" ");
        for (String mots : tableauMots) {
            if(isPalindrome(mots)){
                res += 1;
            }
        }
        return res;
    }

    public static boolean isPalindrome(String m){
        return true;
    }
}
