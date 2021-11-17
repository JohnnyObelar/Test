import java.util.Scanner;

public class Area {
        public static void main(String args[]) {

            int base, altura;

            Scanner cx=new Scanner(System.in);


            System.out.println("Digite o valor da base: ");
            base = cx.nextInt();
            System.out.println("Digite o valor da altura: ");
            altura = cx.nextInt();
            int area = (base * altura) / 2;
            System.out.println("o valor da area é:" + area);
        }

    }

