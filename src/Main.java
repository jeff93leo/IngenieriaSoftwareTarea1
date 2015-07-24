
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jefferson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  int rol=0;
       Scanner sc = new Scanner(System.in);
       int rol=0;  
        String menu="";
      do{
          menu="";
          menu+="--Buenos Dias----\n";
          menu+="ingrese 1 o 2, dependiedo su rol\n";
          menu+="¿A que rol de usuario pertenece?\n";
          menu+="1. Empleado de cajan";
          menu+="2. Administrador\n";
          menu+="3. Salir\n";
          menu+="Ingrese: ";

          System.out.println(menu);
          rol= sc.nextInt();
         
        
          switch(rol){
            case 1:
                System.out.println( "Empleado caja");
                break;
            case 2:
                System.out.println("Administrador");
                break;    
            }
      }while(rol!=3);
    }
    
}
