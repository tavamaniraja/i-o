/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class filewordcountthread {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
       
        thread th=new thread();
        th.start();
        th.join();
        thread1 th1=new thread1();
        th1.start();
        th1.join();
        thread2 th2=new thread2();
        th2.start();
        
        
    }
    
}
class thread extends Thread{
  public void run()
  {
      
      try {
        FileInputStream  fi = new FileInputStream("one.txt");
          int read,count=1;
    while((read=fi.read())!=-1)
    {
        if((char)read==' '||(char)read=='.')
            count++;
      } 
      System.out.println("one.txt: ----->"+count);
      }
    catch (FileNotFoundException e) {
          System.out.println(e);
      } catch (IOException ex) {
          Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    
      
  }
}
class thread1 extends Thread{
    public void run(){
        try{
             FileInputStream  fi1 = new FileInputStream("one.txt");
          int read,count=0;
    while((read=fi1.read())!=-1)
    {
        if((char)read==' '||(char)read=='.')
            count++;
      } 
      System.out.println("one.txt: ----->"+count);
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
class thread2 extends Thread{
    public void run(){
        try{
             FileInputStream  fi2 = new FileInputStream("second.txt");
          int read,count=0;
    while((read=fi2.read())!=-1)
    {
        if((char)read==' '||(char)read=='.')
            count++;
      } 
      System.out.println("second.txt: ----->"+count);
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
