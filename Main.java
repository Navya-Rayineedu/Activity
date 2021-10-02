import java.util.*;
public class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      String word=sc.next();
      char[] a=word.toCharArray();
      int l=0,r=a.length-1;
      while(l<r)
      {
          if(!Character.isAlphabetic(a[l]))
          {
              l++;
              //System.out.println(Character.isAlphabetic(a[l]));
          }
          else if(!Character.isAlphabetic(a[r]))r--;
          else
          {
              char temp;
              temp=a[l];
              a[l]=a[r];
              a[r]=temp;
              l++;
              r--;
          }
      }
      for(int i=0;i<a.length;i++)System.out.print(a[i]);
  }
}