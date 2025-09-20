class lexi
{
    public static void main(String args[])
    {
    String[] words={"zebra","apple","mango","ball","cat","dog","elephant","fish","ant","bat"};
    
    /*for(int i=0;i<words.length;i++)
    {
      for(int j=i+1;j<words.length;j++)
      {
       if(words[i].compareTo(words[j])>0) {
          
           String t=words[i];
           words[i]=words[j];
           words[j]=t;
           
         }
      }
      
    }*/
    
    
    int i=0;
    while(i<words.length-1)
    {
       if(compare(words[i],words[i+1])>0)
       {
       String t=words[i];
       words[i]=words[i+1];
       words[i+1]=t;
       i=0;
       }
       else
       {
       i++;
       }
    }
    
  
  
  for(String s:words)
    {
    System.out.print(s+" ");
    }
    }
   static int compare(String a,String b)
    {
        int n1=a.length();
        int n2=b.length();
        int n=n1<n2?n1:n2;
        for(int i=0;i<n;i++)
        {
           if(a.charAt(i)!=b.charAt(i))
           {
              return a.charAt(i)-b.charAt(i);
           }
        }
        
        return n1-n2;
  
    }
}

//----------------------------------------------------------------------
class CheckSubstring
{
    public static void main(String args[])
    {
    
        String s1="esadkkidevi";
        String s2="dei";
        int n=s1.length();
        int m=s2.length();
        /*//int l=0;
       int i=0;
    while(i<n-m)
      {
         int l=0;
         int j=i;
         while(l<m && s1.charAt(j)==s2.charAt(l))
          {
            j++;
            l++;
          }
          if(l==m)
          {
             System.out.print("True");
             return;
          }
          
          i++;
          
      }    
     
        
        System.out.println("False");*/
        int i=0;
        int j=0;
        int count=0;
        while(i<n)
        {
              if(s1.charAt(i)==s2.charAt(j))
              {
                
                j++;
                  if(j==m)  
                  {
                  System.out.println("True");
                  return;
                  }
              
              }
              else
              {
                  if(j>0) i=i-j;
                  j=0;
                
                
              }
              i++;
              
        }
        System.out.println("False");
        
        
        
    }
}






























