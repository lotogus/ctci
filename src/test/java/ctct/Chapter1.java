package ctct;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/*



1.4	 Write a method to decide if two strings are anagrams or not.
1.5	 Write a method to replace all spaces in a string with ‘%20’.
1.6	 Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
1.7	 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column is set to 0.
1.8	 Assume you have a method isSubstring which checks if one word is a substring of
another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”)
 */
public class Chapter1 {

    /*
    1.1	 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
     */
    public static class Point11 {

        public boolean hasUnique(String string) {
            final char[] chars = string.toCharArray();
            final Set<String> charSet = new HashSet<>();
            for (char aChar : chars) {
                String v = String.valueOf(aChar);
                if (!charSet.contains(v)) {
                    charSet.add(v);
                } else {
                    return false;
                }
            }
            return true;
        }
        @Test
        public void test1() {
            assert hasUnique("abcdefg");
            assert !hasUnique("abcdefe");
            assert hasUnique("a");
            assert hasUnique("");
            assert !hasUnique("aa");
        }

        public boolean hasUniqueNoAdditionalStruct(String string) {
            final char[] chars = string.toCharArray();
            for(int i=0; i < chars.length;i++) {
                for(int j=i+1; j < chars.length;j++) {
                    if(chars[i]==chars[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        @Test
        public void test2() {
            assert hasUnique("abcdefg");
            assert !hasUnique("abcdefe");
            assert hasUnique("a");
            assert hasUnique("");
            assert !hasUnique("aa");
        }
    }

    /*
    1.2	 Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
    five characters, including the null character.)
    */
    public static class Point12 {
        public String reverse(String string) {
            final char[] chars = string.toCharArray();
            char[] charsResult = new char[chars.length];
            for(int i=0;i<chars.length;i++) {
                charsResult[chars.length-i-1] = chars[i];
            }
            return new String(charsResult);
        }
        @Test
        public void test2() {
            assertThat(reverse("qwerty")).isEqualTo("ytrewq");
            assertThat(reverse("a")).isEqualTo("a");
            assertThat(reverse("")).isEqualTo("");
        }
    }

    /*
    1.3	 Design an algorithm and write code to remove the duplicate characters in a string
            without using any additional buffer. NOTE: One or two additional variables are fine.
            An extra copy of the array is not. FOLLOW UP Write the test cases for this method.
     */
    public static class Point13 {

    }
}
