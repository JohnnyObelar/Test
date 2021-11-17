import java.util.Scanner;

public class valorMaior {
        public static void main(String args[]) {

            int x, y;
            Scanner cx=new Scanner(System.in);

            System.out.println("Digite o valor de x: ");
            x = cx.nextInt();
            System.out.println("Digite o valor de y: ");
            y = cx.nextInt();

            if (x > y) {
                System.out.println("x é maior");
            } else if (x < y){
                System.out.println("Y é maior");
            } else
                System.out.println("X e Y são iguais");
        }


}
