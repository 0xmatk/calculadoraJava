import java.util.Scanner;
import java.util.ArrayList;


public class Main {


    static int suma(ArrayList<Integer> numeros) {

       int suma = numeros.get(0);

        System.out.println("Tamanio: " + numeros.size());

        for (int i = 1; i < numeros.size(); i++) {
            suma = suma + numeros.get(i);
        }

        return suma;
    }

    static int resta(ArrayList<Integer> numeros) {
        int resta = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {

            resta = resta - numeros.get(i);
            System.out.println(resta);
        }

        return resta;
    }

    static int multiplicacion(ArrayList<Integer> numeros){
        int multiplicacion = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            multiplicacion = multiplicacion * numeros.get(i);
        }

        return multiplicacion;

    }

    static int division(ArrayList<Integer> numeros){
        int division =  numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
           division = division / numeros.get(i);
        }

        return division;
    }

    public static void main(String[] args) {

       Scanner recibidoTeclado = new Scanner(System.in);

        ArrayList<Character> arrayC = new ArrayList<>();
        ArrayList<Integer> arrayEnteros = new ArrayList<>();

        String str = recibidoTeclado.nextLine();


        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            arrayC.add(c);
        }

        int i = 0;

        int resta;
        int suma;
        int multi;
        int division;

        while(i < arrayC.size()){
            char c = arrayC.get(i);

              if(c == '+' || c == '-' || c == '*' || c == '/'){
                  arrayC.remove(i);
              }
                int entero = Integer.parseInt(String.valueOf(Character.getNumericValue(arrayC.get(i))));
                arrayEnteros.add(entero);
                i++;

               if(c == '+') {
                  suma = suma(arrayEnteros);
                  System.out.println("Suma: " + suma);
               }else if(c == '-'){
                   resta = resta(arrayEnteros);
                   System.out.println("Resta: " + resta);

               }else if(c == '*'){
                   multi = multiplicacion(arrayEnteros);
                   System.out.println("Multi: " + multi);
               }else if(c == '/'){
                   division = division(arrayEnteros);
                   System.out.println("Division:" + division);
               }




        }










    }
}