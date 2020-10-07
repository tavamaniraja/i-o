/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.File;

public class fileoperations {
    public static void main(String[] args) {
        File f=new File("customer1.txt");
        String r=f.getName();
        if(f.exists())
        {
            System.out.println("File exists........");
            System.out.println("File Name: "+f.getName());
            System.out.println("File Path: "+f.getAbsoluteFile());
            System.out.println("Writable File: "+f.canWrite());
            System.out.println("Readable File: "+f.canRead());
            System.out.println("Length of the file in bytes:"+f.length());
        }
        
        for(int i=0;i<r.length();i++)
          {
             
            if(r.charAt(i)=='.')
            {
                String h;
                h=r.substring(i+1,r.length());
                System.out.println(h);
                if(h.equals("txt"))
                {
                    System.out.println("The file type is: Text  file");
                }
                else
                    System.out.println("The file type is: Image file");            
                           
            }

            
            
        }
            
        
         
    }
    
}
