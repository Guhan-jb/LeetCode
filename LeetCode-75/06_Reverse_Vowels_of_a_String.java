/*
 * MEDIUM diificulty
 * 
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
 */


 class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");//trim is used to remove leading and trailing spaces and the \\s+ is an escape sequence to denote spaces
        String str2="";
        for(int i=str.length-1;i>0;i--)
        {
           str2+=str[i]+" ";
        }
        return str2+str[0];
    }
}