class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=1;
        }
        int prefix = 1;
        for(int i=0;i<nums.length;i++){
            arr[i] *= prefix;
            prefix *= nums[i];
        }
        int posfix = 1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=posfix;
            posfix *= nums[i];
        }
        return arr;
    }
}  
