class ArraySort
{
    public static void main(String args[])
    {
        int nums1[]={4,6,8,100};
        int nums2[]={-7,1,3,5,7,9};
        int m=nums1.length;
        int n=nums2.length;
        int[] nums = new int[m + n];
        int index = 0;
        int l = 0, r = 0;

      
        while(l<m && r<n) 
        {
            if(nums1[l]<nums2[r]) 
            {
                if (index==0 || nums[index-1]!=nums1[l]) 
                {
                    nums[index++]=nums1[l];
                }
                l++;
            } 
            else 
            {
                if(index==0 || nums[index-1]!=nums2[r]) 
                {
                    nums[index++]=nums2[r];
                }
                r++;
            }
        }

        
        while(l<m) 
        {
            if(index==0 || nums[index-1] != nums1[l]) 
            {
                nums[index++]=nums1[l];
            }
            l++;
        }

       
        while(r<n) 
        {
            if(index==0 || nums[index- 1] != nums2[r]) 
            {
                nums[index++]=nums2[r];
            }
            r++;
        }

      
        for (int i=0;i<index;i++) 
        {
            System.out.print(nums[i]+" ");
        }
    }
    
   
    
}
