import java.util.*;
public class Main {
    public static boolean pal(String s)
    {
        int l=0;
        int r=s.length()-1;
        int n=s.length();
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
                 return false;
           else {
                l++;
                r--;
            }
          
           //return true; 
        }
       
        return true; 
     
    }
   
        public static void main(String args[])
        {
            Scanner s =new Scanner(System.in);
            int n=s.nextInt();
            
            while(n>0)
            {
                int k=s.nextInt();
                int temp=k+1;
                
               
                while(pal(Integer.toString(temp))==false)
                {
                     temp++;
                }    
                System.out.println(temp);
                
                n--;
            }
        }
        
    
    
}




