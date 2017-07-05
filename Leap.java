# leap
import java.io.*;
import java.util.*;
import java.lang.*;
public class Leap
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a;
    a=sc.nextInt();
    if(a%4==0 || a%100==0 || a%400==0)
    {
      System.out.println("a is leap year");
      }
             else
        {
          System.out.println("a is not leap year");
                   }
          }
          }
          
