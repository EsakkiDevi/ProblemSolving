class versions
{
  public static void main(String args[])
  {
    String v1="1.2";
    String v2="1.10";
    
   
    
    String s1[]=v1.split("\\.");
    String s2[]=v2.split("\\.");
     int n1=s1.length;
    int n2=s2.length;
    
    int mx=Math.max(n1,n2);
    for(int i=0;i<mx;i++)
    {
    int num1=i<n1?Integer.parseInt(s1[i]):0;
    int num2=i<n2?Integer.parseInt(s2[i]):0;
    if(num1<num2)
    {
    System.out.println(-1);
    return;
    }
    if(num2<num1)
    {
    System.out.println(1);
    return;
    }
    }
    System.out.println(0);
  }
}
