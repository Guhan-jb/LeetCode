/*EASY
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String out="";
        int n=(word1.length()>word2.length())?word1.length():word2.length();
        for(int i=0;i<n;i++)
        {
            if(word1.length()>i)
            out+=word1.charAt(i);
            if(word2.length()>i)
            out+=word2.charAt(i);
        }
    System.out.print(out);
    return out;
    }
}