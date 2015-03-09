
package tablademultiplicar;

import java.util.*;
public class Tablademultiplicar {

   
    public static void main(String[] args) {
         Scanner lector=new Scanner(System.in);
    int c,a=0,s=1;
    System.out.println("introducir el numero de la tabla que desea");
    c=lector.nextInt(); 
    	while(s<11){
    	a=s*c;
    	System.out.println(s+"*"+c+"="+a);
    	s++;
    	} 
        
        
        
    }
    
}
