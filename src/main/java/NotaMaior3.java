import java.util.Scanner;

public class NotaMaior3 {
        public static void main(String args[]) {

            int n1, n2, n3;
            Scanner cx=new Scanner(System.in);
            System.out.println("Digite o valor de n1: ");
            n1 = cx.nextInt();
            System.out.println("Digite o valor de n2: ");
            n2 = cx.nextInt();
            System.out.println("Digite o valor de n3: ");
            n3 = cx.nextInt();


            if((n1 > n2) && (n1 > n3)){
                System.out.println("N1 é o maior");
            }

            else if((n2 > n1) && (n2 > n3)){
                System.out.println("N2 é o maior");
            }

            else if((n3 > n1) && (n3 > n2)){
                System.out.println("N3 é o maior");
            }

            System.out.println("\n");
        }
    }

