class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]neg=new int[nums.length/2];
        int negCon=0;
        int posCon=0;
        int[]pos=new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos[posCon]=nums[i];
                posCon++;
            }else{
                neg[negCon]=nums[i];
                negCon++;
            }
        }

        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;


    }
}