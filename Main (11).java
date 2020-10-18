/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class sortingDescgeneric {
    public static void main(String[] args) {
        Integer n[]={10,20,30,40};
        sort<Integer> obj=new sort<>(n);
        obj.desc();
        Character c[]={'a','b','c','d'};
        sort<Character> obj1=new sort<>(c);
        obj1.chardesc();
        String s[]={"oops","java","program","class"};
        sort<String> obj2=new sort<>(s);
        obj2.stringdesc();
        Double d[]={0.44,0.5,5.66,1.09};
        sort<Double> obj3=new sort<>(d);
        obj3.doubledesc();
        Float f[]={9.09f,7.05f,4.1f,1.1f};
        sort<Float> obj4=new sort<>(f);
        obj4.floatdesc();
        
    }
} 

class sort<T>{
     T[] value;
     T t;
    public sort(T[] value){
        this.value=value;
        
    }
    public void desc(){
        int x,y;
        System.out.println("Before sorting the array elements are:");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
         System.out.println();
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value.length;j++){
            x=(int)value[i];
            y=(int)value[j];
            if(x>y){
                t=value[i];
                value[i]=value[j];
                value[j]=t;
            }
            } 
        }
        System.out.println("After sorting integers in descending order: ");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
        System.out.println();
    }
    public void chardesc(){
        char x,y;
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value.length;j++){
              x=(char)value[i];
              y=(char)value[j];
            if(x>y){
                t=value[i];
                value[i]=value[j];
                value[j]=t;
                
                
            }
        }
        }
         System.out.println("After sorting characters in descending order: ");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
    }
        System.out.println();
    }
    public void stringdesc(){
       
        for(int i=0;i<value.length;i++){
            String x,y;
            for(int j=0;j<value.length;j++){
                x=value[i].toString();
                y=value[j].toString();
                if(x.compareTo(y)<=0){
                     t=value[i];
                     value[i]=value[j];
                     value[j]=t;
                
                
                    
                }
               
            }
        }
        System.out.println("After sorting strings in descending order: ");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
        System.out.println();
    }
    public void doubledesc(){
        double x,y;
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value.length;j++){
            x=(double)value[i];
            y=(double)value[j];
            if(x>y){
                t=value[i];
                value[i]=value[j];
                value[j]=t;
            }
            } 
        }
        System.out.println("After sorting double in descending order: ");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
        System.out.println();
        
    }
    public void floatdesc(){
        float x,y;
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value.length;j++){
            x=(float)value[i];
            y=(float)value[j];
            if(x>y){
                t=value[i];
                value[i]=value[j];
                value[j]=t;
            }
            } 
        }
        System.out.println("After sorting float in descending order: ");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
        System.out.println();
        
    }
}
