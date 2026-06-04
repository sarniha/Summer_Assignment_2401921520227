class solution{
    public int[] sum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();int n=nums.length;int[] ans=new int[2];
        for(int j=0;j<n;j++){
            int curr=nums[j];
            if(map.containsKey(target-curr)){
                ans[0]=j;
                ans[1]=map.get(target-curr);
                return ans;
            }
            map.put(nums[j],j);
        }
        return ans;
    }
}