class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String result="";
        int n1=word1.length();
        int n2=word2.length();
        while(i<n1 || i<n2){
            if(i<n1){
                result+=word1.charAt(i);
            }
            if(i<n2){
                result+=word2.charAt(i);
            }
            i++;
        }
        return result;
    }
}