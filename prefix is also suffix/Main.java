import java.util.*;
public class Main {
   
       public static void main(String[] args)
      {  
           Scanner scan=new Scanner(System.in);
           String str=scan.next();
           int n=str.length();
           StringBuilder sb=new StringBuilder(str);  
           sb.reverse();  
            String  rev= sb.toString();
           //String str="aaa";
            String ans="";
           
         
         // System.out.println(  rev.substring(3,0));
         for(int i=0;i<str.length()/2;i++)
          {
             String s1=str.substring(0,i+1);
             String s2=str.substring(str.length()-i-1,str.length());
             
            
             
             if(s1.equals(s2) && (s1.length()>ans.length()))
             {
                 ans=s1;
             }
            
          } 
           
           
        //System.out.println(str.length()/2);   
        if(ans.length()<=str.length()/2)  
             System.out.println(ans.length());
           
       }
    
}


 