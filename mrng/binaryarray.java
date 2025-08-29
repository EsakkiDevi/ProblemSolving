class binaryarray
{
public static void main(String args[])
{
int n=3;
for(int i=0;i<n*n;i++)
{
int v=i;
int Binary=0;
int m=1;
   while(v>0)
  {
    Binary+=v%2*m;
    v=v/2;
    m=m*10;
  }
   String s=String.valueOf(Binary);
  while(s.length()<n)
  {
    s='0'+s;
  }
  int l=0;
for(int j=0;j<n;j++)
{
   
    System.out.print(s.charAt(l++));
   
    
}
System.out.println();
}

}
}
