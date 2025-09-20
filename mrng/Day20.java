class RemoveDubs
{
    public static void main(String args[])
    {
   /* String s="a1b2c1d2e3";
    String result="";
    int l=0;
    for(int i=0;i<s.length();i++)
    {
    char c=s.charAt(i);
      if(c>='a' && c<='z')
      {
       int index=result.indexOf(c);
       if(index==-1)
         {
          result+=c;
          //System.out.print(c);
          
         }
      } 
      else
      {
      result+=c;
      //System.out.print(c);
      }
    }
    
    
    String result1="";
    for(int i=s.length()-1;i>=0;i--)
    {
    
        char c=s.charAt(i);
        //System.out.println(c);
         if(c>='0' && c<='9')
         {
           int index=result1.lastIndexOf(c);
           if(index==-1)
           {
            result1=c+result1;
            
           }
           
         }
         else
           {
            result1=c+result1;
           }
    }
    
    
    System.out.print(result1);*/
    
    
    
        String s="aaa1221234bbb";
       devi: for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'  && s.charAt(i)<='z')
            {
               for(int j=0;j<i;j++)
               {
                 if(s.charAt(j)==s.charAt(i))
                 {
                    continue devi;
                 }
               }
                System.out.print(s.charAt(i));
            }
            else
            {
                for(int j=i+1;j<s.length();j++)
                {
                  if(s.charAt(j)==s.charAt(i))
                  {
                  continue devi;
                  }
                }
                System.out.print(s.charAt(i));
            }
           
        }
    
       
    
    }
}
//----------------------------------------------------------
