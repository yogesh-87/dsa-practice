package org.example.Array;

public class cyclicallyRotate {
    public static void rotate(int[] nums){
        int last = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = last;
    }
    static void main() {
        int[] nums={33,56,77,89,23,0};
        System.out.println("Original Array");
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("after Rotating the Array");
        rotate(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
