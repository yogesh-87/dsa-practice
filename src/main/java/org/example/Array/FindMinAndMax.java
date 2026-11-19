package org.example.Array;

public class FindMinAndMax {
    public static int minimum(int[] nums){

        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){

            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static int maximum(int[] nums){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){

            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    static void main() {

        int[] nums={33,56,77,89,23,0};

        System.out.println("Minimum element : " +minimum(nums));
        System.out.println("Maximum element : " +maximum(nums));


    }
}
