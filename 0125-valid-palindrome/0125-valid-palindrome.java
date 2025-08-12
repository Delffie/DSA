class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int a=0;
        int b=s.length()-1;
        while(a<b){
            while(a < b && !isAlphaNumeric(s.charAt(a))){
                a++;
            }
            while(a < b && !isAlphaNumeric(s.charAt(b))){
                b--;
            }
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
        
    }
    private boolean isAlphaNumeric(char ch){
        return(ch >='a' && ch <='z') || (ch >='0' && ch <='9');
    }
}