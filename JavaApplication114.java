package javaapplication114;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaApplication114 
{
    public static void main(String[] args) 
    {
        Scanner is=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=is.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>(n);
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
          System.out.println("Elements is " + ":" + (i+1));
          list.add(is.nextInt());
        }
        System.out.println("Enter the search number:");
        int m=is.nextInt();
        for(int i=0; i<n; i++)
        {
           if(list.contains(m))
           {
              System.out.println("This element is present in the list"+ "at location" + list.indexOf(m));
              break;
           }
           else
           {
              System.out.println("This element is not present in the list");
              break;
           }
        }
    }
}