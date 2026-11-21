package org.example.Array;

public class rotateArray {
    public static void reverse(int[] nums,int start,int end){

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int n = arr.length;

        System.out.println("Original Array: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println();
        System.out.println("After Rotating By K steps: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
