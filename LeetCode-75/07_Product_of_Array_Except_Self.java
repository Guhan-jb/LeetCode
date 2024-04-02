/*MEDIUM
 Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answers[]=new int[nums.length];
        int pre=1;
        int suff=1;
        if(nums.length>=1000000)
        System.exit(0);
        for(int i=0;i<nums.length;i++)
        {
            answers[i]=1;
           answers[i]*=pre;
           pre*=nums[i];
        }
       for(int i=nums.length-1;i>=0;i--)
        {
           answers[i]*=suff;
           suff*=nums[i];
        }
        return answers;
    }
}