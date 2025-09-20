class Pyramid
{
   public static void main(String args[])
   {  
      int n=4;int x=1;
      for(int i=0;i<2*n;i++)
      {
        if(i<n)
        {
           for(int s=0;s<n-i;s++)
           
          {
             System.out.print(" ");
          }
          for(int j=0;j<=i;j++)
          {
             System.out.print(" "+(x+i-j));
          }
          
          x+=(i+1);
          
          System.out.println();
      }
         
      else
      { 
        for(int s=0;s<=i-n;s++)
        {
         System.out.print(" ");
         
        }
        for(int j=0;j<(2*n)-i;j++)
        {
        x=x-1;
        System.out.print(" "+x);
        }
    
        System.out.println();
      }
      }
   
    }
}

//-----------------------------------------
class AdjacentPairs
{
  public static void main(String args[])
  {
      String s1="asdfghij";
      String s2="adsfgijh";
      
      String r1="";
      String r2="";
      String arr[]=new String[s1.length()];
      int index=0;
     for(int i=0;i<s1.length();i++)
     {
        if(s1.charAt(i)!=s2.charAt(i))
        {
           r1+=s1.charAt(i);
          
           r2+=s2.charAt(i);
           
        }
        else
        {
        if(r1.length()>0)
          arr[index++]=r1+"-"+r2;
        r1="";
        r2="";
        
        }
         
       }
       if(r1.length()>0)
       arr[index++]=r1+"-"+r2;
       
       
       for(int i=0;i<index;i++)
       {
      System.out.println(arr[i]);
      }
  
  }
}
