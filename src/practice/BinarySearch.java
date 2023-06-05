package practice;

public class BinarySearch {

    public static void main (String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,3,5,7,9,11,12,14};
        int targetNum = 13;
        int index = bs.search(arr,targetNum);
        System.out.println("The index of a target number is "+((index==-1)? "None":index));
    }

    private int search (int[] arr, int targetNum) {
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==targetNum){
                return mid;
            }else if(arr[mid]<targetNum){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
