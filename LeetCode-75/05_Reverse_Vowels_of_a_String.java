/*
 * Difficulty : Easy
 * 
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 */



 class Solution {
    public String reverseVowels(String s) {
        String vowel="aeiouAEIOU";
        char [] ch=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            while(i<j && vowel.indexOf(ch[i])==-1)
            {
                i++;
            }
            while(i<j &&  vowel.indexOf(ch[j])==-1)
            {
                j--;
            }
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
        String out=new String(ch);
        return out;
    }
}