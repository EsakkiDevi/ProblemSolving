import java.util.*;

class MaximumSubarray
{
  public static void main(String args[])
  {
     int[] nums={2,-7,5,-1,3,2,9,-7};
     int maxsum=0;
     int currentsum=0;
     ArrayList<Integer> list=new ArrayList<>();
     for(int i=1;i<nums.length;i++)
     {
     if(nums[i]>0)
     list.add(nums[i]);
     currentsum=Math.max(currentsum,currentsum+nums[i]);
     maxsum=Math.max(currentsum,maxsum);
     
     if(nums[i]<0 && i<nums.length-1)  
     {
     list=new ArrayList<>();
     currentsum=0;
     }
     }
     System.out.println(maxsum);
     System.out.println(list);
  }
}
//---------------------------------------------------------------
class CardTaken
{
  public static void main(String args[])
  {
 
  int nums[]={1,2,3,4,5,6,1};
   int n=nums.length;
  int k=3;
  int rightsum=0;
  int leftsum=0;
 int maxsum=0;
 for(int i=0;i<k;i++)
 {
   leftsum+=nums[i];
  }
  maxsum=leftsum;
  for(int i=0;i<k;i++)
  {
  leftsum-=nums[k-i-1];
  rightsum+=nums[n-i-1];
  maxsum=Math.max(maxsum,rightsum+leftsum);
  }
  System.out.println(maxsum);
  
}

}
//-------------------------------------------------------------------------
class SortingNum
{
  public static void main(String args[])
  {
  int nums[]={77,7,707,70,700};
  for(int i=0;i<nums.length;i++)
  {
  for(int j=i+1;j<nums.length;j++)
  {
  
        if(compareNums(nums[i],nums[j])>0)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
  }
  
 
  }
   for(int k:nums)
  {
  System.out.println(k);
  }
  }
  public static int digitNum(int n)

{
    int count=0;
      while(n>0)
      {
      count++;
      n=n/10;
      
      }
     
      return count;
}
public static int compareNums(int n1,int n2)
{
    int a=digitNum(n1);
    int b=digitNum(n2);
      int min=Math.min(a,b);
      for(int i=0;i<min;i++)
      {
      int d1=(n1/power(a-1-i))%10;
      int d2=(n2/power(b-1-i))%10;
      if(d1!=d2)  return d1-d2;
      }
      
      return a-b;
    
}

public static int power(int n)
{
    int p=1;
    for(int i=0;i<n;i++)
    {
        p*=10;
    }
    return p;
}


}




