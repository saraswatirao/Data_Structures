class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
         int i=0,j=0,k=0;
        int c= nums1.length+nums2.length;
        double t=0;
        int[] a = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                a[k]=nums1[i];
                i++;
                k++;
            }
            else{
                
                a[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length)
        {
              a[k]=nums1[i];
                i++;
                k++;
        }
        while(j<nums2.length)
        {
             a[k]=nums2[j];
                j++;
                k++;
        }
            
         if(c%2==0)
        {
            t=(double)(a[c/2]+a[(c/2)-1])/2;
            
}
        else
            t=a[c/2];
        return t;
        
    }
}