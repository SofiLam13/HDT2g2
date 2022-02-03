/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 */
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;
// import org.junit.Test;

import java.util.ArrayList;

public class Maingrupo2{

    public static void main(String args[]) { 
        System.out.println("Bienvenido a la Calculadora PostFix");
        System.out.println("----------------------------------------");
        System.out.println("Para empezar a realizar tus calculos, ");
        System.out.println("Por favor ingresa tu operación deseada al archivo datos.txt\n");
        System.out.println("En tu archivo datos.txt se encuentran las siguientes operaciones:");

        FileReader archivo= new FileReader();
        Calculator calculadora = new ImpCalculator();
        ArrayList<String> operaciones = archivo.archivo();

        for(int i=0; i<operaciones.size(); i++){
            String op= operaciones.get(i);
            System.out.println(op);
            Double resultado = calculadora.calculate(op);
            System.out.println("El resultado es: " + resultado);
        }
        
    }

    /**
     * Prueba del Stack
     */
    // @Test
    // public void testStack() {
    //     Stack<Double> stack = new ImpStack<Double>();
    //     assertTrue(stack.empty());
    //     stack.add(1.0);
    //     stack.add(2.0);
    //     stack.add(3.0);
    //     assertFalse(stack.empty());
    //     assertEquals(3.0,stack.remove(), 0.1);
    //     assertEquals(2.0, stack.peek(), 0.1);
    // }
   

    /**
     * Prueba de la Calculadora
     */
    // @Test
    // public void testCalc() {
    //     Calculator calc = new ImpCalculator();
    //     Double val = calc.calculate("6 4 9 7 + / 8 * -");
    //     assertEquals(26.0, val, 0.1);
    // }
    
}

