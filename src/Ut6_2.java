import java.util.*;

public class Ut6_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> contadorPalbras = new ArrayList<>();
        String palabras;

        int contador = 0;
        while (true) {

            System.out.print("> ");
            palabras = sc.next();

            if (palabras.equalsIgnoreCase("FIN")){
                break;
            }

            if (contadorPalbras.contains(palabras)){
                contador++;
            }else {
                contadorPalbras.add(palabras);
            }

        }

        sc.close();

        Collections.sort(contadorPalbras);

       for (String p : contadorPalbras){
           System.out.println( p + " -> " + contador);
       }


    }

}
