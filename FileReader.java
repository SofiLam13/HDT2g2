import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    ArrayList<String> expresion= new ArrayList<String>();

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
