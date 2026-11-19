package org.example.Array;

public class FindMinAndMax {
    public static int[] minAndMax(int[] nums){

        int[] ans = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){

            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }

    static void main() {

        int[] nums={33,56,77,89,23,0};

       int[] ans = minAndMax(nums);
        System.out.println("Minimum Element : "+ans[0]);
        System.out.println("Maximum Element :"+ans[1]);


    }
}
