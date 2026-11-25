package org.example.Array;

public class MergeTwoSortedArray {
    public static void mergeArray(int[] nums1,int n,int m,int[] nums2){
        int i = n-1;
        int j = m-1;
        int k = n+m -1;

        while(i >= 0 && j >= 0){

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }else{
                nums1[k] = nums1[i];
                i--;
                j--;
            }
            k--;
        }
        while(j>= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    static void main() {
        int[] nums1 = {1,3,4,6,0,0,0};
        int[] nums2 = {2,5,8};
        int n = 4; // nums1 elements
        int m = 3; // nums2 element

        mergeArray(nums1,n,m,nums2);
        System.out.println();
        for(int i: nums1){
            System.out.print( i +" ");
        }
    }
}
