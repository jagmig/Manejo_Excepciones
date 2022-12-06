public class ArrayIndexOutOfBounds {

    public static void IndexOutOfBounds(){

        int numeros [] ;
        numeros = new int[6];

        try {
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 4;
            numeros[4] = 5;
            numeros[5] = 6;
            numeros[6] = 7;

        }catch (IndexOutOfBoundsException e){

            System.out.println("Esto es una IndexOutOfBoundsExceptionNo se puede meter 7 números en un array de 6");
        }

    }
}
