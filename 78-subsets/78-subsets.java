class Solution {
      List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     
        Arrays.sort(nums);
        backtrack(new ArrayList<>(),nums,0);
        return res;
        
    }
    
    public void backtrack(List<Integer> templist,int[] nums,int start)
    {
        res.add(new ArrayList<>(templist));
        
        for(int i=start;i<nums.length;i++)
        {
            templist.add(nums[i]);
            backtrack(templist,nums,i+1);
            templist.remove(templist.size()-1);
       }
        
    }
}