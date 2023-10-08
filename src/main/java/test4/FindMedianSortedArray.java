package test4;

/**
 * Created by zhanghong on 2023/8/31.
 *
 * 合并两个有序数组 并求解中位数
 */
public class FindMedianSortedArray {


    public static void main(String[] args){

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1ArrayLength = nums1.length;
        int nums2ArrayLength = nums2.length;
        if(nums1ArrayLength==0){
            return findMedianArray(nums2);
        }
        if(nums2ArrayLength==0){
            return findMedianArray(nums1);
        }

        int totalLength = nums1ArrayLength + nums2ArrayLength;
        int[] resultArray = new int[totalLength];



        return 0d;
    }


    public static double findMedianArray(int[] array){
        int length = array.length;
        if(length%2==0){
            int littleHalfPart = length/2 -1;
            int bigHalfPart = length/2;

            return (double) (array[littleHalfPart] + array[bigHalfPart]);
        } else {
            int halfIndex = length /2;
            return (double) array[halfIndex];
        }

    }
}
