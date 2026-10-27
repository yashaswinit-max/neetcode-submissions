class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return false;
        }

        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}