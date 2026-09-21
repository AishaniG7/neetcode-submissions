class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true; 

        int left = 0; 
        int right = s.length() - 1; 


        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left)); 
            char rightChar = Character.toLowerCase(s.charAt(right)); 

            System.out.println(leftChar); 
            System.out.println(rightChar); 

            if (leftChar == rightChar) {
                System.out.println("first");
                left++;
                right--;

            } else if (!Character.isLetterOrDigit(leftChar)){
                System.out.println("second");
                left++; 
            } else if (!Character.isLetterOrDigit(rightChar)) {
                System.out.println("third");
                right--; 
            } else {

                System.out.println("jump to else"); 
                result = false; 
                break; 
            }
        }

        return result; 
    }
}
