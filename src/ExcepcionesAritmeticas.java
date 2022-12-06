

public class ExcepcionesAritmeticas {

    public static void division()  {

        int resultado= 5;

        try {
           resultado = resultado/ 0;

        }catch (ArithmeticException e){

            System.out.println("Esto es una ArithmeticException a causa de una divsión entre cero ");

            resultado = resultado/1;

        }

        System.out.println("El programa no cae, la división correcta es " + resultado);


    }

}
