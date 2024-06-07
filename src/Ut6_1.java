import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ut6_1 {

    public static void main(String[] args) {

        System.out.println("Introduce 10 números aleatorios del 1 al 100");

        Set<Integer> numeros = new HashSet<>();

        Random random = new Random();
        int lista = (int) (Math.random()* 100 + 1);

        Scanner teclado = new Scanner(System.in);

        int num;
        int contador = 10;

        do {
            System.out.print("Quedan " + contador + ": ");
            num = teclado.nextInt();
            contador--;
            if (num > 100 || num < 1){
                System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                contador++;
            }
            if (numeros.contains(num)){
                System.out.println("REPETIDO, INTRODUCE OTRO");
                contador++;
            }

        }while (contador > 0);

        Set<Integer> numerosAleatorios = new HashSet<>();
        while (numerosAleatorios.size() < 20) {
            numerosAleatorios.add(1 + random.nextInt(100));
        }

        for (int numero : numerosAleatorios){
            System.out.println(numero + " ");
        }

        int numerosCoincidentes = 0;
        for (int n : numeros){
            if (numerosAleatorios.contains(n)){
                numerosCoincidentes++;
            }
        }

        System.out.println("Han coincidido " + numerosCoincidentes + " números");

    }

}
