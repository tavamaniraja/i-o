/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class customermobileno {
    public static void  main(String[] args) throws IOException, ClassNotFoundException{
        DataInputStream d=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("customerdetails.txt"));
        int n=2;
        customer c[]=new customer[10];
        String name;           
        
        String mobno;
        for(int i=0;i<n;i++)
        {
            System.out.println("Customer name:");
            name=d.readLine(); 
            System.out.println("Customer mobile number:");            
            mobno=d.readLine(); 
           // mobno=Double.parseDouble(d.readLine());
            c[i]=new customer(name,mobno);
            obj.writeObject(c[i]);
        }
        
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("customer.txt"));
        System.out.println("Enter the name");
        String s=d.readLine();
        int i=0;
       
        while(n>0)
        {
          
           
            if(obj1.readObject()!=s)
            {
             n--;
             i++;
            }
            
            System.out.println("CUSTOMER MOBILE NO: "+c[i].mobno);
            break;
            
         
        }
        
        obj1.close();      
        
    }
    
    
        
}

class customer implements Serializable     
{
    String name;
    
    String mobno;
    customer(String n,String m )
    {
        name=n;
        
        mobno=m;
        
    }
   
}
