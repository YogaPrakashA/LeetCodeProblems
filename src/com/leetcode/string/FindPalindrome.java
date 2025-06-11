package com.leetcode.string;

public class FindPalindrome {
//     find palindrome if extra character occured above one that is not palindrome
        /*input = madam   output = true
         input = madham  output = true
         input = madhiam output  = false
*/
    public static void main(String[] args) {
            String input = "madam";
            System.out.println(findPalindrome(input));
    }


    private static boolean findPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        boolean response = false;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    if(response)
                        return false;

                    if(s.charAt(left) == s.charAt(right-1))
                            right--;
                    else
                        left++;

                    response = true;

                }else{
                    right--;
                    left++;
                }
            }

            return true;


    }
}
