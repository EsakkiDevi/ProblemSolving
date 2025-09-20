class GenLarge
{
  public static void main(String args[])
  {
      int nums[]={3,30,34,5,9};
      int n=nums.length;
      for(int i=0;i<n;i++)
      {
      for(int j=i+1;j<n;j++)
      {

      
      String ab=String.valueOf(nums[i])+String.valueOf(nums[j]);
      String ba=String.valueOf(nums[j])+String.valueOf(nums[i]);
         if(ab.compareTo(ba)<0)
         
         {
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
         }
      }
      }
      String result="";
      for(int k:nums)
      {
      result+=k;
      }
      System.out.println(result);
  }
}
//-----------------------------------------------------------------------------------------------
class FindDigit
{
    public static void main(String args[])
    {
     int n=40;
     int count=10;
     int digit=0,i=10;;
     int to=((n%10)/2)+10;
     if(n<10)
     
     {
     System.out.println(n);
     return;
    }
     while(count<=n && n>=10)
     
    {
   int num=i;
   //System.out.println("num"+num);
 
            if(n%2==0)
            {
            digit=num/10;
            // System.out.println(digit);
            count++;
            // System.out.println("c"+count);
            }
            else
            {
            digit=num%10;
             //System.out.println(digit);
            count++;
             //System.out.println("c"+count);
            }
            count++;
            i++;
    }
    System.out.println(digit);
    }
}
//---------------------------------------------------------------------------------
class MaxSubMatrix
{
  public static void main(String args[])
  {
      int nums[][]={{1,1},{0,1}};
      
      
  }
  
}

