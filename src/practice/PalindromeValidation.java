package practice;

public class PalindromeValidation {
    public static void main (String[] args) {
        String input="Hello, World!";
        String input2="Hello,,olleh";
        PalindromeValidation pv = new PalindromeValidation();
        System.out.println("Is Palindrome? "+pv.validate(input));
        System.out.println("Is Palindrome? "+pv.validate(input2));
    }

    private boolean validate (String input) {
        input=input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=input.length()-1;
        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
