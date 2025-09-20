import java.util.*;
class RearrangeArray
{
  public static void main(String args[])
  {
   int nums[]={1,2,3,4,5,6,7,8,9};
   int result[]=new int[nums.length];
   int index=0;
   Arrays.sort(nums);
   int n=nums.length;
   int l=0;
   int r=n-1;
   while(index<n && l<=r)
   {
      result[index++]=nums[r];
      r--;
      if(index<n)
      {
        result[index++]=nums[l];
        l++;
      }
   }
   for(int k:result)
   {
   System.out.print(k+" ");
  }
  }
}
