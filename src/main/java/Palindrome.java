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
        int i1 = 0;
        int i2 = m.length()-1;
        while (i1 < i2){
            if(m.charAt(i1) != m.charAt(i2)){
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }
}
