/*Difficulty : Medium

Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
 */

 class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n1=Integer.MAX_VALUE;
        int n2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]<=n1)
           {
               n1=nums[i];
           }
           else if(nums[i]<n2)
           {
               n2=nums[i];
           }
           else if(nums[i]>n2)
           {
               return true;
           }
        }
        return false;
    }
}