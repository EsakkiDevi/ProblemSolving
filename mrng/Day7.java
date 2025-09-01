class  BaseAddition
{
  public static void main(String args[])
  {
    int num1=1010;
    int num2=11001;
    int n=2;
    
    int value=changeNum(num1,n)+changeNum(num2,n);
    
    System.out.println(changeNum2(value,n));
    
    }
    public static int changeNum(int num,int base)
    {
    int result=0;
    int i=1;
       while(num!=0)
       {
         int digit=num%10;
         result=result+(digit*i);
         num=num/10;
         i=i*base;
       }
       System.out.println(result);
       return result;
    
    }
    public static int changeNum2(int num,int base)
    {
    int i=1;
    int result=0;
      while(num>0)
      {
      //int digit=num%2;
      result+=num%2*i;
      i=i*10;
      num=num/2;
      }
      return result;
    }
   
}    

//-----------------------------------------------------------
class SlidingWindow
{
public static void main(String args[])
{
    
        int maxi=0;
        int nums[]={1,5,4,2,9,9,9};
        if(nums.length<3)  
        {
        System.out.println("length must be 3");
        return;
        }
      
        int k=3;
        int sum=0;
        
        for(int i=0;i<k;i++)
        {
          if(nums[i]!=nums[i+1])
          {
          sum+=nums[i];
          }
        }
        
        maxi=sum;
        
        for(int i=k;i<nums.length;i++)
        {
        if(nums[i]!=nums[i-1])
        {
        sum=sum-nums[i-k]+nums[i];
        
        }
        else{
        sum=0;
        }
        maxi=Math.max(sum,maxi);
        
        }
        
        
        System.out.println(maxi);
  }
  
  }
        
        
//-------------------------------------------------------------------------
class  ThresholdSplit
{
  public static void main(String args[])
  {
      int count=0;
      int nums[]={4,9};
      int k=2;
      for(int i=0;i<nums.length;i++)
      {
         count+=SplitNum(nums[i],k);
      }
      System.out.println(count);
  }
  public static int SplitNum(int n,int k)
  {
  int count=0;
  while(n>0)
  {
      count++;
      n=n-k;
      
  }
 // System.out.println(count);
  
  return count;
  }
}























