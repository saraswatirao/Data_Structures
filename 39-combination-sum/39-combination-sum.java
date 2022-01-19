class Solution {
     List<List<Integer>> flist=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
           //this sorting is optional
           Arrays.sort(nums);
            backtrack(new ArrayList<>(),nums,target,0);
            return flist;

    }
    
    public void backtrack(List<Integer> templist,int[]nums, int remain, int start)
    {
        if(remain<0)
            return;
        if(remain==0)
            flist.add(new ArrayList<>(templist));
        else{
            
            for(int i=start;i<nums.length;i++)
            {
                templist.add(nums[i]);
                backtrack(templist,nums,remain-nums[i],i);
                templist.remove(templist.size()-1);
                
            }
        }
   
    }
}