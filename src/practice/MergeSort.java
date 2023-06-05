package practice;

import java.util.Arrays;

public class MergeSort {
    public static void main (String[] args) {
        int[] nums1 ={1,3,7};
        int[] nums2 ={2,4,11};
        MergeSort ms = new MergeSort();
        int[] mergedArr = ms.merged(nums1,nums2);
        Arrays.stream(mergedArr).forEach(num-> System.out.print(num+" "));
    }

    private int[] merged (int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length+nums2.length];
        int i=0; // index of nums1
        int j=0; // index of nums2
        int k=0; // index of mergedArr

        while(i<nums1.length&&j< nums2.length){
            if(nums1[i]<=nums2[j]){
                mergedArr[k]=nums1[i];
                i++;
            }else {
                mergedArr[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i< nums1.length){
            mergedArr[k]=nums1[i];
            i++;
            k++;
        }

        while(j<nums2.length){
            mergedArr[k]=nums2[j];
            j++;
            k++;
        }
        return mergedArr;
    }
}
