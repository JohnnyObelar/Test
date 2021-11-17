import java.util.Scanner;

public class nomeSobrenome {

        public static void main(String args[]) {


            // cria um objeto da classe Scanner
            Scanner entrada = new Scanner(System.in);

            System.out.print("Informe seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Seja bem-vinda(a), " + nome);

        }
    }

