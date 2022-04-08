import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor limite da fatorial: ");
        int valor = sc.nextInt();
        sc.close();
        for (long i = 0, fatorial = 1; i<=valor; i++){
            if(i>1){
                fatorial *= i;
                System.out.print("(" + fatorial + "!) ");
            } else {
                System.out.print("(" + fatorial + "!) ");

            }
        }
    }
}
