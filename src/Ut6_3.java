import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ut6_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        while (true) {

            System.out.print("> ");
            String palabras = sc.next();

            if (palabras.equalsIgnoreCase("FIN")){
                break;
            }

            if (palabras.contains("A") || palabras.contains("E") || palabras.contains("I") || palabras.contains("O") || palabras.contains("U")){
                System.out.println("VOCAL");
            }

            if (palabras.startsWith(Arrays.toString(num))){
                System.out.println("DÍGITOS");
                if (palabras.contains("A") || palabras.contains("E") || palabras.contains("I") || palabras.contains("O") || palabras.contains("U")){
                    System.out.println("VOCAL");
                }
            }

            if (palabras.contains("II") || palabras.contains("III")){
                System.out.println("ROMANO");
                if (palabras.contains("A") || palabras.contains("E") || palabras.contains("I") || palabras.contains("O") || palabras.contains("U")){
                    System.out.println("VOCAL");
                }
            }


        }

    }

}
