import java.util.Scanner;

public class Variaveis1E2 {
        public static void main(String args[]) {

            String nome1, nome2, frase;
            Scanner LeroQueFoiDigitado = new Scanner(System.in);

            nome1 = " é o mestre do universo";
            nome2 = "";
            System.out.println("Exercicio troca de valores variaveis");
            System.out.println("Qual seu nome?M ");
            nome2 = LeroQueFoiDigitado.nextLine();
            frase = nome2;
            nome2 = nome1;
            nome1 = frase;
            System.out.println(nome1 + nome2);
        }

}
