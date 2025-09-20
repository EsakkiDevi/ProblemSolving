class StringProduct
{
  public static void main(String args[])
  {
      String num1="123";
      int m=num1.length();
      String num2="216";
      int n=num2.length();
      String result="0";
     int place=0;
      for(int i=num2.length()-1;i>=0;i--)
      {
   
    //System.out.println("n2:"+n2);
     String ans=product(num1,num2.charAt(i));
       for(int k=0;k<place;k++)
       
       {
        ans+="0";
      }
  
     
     result=sumOf(result,ans);
    place++;
    
             
          
      }
      System.out.println(result);
  }
  public static String product(String n1,char c)
  {
  int digit=c-'0';
    //int n=n1.length()-1;
    int carry=0;
    String result="";
      for(int i=n1.length()-1;i>=0;i--)
      {
        
       int mul= (n1.charAt(i)-'0') * digit +carry ;
       
        carry=mul/10;
       result=(mul%10)+result;
       
      }
      if(carry>0)
      {
      result=carry+result;
      }

     // System.out.println(result);
      return result;
  }
  public static String sumOf(String s1,String s2)
  {
 
  int carry=0;
  String result="";
  int i=s1.length()-1;
  int j=s2.length()-1;
  
  while(i>=0 || j>=0 || carry!=0)
  {
   int value=carry;
  if(i>=0)
  {
  value+=s1.charAt(i)-'0';
    i--;
  }
  if(j>=0)
  {
 value+=s2.charAt(j)-'0';
 j--;
 }
  
  carry=value/10;
  result=(value%10)+result;

  
  
  }
  //System.out.println("Sum:"+result);
  return result;
  
  }
  
 
  
  

}
//------------------------------------------------------------------------------------
class Stockprize
{
    public static void main(String args[])
    {
        int[] prices={7,6,4,3,1};
        int n=prices.length;
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<n;i++)
        {
          if(profit<prices[i]-mini)
             {
              profit=prices[i]-mini;
              }
          if(mini>prices[i])
              {
               mini=prices[i];
        
             }
        
            
        }
        System.out.println(profit);
        
    }
}
//-----------------------------------------------------------------------------------
class IPaddress
{
public static void main(String args[])
{
    String s="172.16.254.1";
    String str[]=s.split("\\.");
    if(str.length!=4) 
    {
    System.out.println("false");
    return;
    }
    for(int i=0;i<str.length;i++)
    {
       if(!checking(str[i]))
       
       {
       System.out.println("false");
      return;
       
      }
      if(str[i].charAt(0)=='0' && str[i].length()!=1)
      {
      System.out.println("false");
      return;
      
      }
    }
  System.out.println("True");
    
    
}
public static boolean checking(String s)
{
    if(s.length()==0) return false;
      int n=0;
      int i=0;
      while(i<s.length())
      {
      n=n*10+(s.charAt(i)-'0');
   
      i++;
      }
      if(n>255) return false;
      return true;
}
}
