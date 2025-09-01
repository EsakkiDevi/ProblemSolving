class TwoPointers1
{
  public static void main(String args[])
    {
        int nums[]={2,0,2,1,1,1};
        int l=0;int r=nums.length-1;int mid=0;
        while(mid<r)
        {
         if(nums[mid]==0)
         {
          int temp=nums[l];
          nums[l]=nums[mid];
          nums[mid]=temp;
          l++;
          
         }
         else if(nums[mid]==2)
         {
         int temp=nums[r];
            nums[r]=nums[mid];
            nums[mid]=temp;
            r--;
         }
         else
         {
         mid++;
         }
           
            
        
        }
        for(int n:nums)
        {
          System.out.print(n+" ");
        }
          
    }
}//-----------------------------------------
class Cookies
{
  public static void main(String args[])
  {
      int b[]={1,2,3};
      int c[]={1,1};
      
      int i=0;int j=0;
      int count=0;
      while(i<b.length  && j<c.length)
      {
          if(b[i]<=c[j])
          {
            count++;
            i++;
            j++;
          }
          else
          {
            j++;
          }
      }
      System.out.println(count);
      
  }
}
//-------------------------------------------------------------------------
class ReverseString{
    public static void main(String args[])
      {
        String str="Lets's Take a LeetCode's Contest";
        String s[]=str.split(" ");
        String result="";
        
        for(int in=0;in<s.length;in++)
        {
        String w=s[in];
           char chars[]=w.toCharArray();
           int i=0;
           int j=chars.length-1;
           while(i<j)
           {
           char c=chars[i];
           chars[i]=chars[j];
           chars[j]=c;
           i++;
           j--;
            }
          w="";
          for(char c:chars)
          {
         w+=c;
          }
          s[in]=w;
            
            
        }
        for(String string:s) result+=string+" ";
        System.out.println(result);
        
        
        
        
        
      }

}
