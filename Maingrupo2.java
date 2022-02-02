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
  
    class FileReader{
        ArrayList<String> expresion= new ArrayList<String>();
        public ArrayList<String> archivo(){
            try{
                String nombre= "datos.txt";
                File myFile = new File(nombre);
                Scanner s=new Scanner(myFile);
                String linea="";
                while (s.hasNextLine()){
                    linea=s.nextLine();
                    expresion.add(linea);
                }
                
            }catch(Exception e){
                    String m="FileReader: leer archivo():"+ e.getMessage();
                    throw new RuntimeException(m);

            }
            return expresion;
        }
    }
    public static void main(String args[]) { 
        System.out.println("Bienvenido a la Calculadora PostFix");
        System.out.println("----------------------------------------");
        System.out.println("Para empezar a realizar tus calculos, ");
        System.out.println("Por favor ingresa tu operación deseada al archivo datos.txt");
        System.out.println("");
        System.out.println("En tu archivo datos.txt se encuentran las siguientes operaciones:");
       // FileReader a= new FileReader();
       // a.archivo();
       // ArrayList<String>m=a.expresion;
        //for(int i=0; i<m.size(); i++){
       //     string s= expresion.get(i)
        //    System.out.println(s)
       // }
        
    } 
   
    
}

