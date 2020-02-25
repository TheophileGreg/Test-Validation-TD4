import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalimdromeTrue(){
        assertEquals(true, Palindrome.isPalindrome("kayak"));
    }
    @Test
    void testIsPalimdromeTrue2(){
        assertEquals(true, Palindrome.isPalindrome("simonnomis"));
    }

    @Test
    void testIsPalimdromeFalse(){
        assertEquals(false, Palindrome.isPalindrome("ok"));
    }

    @Test
    void calculPalindrome1(){
        assertEquals(2, Palindrome.calculPalindrome("kayak simon ok oko"));
    }

    @Test
    void calculPalindrome2(){
        assertEquals(5, Palindrome.calculPalindrome("radar kayak elle coloc saas"));
    }


}