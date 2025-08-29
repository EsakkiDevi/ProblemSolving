class StringCompressing
{
    public static void main(String args[])
    {
      char arr[]={'x','x','x','x','x','x','x','x','x','x','x','x'};
     int i=0;int index=0;
     while(i<arr.length)
     {
      int count=0;
      char c=arr[i];
      while(i<arr.length && c==arr[i])
      {
      count++;
      i++;
      }
      
      arr[index++]=c;
      if(count>1)
      {
          String countvalue=String.valueOf(count);
          for(char ch:countvalue.toCharArray())
          {
              arr[index++]=ch;
          }
      }
     
     }
      
      
     System.out.println(index);
        
    }
}
//-----------------------------------------------------------------------
class BinaryArray
{
    public static void main(String args[])
    {
    int nums[]={1,0,1,0,1,0,1,0};
    int n=nums.length;
    int l=0;int r=nums.length-1;
   while(l<r)
    {
    if(nums[l]==1)
    {
    int temp=nums[l];
    nums[l]=nums[r];
    nums[r]=temp;
    r--;
    }
    else
    {
    l++;
    }
    
    }
    for(int k:nums)
    {
    System.out.print(k+" ");
    }
    System.out.println();
        
    }
}
//-------------------------------------------------------------------------------------
class SumOfTwoPrime
{
  public static void main(String args[])
  {
  int n=50;
  boolean t=false;
  for(int i=2;i<n;i++)
  {
    if(isCheckPrime(i) && isCheckPrime(n-i))
    {
      t=true;
    }
  }
  System.out.println(t);
  }
  
  public static boolean isCheckPrime(int n)
  {
      for(int i=2;i<n;i++)
      {
          if(n%i==0)
          {
             return false;
          }
      }
     return true;
  }
  
}




























