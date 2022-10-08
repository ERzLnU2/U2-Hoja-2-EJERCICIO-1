# U2-Hoja-2-EJERCICIO-1
Comentar y añadir metodos a casco-porro en JAVA para obtener y modificar datos getters&amp;setters.

 * Realizar las siguientes acciones:
 
   • Documenta la clase indicando que hace cada método y atributo. 
   • Crear un objeto de la clase Circulo que se llame c1 utilizando el constructor por defecto.  
   • Crear un objeto de la clase Circulo que se llame c2 inicializando el radio a 10. 
   • Crear un objeto de la clase Circulo que se llame c3 inicializando el radio a un valor que 
     hayamos solicitado al usuario por teclado.    
   • Cambia el valor del radio del objeto c1 a 5.  
   • Muestra por pantalla el nuevo valor del radio de c1. 
   • Muestra por pantalla el valor del radio de c3.  
   • Muestra por pantalla el área dec2.
   • Muestra por pantalla el área y longitud de c3.
   
```java
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {     
        Circulo c1=new Circulo();                
                System.out.print("\n- Valor del radio de c1: ");
                System.out.printf("%,.0f",c1.getRadio());              
        Circulo c2=new Circulo();
                c2.setRadio(10); 
                System.out.print("\n- Valor del radio de c2: ");
                System.out.printf("%,.0f",c2.getRadio()); 
         Circulo c2area=new Circulo();
                c2area.setRadio(10);
                System.out.print("\n- Valor del area de c2: ");
                System.out.printf("%,.0f",c2area.area());                
        Scanner usuario = new Scanner(System.in);
        int valorc3; 
        System.out.print("\n\n\tIntroduce un valor para el radio de c3: "); valorc3=usuario.nextInt(); 
        Circulo c3=new Circulo(); 
                c3.setRadio(valorc3);      
                System.out.print("\n- Valor del radio de c3: ");
                System.out.printf("%,.0f",c3.getRadio());         
                c3.area();
                c3.longitud();
                System.out.print("\n- Valor de area y longitud de c3: ");
                System.out.printf("%,.0f",c3.area());
                System.out.printf("%,.0f",c3.longitud());
        Circulo c5=new Circulo();                 
        c5.setRadio(5);           
        System.out.print("\n- Valor del radio de c1 (nuevo): ");
        System.out.printf("%,.0f",c5.getRadio());     
      }        
    }


```
![2](https://user-images.githubusercontent.com/80227002/194725568-e290b16b-cb0d-489e-a7a8-72a8ff648022.png)

```java
public class Circulo {  
    private double radio;
    public Circulo(){   
    }
    public Circulo(double radio){ 
          this.radio=radio;   
          } 
      public double getRadio(){
          return radio;   
          }   
      public void setRadio(double radio){ 
          this.radio=radio;
          }
      public double area(){ 
          return Math.PI*Math.pow(radio, 2); 
          }
      public double longitud(){ 
          return 2*Math.PI*radio; 
          }
  }
```
