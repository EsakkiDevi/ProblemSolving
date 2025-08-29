import java.util.*;
class consecutive
{
public static void main(String args[])
{
    int nums[]={1,0,1,1,0,1,1,0,1,1,1,1};
    int n=nums.length;
      
      int[] array=new int[n+n];
      int x=0;
      int k=3,i=0;
      while(i<nums.length)
    {
    int count=0;
    if(nums[i]==1)
    {
      while(count<k   && i<nums.length && nums[i]==1)   
      {
      count++;
      array[x++]=nums[i];
        
        i++;
        
      }
      if(count==k)
      {
      array[x++]=0;
      }
      }
      
      else
      {
      array[x++]=nums[i];
      i++;
      }
      
    
    
    
    
    }
    for( i=0;i<x;i++)
    System.out.print(array[i]);
    
}
}
