package ProblemSolving;



class Solution {
    static int twoSum(int[] nums, int target) {
        int numbers = 0;

        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Addition of two number is " + nums[i] +"and "+nums[j] );
                    numbers=nums[i]+nums[j];
                }
            }
        }
        return numbers;
    }
    public static void main(String[]args){
        int nums[]= new int[]{2,7,11,15,5,4,3,2};
        int target = 9;

        System.out.println(Solution.twoSum(nums,target));
    }
}