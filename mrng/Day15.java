class StringRotation
{
  public static void main(String args[])
  {
     String s="abcde";
     int n=s.length();
     String s1="deabc";
     
     for(int i=0;i<s.length();i++)
     {
     boolean t=true;
        for(int j=0;j<s1.length();j++)
        {
           if(s.charAt((i+j)%n)!=s1.charAt(j))
           {
                t=false;
                break;
           }
        }
        if(t) 
        {
        System.out.println("True");
        return;
        }
     }
     System.out.println("False");
     
     
  }
}
