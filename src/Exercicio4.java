public class Exercicio4 {
    public static void main(String[] args) {
        for (int i = 0, fatorial = 1; i<=10; i++){
            if(i>1){
                fatorial *= i;
                System.out.print("(" + fatorial + "!) ");
            } else {
                System.out.print("(" + fatorial + "!) ");

            }
        }
    }
}
