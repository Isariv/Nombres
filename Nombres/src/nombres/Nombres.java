/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int palabras = 0;
        String nombre ;
        ArrayList<String> nombresArrayList = new ArrayList<String>();
        
            System.out.println("Bienvenido al sistema de almacenado de nombres");
            System.out.println("¿De cuántas palabras está conformado tu nombre "
                     + "completo?");

            Scanner sc = new Scanner(System.in);
            palabras = sc.nextInt();
        
                for(int i=0; i<palabras; i++){
                    System.out.println("Ingrese un nombre: ");

                    Scanner sc1 = new Scanner (System.in);
                    nombre = sc1.nextLine();
                    nombresArrayList.add(nombre+i);
                }
        
                Iterator<String> nombresIterator = nombresArrayList.iterator();
                    
                    while(nombresIterator.hasNext()){
                    
                        String elemento = nombresIterator.next();
                        System.out.print(elemento + " / ");
                    }
        
      
    }
    
}
