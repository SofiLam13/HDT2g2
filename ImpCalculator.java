public class ImpCalculator implements Calculator {

    ImpStack<Integer> pila = new ImpStack<Integer>();

    @Override
    public double calculate(String operation) {
        // TODO Auto-generated method stub
        char[] array = operation.toCharArray();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case '+':
                    suma();
                    break;
                
                case '-':
                    resta();
                    break;

                case '*':
                    multiplicacion();
                    break;

                case '/':
                    division();
                    break;

                default:
                    int val = (int) array[i];
                    pila.add(val);
                    break;
            }
        }
        return pila.remove();
    }

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
        pila.add(a / b);
    }

}
