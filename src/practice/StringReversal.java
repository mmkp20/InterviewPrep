package practice;

public class StringReversal {
    public static void main (String[] args) {
        String input="Hello, World!";
        StringReversal sr = new StringReversal();
        System.out.println("String reversal: "+sr.reverse(input));
    }

    private String reverse (String input) {
        char[] charArr = input.toCharArray();
        int left=0;
        int right=input.length()-1;
        while(left<right){
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;

            left++;
            right--;
        }
        return new String(charArr);
    }

//    private String reverse (String input) {
//        String result="";
//        for(int i=input.length()-1;i>=0;i--){
//            result+=input.charAt(i);
//        }
//        return result;
//    }

}
