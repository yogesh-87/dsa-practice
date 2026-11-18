package org.example.Array;

public class ReverseTheArray {

      public static void reverse(int[] nums){

          int i=0, j = nums.length-1;

          while(i<j){
              int temp = nums[i];
              nums[i] = nums[j];
              nums[j] = temp;
              i++;
              j--;
          }
      }
    static void main() {

        int[] nums = {1,3,4,6,7,8,9,23,45};

        for(int i : nums){
            System.out.print(i + " ");
        }

        System.out.println();

        reverse(nums);
        System.out.println("After Reverse ----------");

       for(int i : nums){
           System.out.print(i + " ");
       }

    }
}
