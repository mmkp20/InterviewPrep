package practice;

public class MissingNumber {
    public static void main (String[] args) {
        int[] nums ={0,1,2,3,4,5,7};
        MissingNumber mn = new MissingNumber();
        System.out.println("The missing number is "+mn.findMissingNumber(nums));
    }

    private int findMissingNumber (int[] nums) {
        int n = nums[nums.length-1];
        int expectedSum = n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return expectedSum-sum;
    }

//    private int findMissingNumber (int[] nums) {
//        int n = nums[nums.length-1];
//        int expectedSum = n*(n+1)/2;
//        int sum = Arrays.stream(nums).sum();
//        return expectedSum-sum;
//    }
}
