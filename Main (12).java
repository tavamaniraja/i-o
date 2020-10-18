/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class intlistgeneric {
    public static void main(String[] args) {
        Integer n[]={1,20,3,4,5,6,7,8,9};
        list<Integer> obj=new list<>(n);
        obj.oddcount();
        obj.findmax();
        obj.swap( n,0,1);
        
    }
    
}
class list<T>{
    T[] value;
    public list(T[] value){
        this.value=value;
        
    }
    public void oddcount(){
        int count=0;
        for(int i=0;i<value.length;i++){
          int v= (int) value[i];
          if(v%2!=0){
             count++; 
              
          }   
        }
        System.out.println("Total number of odd integers in the list is: "+count);
    }
     public void findmax(){
         System.out.println("Enter the limit between in which the maximum element to be found");
        Scanner s=new Scanner(System.in);
        int f=s.nextInt();
        int l=s.nextInt();
        int max=(int)value[f];
        for(int i=f;i<=l;i++){
          int v= (int) value[i];
          if(v>max){
              max=v;
           
              
          }   
        }
     
        System.out.println("The maximum element between the given range is: "+max);
    }
     public void swap(T[] n,int g,int h){
        
         T t=n[g];
         n[g]=n[h];
         n[h]=t;
         System.out.println("The elements in an array after swaping");
         for(int i=0;i<value.length;i++){
            System.out.print("  "+value[i]); 
         }
        
}
     
}