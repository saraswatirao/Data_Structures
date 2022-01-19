class Solution {
     List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        backtrack(new ArrayList<>(),nums);
        return res;
        
    }
    
    public void backtrack(List<Integer> templist, int []nums)
    {
        if(templist.size()==nums.length)
            res.add(new ArrayList<>(templist));
        
        else{
            
            for(int i=0;i<nums.length;i++)
            {
                if(templist.contains(nums[i]))
                    continue;
                templist.add(nums[i]);
                backtrack(templist,nums);
                templist.remove(templist.size()-1);
                
            }
            
        }
        
    }
}