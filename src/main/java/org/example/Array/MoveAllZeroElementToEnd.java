package org.example.Array;

public class MoveAllZeroElementToEnd {
    public static void moveZero(int[] nums){

        int[] temp = new int[nums.length];

        int j=0;
        for(int i=0; i<nums.length; i++){

            if(nums[i] != 0){
                temp[j] = nums[i];
                j++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = temp[i];
        }
    }
    static void main() {
        int[] arr = {1,3,0,5,0,6,0,4,0,3};

        moveZero(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
