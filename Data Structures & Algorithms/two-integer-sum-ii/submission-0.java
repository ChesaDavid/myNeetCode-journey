class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length-1;
        int[] rez = new int[2];
        while(left < right){
            if(numbers[left] + numbers[right]==target){
                rez[0] = left+1;
                rez[1] = right+1;
                return rez;
            }
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            if(numbers[left] + numbers[right] < target){
                left++;
            }
        }
        return rez;
    }
}
