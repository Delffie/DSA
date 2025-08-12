class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int start=0, end=0 , maxlength=0;
        while(end < s.length()){
            char chars = s.charAt(end);
            while(window.contains(chars)){
                window.remove(s.charAt(start));
                start++;
            }
            window.add(chars);
            maxlength = Math.max(maxlength, end - start + 1); 
            end++; 
        }
        return maxlength;
        
    }
}