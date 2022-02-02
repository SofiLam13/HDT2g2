/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 * Se crea la clase encargada de la calculadora, que implementa la interfaz Calculator
 */
import java.util.*;
public class Calculadorag2 implements Calculator, Stack {
    //Se crean algunos de los atributos a utilizar como el vector
    Vector vector= new Vector<>(3, 1);

    /**
     * Se modifica el método de la interfaz calculator para las operaciones del Postfix
     */
    public double calculate(String operation){
        if(operation=="+"){
            // en caso de que la operación sea una suma
        } else if(operation=="-"){
            // en caso de que la operación sea una resta
        }else if (operation=="*"){
            // en caso de que la operación sea una multiplicación
        } else if(operation=="/"){
            // en caso de que la operación sea una división
        }
        return 0;

    }

    /**
     * Se modifica el método que agrega elementos al stack
     */
    @Override
    public void add(Object item) {
        vector.addElement(item);
    }

    /**
     * Se modifica el método que elimina elementos al stack
     */
    @Override
    public Object remove() {
        vector.removeElement(vector);
        return null;
    }
    /**
     * Se modifica el método que accede al pico del stack
     */
    @Override
    public Object peek() {
        
        return null;
    }

    /**
     * Se modifica el método que indica si el stack está o no vacío
     */
    @Override
    public boolean empty() {
        boolean e=false;;
        if(vector.size()==0){
            e=true;
        }
        return e;
    }
   /**
     * Se modifica el método que indica el tamaño del stack
     */
    @Override
    public int size() {
        int t= vector.size();
        return t;
    }

}
