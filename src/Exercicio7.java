import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");

        int x = sc.nextInt();
        System.out.print(x + " -> ");

        for (int y = x; y > 1; x --){
            if(y % 2 == 0){
                y = y/2;
                if (y == 1){
                    System.out.print(y);
                    break;
                }
                System.out.print(y + " -> ");

                continue;
            } else {
                y = 3 * y + 1;
                if (y == 1){
                    System.out.print(y);
                    break;
                }
                System.out.print(y + " -> ");
            }
        }
    }
}
