/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maingrupo2{

    public static void main(String args[]) { 
        System.out.println("Bienvenido a la Calculadora PostFix");
        System.out.println("----------------------------------------");
        System.out.println("Para empezar a realizar tus calculos, ");
        System.out.println("Por favor ingresa tu operación deseada al archivo datos.txt");
        System.out.println("");
        System.out.println("En tu archivo datos.txt se encuentran las siguientes operaciones:");
        FileReader a= new FileReader();
        ArrayList<String> m = a.archivo();
        for(int i=0; i<m.size(); i++){
            String s= m.get(i);
            System.out.println(s);
        }
        
    } 
   
    
}

