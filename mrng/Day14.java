class StringsCheck
{
    public static void main(String args[])
    {
       String str="abcd";
       String goal="cbad";
       
       if(str.length()!=goal.length())
      {
      System.out.println("False");
      return;
      }
      
      if(str.equals(goal))
     {
        for(int i=0;i<str.length();i++)
        {
          for(int j=i+1;j<str.length();j++)
          {
                if(str.charAt(i)==str.charAt(j))
                {
                System.out.println("True");
                return;
                }
          }
          System.out.println("False");
          return;
     }
     }
     
     
     int f=-1;
     int s=-1;
     for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)!=goal.charAt(i))
        {
            if(f==-1)
            {
            f=i;
            }
            else if(s==-1)
            {
            s=i;
            }
            else
            {
            System.out.println("False");
            return;
            }
        }
    }
    
    System.out.println(s!=-1  &&  str.charAt(f)==goal.charAt(s)  &&  str.charAt(s)==goal.charAt(f));
    }
}
