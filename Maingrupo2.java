/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 * Dáriel Villatoro
 * Seongujun An 
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maingrupo2{
    
    public static void main(String args[]) { 

    }   
    class FileReader{
        
        public ArrayList<String> archivo(){
            ArrayList<String> expresion= new ArrayList<String>();
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
    
}
