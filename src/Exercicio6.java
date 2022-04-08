public class Exercicio6 {
    public static void main(String[] args) {
        long fibonacci = 1;
        long anterior = 0;
        for (int i = 0; fibonacci <= 100; i++){
            if (i < 1){
                System.out.print( i + " ");
                anterior = 1;
            } else {
                System.out.print( fibonacci + " ");
                anterior = fibonacci - anterior;
                fibonacci = anterior + fibonacci;


            }
            
        } 
        
    }
}
