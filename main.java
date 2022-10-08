/**
 *
 * @author Daw120
 * 
 * Realiza las siguientes acciones:
 
   • Documenta la clase indicando que hace cada método y atributo. 
   • Crear un objeto de la clase Circulo que se llame c1 utilizando 
     el constructor por defecto.  
   • Crear un objeto de la clase Circulo que se llame c2 inicializando el radio a 10. 
   • Crear un objeto de la clase Circulo que se llame c3 inicializando el radio a 
     un valor que hayamos solicitado al usuario por teclado.    
   • Cambia el valor del radio del objeto c1 a 5.  
   • Muestra por pantalla el nuevo valor del radio de c1. 
   • Muestra por pantalla el valor del radio de c3.  
   • Muestra por pantalla el área dec2.
   • Muestra por pantalla el área y longitud de c3.
   
 */
package com.solomongo.ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
      
        Circulo c1=new Circulo(); // nuevo Objeto de la Clase Circulo, constructor default.                 
                System.out.print("\n- Valor del radio de c1: ");
                System.out.printf("%,.0f",c1.getRadio());
                
        Circulo c2=new Circulo();
                c2.setRadio(10);// otro objeto, con Metodo set, inicializado a 10. 
                System.out.print("\n- Valor del radio de c2: ");
                System.out.printf("%,.0f",c2.getRadio()); // Metodo get, llama al objeto que contiene el valor..

         Circulo c2area=new Circulo();
                c2area.setRadio(10);// otro objeto, con Metodo set, inicializado a 10. 
                System.out.print("\n- Valor del area de c2: ");
                System.out.printf("%,.0f",c2area.area()); // Metodo get, llama al objeto que contiene el valor..

        // ENTRADA:                
        Scanner usuario = new Scanner(System.in); // objeto teclado con Metodo Sanner.
        int valorc3; // Declara variable
        System.out.print("\n\n\tIntroduce un valor para el radio de c3: "); valorc3=usuario.nextInt(); // coversion del tipo.

        Circulo c3=new Circulo(); // Metodo construtor que inicializa c3 al valor introducido
                c3.setRadio(valorc3);      
                System.out.print("\n- Valor del radio de c3: ");
                System.out.printf("%,.0f",c3.getRadio()); // Metodo get, llama al objeto que contiene el valor..
               
                c3.area();
                c3.longitud();
                System.out.print("\n- Valor de area y longitud de c3: ");
                System.out.printf("%,.0f",c3.area()); // Metodo get, llama al objeto que contiene el valor..
                System.out.printf("%,.0f",c3.longitud());
     
        Circulo c5=new Circulo(); // sin paramts c1.() llegaran del set..                  
        c5.setRadio(5);           // Metodo set, reestablece el valor de radio a 5.
        System.out.print("\n- Valor del radio de c1 (nuevo): ");
        System.out.printf("%,.0f",c5.getRadio()); // llama al objeto que contiene el valor! (string..)
    
              
      }        
    }

