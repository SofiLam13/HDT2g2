/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 * Dariel Villatoro 20776
 * Se crea la clase encargada del Stack, que implementa la interfaz Stack
 */

import java.util.*;

public class ImpStack<E> implements Stack<E> {

    /** Vector usado para el almacenamiento */
    List<E> pila = new Vector<E>();

    /**
     * Agrega un elemento a la pila
     */
    @Override
    public void add(E item) {  
        pila.add(item);
    }

    /**
     * Saca un elemnto de la pila
     */
    @Override
    public E remove() { 
        return pila.remove(size() -1);
    }

    /**
     * Revisa el valor de la ultimo dato que ha ingresado a la pila
     */
    @Override
    public E peek() {
        return pila.get(size() -1);
    }

    /**
     * Revisa si la pila esta vacia
     */
    @Override
    public boolean empty() {
        return pila.isEmpty();
    }

    /**
     * Devuelve la cantidad de elementos dentro de la pila
     */
    @Override
    public int size() {
        return pila.size();
    }

}
