/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 2
 * Grupo 2
 * Integrantes del grupo:
 * Sofía Lam 21548
 * Dariel Villatoro 20776
 * Se crea la clase encargada de leer los archivos de texto
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    /**Se usa para almacenar cada linea */
    ArrayList<String> expresion= new ArrayList<String>();

    /**
     * Metodo que almacena las lineas del documento.
     * @return ArrayList con las lineas del documento.
     */
    public ArrayList<String> archivo(){
        try{
            String nombre= "datos.txt";
            File myFile = new File(nombre);
            Scanner s = new Scanner(myFile);
            String linea = "";
            while (s.hasNextLine()){
                linea = s.nextLine();
                expresion.add(linea);
            }
            
        }catch(Exception e){
                String m="FileReader: leer archivo():"+ e.getMessage();
                throw new RuntimeException(m);

        }
        return expresion;
    }
}
