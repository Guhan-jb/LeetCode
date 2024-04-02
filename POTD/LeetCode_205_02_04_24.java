/*
 205. Isomorphic Strings

Easy

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 * 
 */

 class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()!=t.length())
       return false;
       int S[]=new int[257],T[]=new int[257];// Because there are 256 ASCII values in java and -
       for(int i=0;i<s.length();i++)         //^We will be updating the respecting ASCII vauled index of the array(i.e for the char a we will update index 97).
       {
        if(S[s.charAt(i)]!=T[t.charAt(i)])
        return false;
        S[s.charAt(i)]=i+1;
        T[t.charAt(i)]=i+1;
       } 
       return true;
        
    }
}