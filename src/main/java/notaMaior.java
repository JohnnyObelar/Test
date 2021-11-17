import java.util.Scanner;

public class notaMaior {
    public static class ExercicioMedia {
        public static void main(String args[]) {

            int n1, n2;
            Scanner cx=new Scanner(System.in);


            System.out.println("Digite o valor de n1 : ");
            n1 = cx.nextInt();
            System.out.println("Digite o valor de n2: ");
            n2 = cx.nextInt();
            int media = (n1 + n2) / 2;
            if (media >= 6) {
                System.out.println("passou");
            } else {
                System.out.println("Não passou");
            }


        }
    }


}



