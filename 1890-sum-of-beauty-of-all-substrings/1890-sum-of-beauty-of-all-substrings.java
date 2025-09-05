class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int maxfreq = 0,  minfreq = Integer.MAX_VALUE;
                for(int f:freq){
                    if(f>0){
                        maxfreq=Math.max(maxfreq, f);
                        minfreq=Math.min(minfreq, f);
                    }
                }
                ans+=(-minfreq+maxfreq);
            }
        }
        return ans;
        
    }
}