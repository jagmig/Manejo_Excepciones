import java.io.*;



public class FileNotFound {

    public static void NoEncuentraArchivo(){

        try {
            FileReader entrada = new FileReader("/user/archive/archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: Estas tratando de acceder a in fichero que no existe.");
        }

    }
}
