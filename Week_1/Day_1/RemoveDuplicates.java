class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;int k=0;
         
        int[] ans=new int[n];
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                ans[k]=nums[i];
                k++;

            }


        }
        return k;

        
    }
}