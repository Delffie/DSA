import java.util.Arrays;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length-1;
        int boat = 0;
        Arrays.sort(people);
        while(left<=right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boat++;
        }
        return boat;
        
    }
}