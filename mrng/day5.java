class NumberPali
{
    public static void main(String args[])
    {
        int n=195;
        int num=n;
    int count=0;
      while(!checkPalidrome(n) && count<5)
        {
          int i=1;
          num=n;
          int value=0;
          while(num>0)
      {
        int digit=num%10;
        num/=10;
        value=value*10+digit;
      
      
      }
      count++;
      n=n+value;
      
    }
        System.out.println(n);
        
        
    }
    
    public static boolean checkPalidrome(int num)
    {
    int reverse=0;
    int n=num;
    while(n>0)
    {
    int digit=n%10;
    reverse=reverse*10+digit;
    n=n/10;
    }
    return reverse==num;
    
      
    
    }
}

//-------------------------------------------------------------------------------------------

class wordpattern
{

public static void main(String args[])
{
    String word="Program";
    if(word.length()%2==0)
    {
    System.out.print("Even Length");
    return;
    }
    int n=word.length();
    int mid=word.length()/2;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
      int index=(j+mid)%word.length();
          System.out.print(word.charAt(index)+" ");
      }
          System.out.println();
        
    }
      
    }  
    
}
//------------------------------------------------------------
class windows
{
  public static void main(String args[])
  {
      int nums[]={1,3,5,2,1,8,6,9};
      int k=3;
      int total=0;
      int max=nums[0];
      for(int i=0;i<k;i++)
      {
        if(max<nums[i])
        {
        max=nums[i];
        }
       
        
      }
       System.out.print(max+" ");
      for(int i=k;i<nums.length;i++)
      {
          if(max<nums[i])
          {
          max=nums[i];
          System.out.print(max+" ");
          }
          else
          {
           System.out.print(max+" ");
          }
          
      }
  
  }
}























