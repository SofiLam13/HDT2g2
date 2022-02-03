/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 * Dariel Villatoro 20776
 * Se crea la clase encargada de la calculadora, que implementa la interfaz Calculator
 */

public class ImpCalculator implements Calculator {

    //Se crea el stack para manejar las operaciones
    Stack<Integer> pila = new ImpStack<Integer>();

    @Override
    public double calculate(String operation) {
        String[] array = operation.split(" ");
        if (array.length < 2) {
            System.out.println("Error, no hay suficientes argumentos.");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "+":
                    suma();
                    break;
                
                case "-":
                    resta();
                    break;

                case "*":
                    multiplicacion();
                    break;

                case "/":
                    division();
                    break;

                default:
                    try {
                        int val = Integer.parseInt(array[i]);
                        pila.add(val);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: No se ha recivido un numero");
                        System.exit(0);
                    }
                    
            }
        }
        return pila.remove();
    }

    /**
     * Los siguentes metodos realizan las operaciones basicas tomando
     * los ultimos elemento que hayan entrado al stack
     */
    private void suma (){
        int a = pila.remove();
        int b = pila.remove();
        pila.add(a + b);
    }

    private void resta (){
        int a = pila.remove();
        int b = pila.remove();
        pila.add(a - b);
    }

    private void multiplicacion (){
        int a = pila.remove();
        int b = pila.remove();
        pila.add(a * b);
    }

    private void division (){
        int a = pila.remove();
        int b = pila.remove();
        if (b == 0) {
            System.out.println("Error: Divisio por cero.");
            System.exit(0);
        }
        pila.add(a / b);
    }

}
