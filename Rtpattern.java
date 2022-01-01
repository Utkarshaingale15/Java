
class Rtpattern 
{
    public static void main(String[] args)  
    {  
        int i,j, n=7;  

        System.out.println("Right angle triangle pattern");  
        for(i=1;i<n;i++)  
        {  
            for(j=1;j<=i;j++)  
            {  
                System.out.print("  *");  
            }  
            System.out.println("");  
        }  
    }  
} 
  


OUTPUT :-
    
    
    PS F:\Java> javac Rtpattern.java
PS F:\Java> java Rtpattern
Right angle triangle pattern
  *
  *  *
  *  *  *
  *  *  *  *
  *  *  *  *  *
  *  *  *  *  *  *
  
    
    
