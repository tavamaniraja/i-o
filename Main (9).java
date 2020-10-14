/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

package lab11;
import java.util.Scanner;
public class venuebooking {
   public static void main(String[] args) throws InterruptedException {
        venue obj=new venue();
        int tot=20;
        v1 b=new v1(obj);
         v2 b1=new v2(obj);
          v3 b2=new v3(obj);
          b.start();
          b.join();
          b1.start();
          b1.join();
          b2.start();
          b2.join();
        
    }
    
}
class venue
{
  
    static int a=100;
    static String name;
    static synchronized public void booking(String str,int s)
    {
        name=str;
        if( s<=a && a>0)
        {
            System.out.println("name:"+str);
            System.out.println(" No.of.seats booked: "+s);
            a=a-s;
            System.out.println(" Remaining seats:"+a);
        }else{
            System.out.println("seats are not available in the hall");
        }
    }
}

class v1 extends Thread
{
    Scanner obj1=new Scanner(System.in);
    int s;
    String str;
    venue v;
    v1(venue v)
    {
      this.v=v;
    }
    public void run()
    {
        System.out.println("Enter the name:");
        str=obj1.next();
        System.out.println("Enter the number of seats to be booked in hall A");
        s=obj1.nextInt();
        v.booking(str,s);
    }
}    
class v2 extends Thread
{
    Scanner obj1=new Scanner(System.in);
    int s;
    String str;
    venue v;
    v2(venue v)
    {
      this.v=v;
    }
    public void run()
    {
        System.out.println("Enter the name:");
        str=obj1.next();
        System.out.println("Enter the number of seats to be booked in hall A");
        s=obj1.nextInt();
        v.booking(str,s);
    }
} 
class v3 extends Thread
{
    Scanner obj1=new Scanner(System.in);
    int s;
    String str;
    venue v;
    v3(venue v)
    {
      this.v=v;
    }
    public void run()
    {
        System.out.println("Enter the name:");
        str=obj1.next();
        System.out.println("Enter the number of seats to be booked in hall A");
        s=obj1.nextInt();
        v.booking(str,s);
    }
}
