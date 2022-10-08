/**
 * @author Daw120
 */
package com.solomongo.ejercicio2;
public class Circulo {
  
    private double radio;
  
    public Circulo(){   // Metodo: constructor predefinido (sin valores), inicializa la Clase
    }
    public Circulo(double radio){ // Metodo: constructor, inicializa la variable(this.radio) con un valor (de radio en decimal) 
          this.radio=radio; // asigna el valor radio a instancia del objeto(this.radio)  
          }
   
    
      public double getRadio(){ // Metodo: get, para obtener valores del objeto, retorna valor: radio
          return radio;   
          }
      
      public void setRadio(double radio){ // Metodo set, para establecer un valor y poder asignarlo a un objeto
          this.radio=radio;
          }
    
      public double area(){ // Metodo area, creado para pasar el valor de la formula..
          return Math.PI*Math.pow(radio, 2); // de otro metodo: PI, para el calculo del valor.
          }
      
      public double longitud(){ // Metodo longitud, en decimal double: devuelve el valor..
          return 2*Math.PI*radio; // del metodo PI del metodo: MATH, asignando el valor de la formula.
          }
      
  
  }
    
    
    
    
