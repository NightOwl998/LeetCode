class Solution {
    public int search(int[] nums, int target) {
       List<Integer> list11 =Arrays.stream(nums).boxed().collect(Collectors.toList()); 
        return list11.indexOf(target);
        
    }
}