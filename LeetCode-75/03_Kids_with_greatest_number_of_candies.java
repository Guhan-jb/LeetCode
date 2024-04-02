/* EASY
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */


 //Solution:



 /*
This question explains that the ith kid with the candies with the extra candies you provide is the kid with the greatest number of candies but the kid with the greatest number of candies without the extracandies you provide is the kid with the greatest number of candies. So having this in your mind if the ith kid has more candies than the kid with most number candies in the actual array then that ith kid will be a kid with greatest number of candies, that's why there are multiple kids with gnc
*/
 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> bool=new ArrayList<>();
      int max=0;
      for(int i=0;i<candies.length;i++)
      {
          if(max<candies[i])
          {
              max=candies[i];
          }
      }
      //System.out.print(max);
      for(int i=0;i<candies.length;i++)
      {
          int current=candies[i]+extraCandies;
          if(current>=max)
          {
              bool.add(true);
          }
          else
          {  
            bool.add(false);
          }
      }
      return bool;  
    }
}